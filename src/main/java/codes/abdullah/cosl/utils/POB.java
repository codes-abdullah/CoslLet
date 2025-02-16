package codes.abdullah.cosl.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.poiji.annotation.ExcelCellName;
import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;
import com.poiji.option.PoijiOptions;

import codes.abdullah.cosl.r.R;
import codes.abdullah.cosl.ui.module.pob.Company;
import codes.abdullah.cosl.ui.module.pob.Employee;
import codes.abdullah.cosl.ui.module.pob.Id;
import codes.abdullah.cosl.ui.module.pob.Person;
import codes.abdullah.cosl.ui.module.pob.Pob;
import codes.abdullah.cosl.ui.module.pob.Position;
import codes.abdullah.cosl.ui.module.pob.PositionCode;
import codes.abdullah.cosl.ui.module.pob.Rig;
import codes.abdullah.cosl.ui.module.pob.Shift;
import codes.abdullah.digits.Digits;

public class POB {


	public static void loadPobs(LocalDate from, LocalDate to) throws IOException {
		
		

		
		Set<Path> files = new HashSet<Path>();
		Files.newDirectoryStream(R.paths.POB_DIR, new DirectoryStream.Filter<Path>() {
			@Override
			public boolean accept(Path e) throws IOException {
				String fn = e.getFileName().toString();
				if (fn.matches(R.patterns.POB_FILENAME)) {
					Pattern p = Pattern.compile(R.patterns.POB_FILENAME, Pattern.DOTALL);
					Matcher m = p.matcher(fn);
					m.find();
					String date = m.group(1);
					LocalDate ld = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
					return (ld.isEqual(from) || ld.isAfter(from)) && ld.isBefore(to);
				}
				return e.getFileName().toString().matches(R.patterns.POB_FILENAME);
			}

		}).forEach(p -> {
			files.add(p);
		});

		System.out.println(R.patterns.COMPANIES_CATEGOIES);
		for (Path file : files) {
			PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().headerStart(12).build();
			InputStream stream = new FileInputStream(file.toFile());
			List<DummyPerson> dummypob = Poiji.fromExcel(stream, PoijiExcelType.XLSX, DummyPerson.class, options).stream()
					.collect(Collectors.toList());
			
			List<DummyPerson> dummypob2 = new ArrayList<POB.DummyPerson>();
			String currentCompanyCategory = null;
			for (int i = 0; i < dummypob.size(); i++) {
				DummyPerson dp = dummypob.get(i);
				if(dp.no != null) {
					if(dp.no.equals(R.keys.LAST_WORD_IN_POB_TO_STOP_LOOKING))
						break;
					if(!Digits.ints.isValid(dp.no)) {
						if(dp.no.matches(R.patterns.COMPANIES_CATEGOIES)) {
							currentCompanyCategory = dp.no;
							continue;
						}						
						throw new IllegalStateException("undefined: "+dp.no);
					}
					dp.companyCategory = currentCompanyCategory;
					dummypob2.add(dp);
				}
			}
			


			
			//=========================
			
			
			// ========================
			// load the file manually and check if the total pob equals the loaded
			// by poiji
			// ========================
			FileInputStream fis = new FileInputStream(file.toFile());
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();

			CellValue cellValue = getCell(sheet, evaluator, "L5");
			int totalPob = (int) cellValue.getNumberValue();
			wb.close();
			if (dummypob2.size() != totalPob) {
				throw new IllegalStateException(file.toString() + ", " + dummypob2.size() + " vs " + totalPob);
			}


			
			// ========================

			Set<Person> all = new HashSet<Person>();
			for (DummyPerson dp : dummypob2) {
				
				//============
				//===========
				Id id = new Id();
				id.setNumber(dp.id);				
				// =============
				Company company = new Company();
				company.setCategory(currentCompanyCategory);
				company.setName(dp.company);
				// =============
				Shift shift = Shift.fromString(dp.shift);
				// =============
				Position position = new Position();
				position.setShift(shift);
				position.setTitle(dp.position);
				
				position.setCode(findPositionCode(dp.position, dp.company, dp.companyCategory));
				// =============
				Rig rig = new Rig();
				rig.setArrivalDate(LocalDate.parse(dp.dateOnRig, DateTimeFormatter.ofPattern("d-MMM-yy")));
				rig.setLifeboat(dp.lifeboat);
				rig.setName("HUNTER");
				rig.setRoom(Digits.ints.parse(dp.room));
				
				// =============
				Person person = dp.companyCategory.matches(R.patterns.EMPLOYEE_CATEGORY) ? new Employee() : new Person();
				Person supervisor = new Person();
				person.setName(dp.name);
				person.setCompany(company);
				person.setNationality(dp.nationality);
				person.setSupervisor(supervisor);
				// =============
				
				// =============
				all.add(person);
				// ==========
				
			}
			//=============
			LocalDate date = getDate(sheet, "L11");
			Pob pob  = new Pob();
			pob.setAll(all);
			pob.setDate(date);
			
		}

		System.out.println("all done");

//		PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().headerStart(12).build();
//		InputStream stream = new FileInputStream(R.paths.POB_DIR.resolve("a.xlsx").toFile());
//		List<A> a = Poiji.fromExcel(stream, PoijiExcelType.XLSX, A.class, options);

//		System.out.println(a);
	}

