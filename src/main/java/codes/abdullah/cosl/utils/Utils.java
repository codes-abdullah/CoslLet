package codes.abdullah.cosl.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.poiji.annotation.ExcelCellName;

import codes.abdullah.cosl.r.R;

public class Utils {
	public static String escapeSpecialRegexChars(String str) {
		return R.patterns.SPECIAL_REGEX_CHARS.matcher(str).replaceAll("\\\\$0");
	}

	public static String escapeAndJoin(String delim, String... args) {
		StringJoiner sj = new StringJoiner(delim);
		for (String s : args) {
			sj.add(escapeSpecialRegexChars(s));
		}
		System.out.println(sj);
		return sj.toString();
	}

	public static void main(String[] args) {
		String s = "behave	methods	people	verb	verbhelp	tools	behaviour	thanks	for	final01	final02	location";
		String[] ss = s.split("[\t]");
		for (int i = 0; i < ss.length; i++) {
			System.out.printf("@ExcelCellName(\"%s\")\nprivate String %s;\n", ss[i], ss[i]);

		}
		System.out.println(Arrays.toString(ss));
	}

	public static Matrix newMatrix(Path p, int sheetIndex, String mapperSheetName, int skipRows) throws IOException {
		List<Column> cols = Collections.unmodifiableList(loadColumns(p, sheetIndex, skipRows));
		String[] ss = mapperSheetName.split("[>=]");
		int superiorIndex = Integer.parseInt(ss[0]);
		int inferiorIndex = Integer.parseInt(ss[1]);
		boolean aceepted = ss[2].equals("o");
		ColumnsMapper cm = new ColumnsMapper(aceepted, superiorIndex, inferiorIndex, cols);
		return new Matrix(cols, cm);
	}

	public static ColumnsMapper newColumnsMapper(Path p, String sheetName, int skipRows) throws IOException {
		String[] ss = sheetName.split("[>=]");
		int superiorIndex = Integer.parseInt(ss[0]);
		int inferiorIndex = Integer.parseInt(ss[1]);
		boolean aceepted = ss[2].equals("o");
		List<Column> cols = loadColumns(p, sheetName, skipRows);
		return new ColumnsMapper(aceepted, superiorIndex, inferiorIndex, cols);
	}

	public static List<Column> loadColumns(Path p, String sheetName, int skipRows) throws IOException {
		try (Workbook wb = new XSSFWorkbook(new FileInputStream(p.toFile()))) {
			Sheet sheet = wb.getSheet(sheetName);
			return loadColumns(sheet, skipRows);
		}
	}

	public static List<Column> loadColumns(Path p, int sheetIndex, int skipRows) throws IOException {
		try (Workbook wb = new XSSFWorkbook(new FileInputStream(p.toFile()))) {
			Sheet sheet = wb.getSheetAt(sheetIndex);
			return loadColumns(sheet, skipRows);
		}
	}

	public static List<Column> loadColumns(Sheet sheet) throws IOException {
		return loadColumns(sheet, 0);
	}

	public static List<Column> loadColumns(Sheet sheet, int skipRows) throws IOException {
		int columnsCount = sheet.getRow(0).getPhysicalNumberOfCells();
		List<Column> cols = new ArrayList<>();
		for (int i = 0; i < columnsCount; i++) {
			List<String> rows = new ArrayList<String>();
			for (int rowIndex = skipRows; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
				Row row = sheet.getRow(rowIndex);
				if (row != null) {
					Cell cell = row.getCell(i);
					if (cell != null) {
						String v = cell.getStringCellValue();
						rows.add(v);
					}
				}
			}

			// trim column
			for (int j = 0; j < rows.size(); j++) {
				if (rows.get(j).trim().isEmpty()) {
					rows.remove(j);
					j--;
				}

			}
			cols.add(new Column(rows.toArray(new String[rows.size()]), false));
		}

		return cols;
	}
}
