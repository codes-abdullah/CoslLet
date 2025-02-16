package codes.abdullah.cosl.ui.module.pob;

public class Position {
	private String title;
	private PositionCode code;
	private Shift shift;

	public PositionCode getCode() {
		return code;
	}

	public void setCode(PositionCode code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

}
