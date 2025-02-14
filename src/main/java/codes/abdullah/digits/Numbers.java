package codes.abdullah.digits;

public class Numbers {
	Numbers() {

	}

	/**
	 * i.e: <b>num = 8</b>, <b>range = 10 (means 10 zeros)</b> return String
	 * <b>0000000008</b>
	 */
	public String considerZeroing(Number num, Number range) {
		StringBuilder sb = new StringBuilder("");
		range = Math.abs(range.longValue());
		long rangeLength = range.longValue() - ("" + num).length();
		for (int i = 0; i < rangeLength; i++)
			sb.append("0");
		sb.append("" + num);
		return sb.toString();
	}
}
