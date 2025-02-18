package codes.abdullah.cosl.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Matrix implements Iterator<String> {
	private List<Column> cols;
	private int currentIndex;
	private ColumnsMapper cm;

	Matrix(List<Column> columns, ColumnsMapper cm) {
		cols = columns;
		this.cm = cm;
		Column prev = null;

		for (int i = cols.size() - 1; i >= 0; i--) {
			cols.get(i).setName("c-" + i);
			cols.get(i).setInfinite(true);
			if (prev != null)
				prev.setParent(cols.get(i));
			prev = cols.get(i);
		}

		cols.getFirst().setInfinite(false);

	}

	@Override
	public boolean hasNext() {
		return cols.getFirst().hasNext();
	}

	@Override
	public String next() {
		StringJoiner sj = new StringJoiner("");
		for (Column c : cols) {
			sj.add(c.getCurrent());
		}
		cols.getLast().next();
		currentIndex++;
		return sj.toString();
	}

	public int getTotal() {
		int total = 1;
		for (int i = 0; i < cols.size(); i++) {
			total *= cols.get(i).length();
		}
		return total;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	private static String cap(String s) {
		s = s.toLowerCase();
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	@Override
	public String toString() {
		String s = "";

		for (int i = 0; i < cols.size(); i++) {
			s += cols.get(i).toString() + "\n";
		}
		return s;
	}

	// ADG

	// BEH
	// CFI
	public static void main(String[] args) throws Exception {
//		Column a = new Column("ABC123".split(""), false);
//		Column b = new Column("DEF4".split(""), false);
//		Column c = new Column("G".split(""), false);
//
//		Matrix m = new Matrix(new Column[] { a, b, c });

		Path p = Paths
				.get("C:\\dev\\eclipse\\jse\\default\\workspace\\CoslLet\\src\\main\\resources\\matrix\\RSB.xlsx");
		p = Paths.get("C:\\Users\\hsehtr\\Documents\\fax\\pattern1.xlsx");

		Matrix m = of(p, 2, 0);
		while (m.hasNext()) {
			System.out.println(m.getCurrentIndex() + ":" + m.next());
		}
//		System.out.println(m);
	}


}
