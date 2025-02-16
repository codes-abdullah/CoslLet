package codes.abdullah.cosl.ui.module.pob;

public enum Shift {

	D0618("Day (6/6)"), N1806("Night (6/6)"), D0012("Day (12/12)"), N1200("Night (12/12)"), D0719("Day (7/7)"),
	N1907("Night (7/7)");

	private String text;

	private Shift(String string) {
		this.text = string;
	}
	
	public String getText() {
		return text;
	}
	

    public static Shift fromString(String text) {
    	text = text.trim().replaceAll("[\s]+", " ");
        for (Shift b : Shift.values()) {
            if (b.text.equalsIgnoreCase(text)) {
                return b;
            }
        }

        //=========================
        // try again without spaces
        //=========================
        text = text.trim().replaceAll("[\s]+", "");
        for (Shift b : Shift.values()) {
            if (b.text.replaceAll("[\s]+", "").equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new UnsupportedOperationException("can't find: "+text);
    }
}
