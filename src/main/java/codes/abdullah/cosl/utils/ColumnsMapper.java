package codes.abdullah.cosl.utils;

import java.nio.file.Path;
import java.util.List;

public class ColumnsMapper {
	private boolean accepted;
	private int superiorColumnIndex;
	private int inferiorColumnIndex;
	private List<Column> col;

	public ColumnsMapper(boolean accepted, int superiorColumnIndex, int inferiorColumnIndex, List<Column> col) {
		super();
		this.accepted = accepted;
		this.superiorColumnIndex = superiorColumnIndex;
		this.inferiorColumnIndex = inferiorColumnIndex;
		this.col = col;
	}

}
