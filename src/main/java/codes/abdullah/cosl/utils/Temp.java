package codes.abdullah.cosl.utils;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelCellName;

class Temp {
	@ExcelCell(0)
	String s;
	
	@Override
	public String toString() {
		return s;
	}
}