	private static CellValue getCell(Sheet sheet, FormulaEvaluator evaluator, String ref) {
		CellReference cellReference = new CellReference(ref);
		Row row = sheet.getRow(cellReference.getRow());
		Cell cell = row.getCell(cellReference.getCol());
		return evaluator.evaluate(cell);
	}

	private static LocalDate getDate(Sheet sheet, String ref) {
		CellReference cellReference = new CellReference(ref);
		Row row = sheet.getRow(cellReference.getRow());
		Cell cell = row.getCell(cellReference.getCol());
		Date date = cell.getDateCellValue();
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public static class A {
		@ExcelCellName("num")

		String num;
		@ExcelCellName("name")

		String name;
		@ExcelCellName("pos")

		String pos;

		public A() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "A [num=" + num + ", name=" + name + ", pos=" + pos + "]";
		}

	}

	public static class DummyPerson {
		public String companyCategory;
		@ExcelCellName("No")
		String no;
		@ExcelCellName("Room")
		String room;
		@ExcelCellName("Name")
		String name;
		@ExcelCellName("Position")
		String position;
		@ExcelCellName("Company")
		String company;
		@ExcelCellName("SHIFT")
		String shift;
		@ExcelCellName("L/B")
		int lifeboat;
		@ExcelCellName("Nationality")
		String nationality;
		@ExcelCellName("PASSPORT\r\n Or IC NO.")
		String id;
		@ExcelCellName("Medical Due Date")
		String medicalDueDate;
		@ExcelCellName("BOSIET  Due Date")
		String bosietDueDate;
		@ExcelCellName("Evacuation Order")
		String evacuationOrder;
		@ExcelCellName("Date On Rig")
		String dateOnRig;
		@ExcelCellName("DOB")
		String dob;
		@Override
		public String toString() {
			return "DummyPerson [companyCategory=" + companyCategory + ", no=" + no + ", room=" + room + ", name="
					+ name + ", position=" + position + ", company=" + company + ", shift=" + shift + ", lifeboat="
					+ lifeboat + ", nationality=" + nationality + ", id=" + id + ", medicalDueDate=" + medicalDueDate
					+ ", bosietDueDate=" + bosietDueDate + ", evacuationOrder=" + evacuationOrder + ", dateOnRig="
					+ dateOnRig + ", dob=" + dob + "]";
		}

		

	}
	
	
	private static PositionCode findPositionCode(String position, String company, String companyCategory) {
		if (company.equalsIgnoreCase(R.companies.ARAMCO))
			return PositionCode.CLIENT;
		else if (companyCategory.equalsIgnoreCase(R.companies.COSL_THIRD_PARTY))
			return PositionCode.COSL_SERVICE;
		else if (companyCategory.equalsIgnoreCase(R.companies.COSL_THIRD_PARTY_CATERING))
			return PositionCode.CATERING;
		else if (companyCategory.equalsIgnoreCase(R.companies.ARAMCO_THIRD_PARTY))
			return PositionCode.CLIENT_SERVICE;
		return PositionCode.fromString(position);
	}
	
	

}
