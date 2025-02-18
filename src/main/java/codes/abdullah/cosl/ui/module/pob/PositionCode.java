package codes.abdullah.cosl.ui.module.pob;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringJoiner;

import codes.abdullah.cosl.r.R;

public enum PositionCode {
	COMAN("Foreman(D)","Foreman(N)"),//
	OIM("Rig Superintendent","OIM"),//
	BE("Barge Master","Barge Captin","Barge Engineer"),//
	TP("Toolpusher (D)","Toolpusher (N)"),//
	ES("Equipment Supervisor"),//
	ET("Electronics Techician"),//
	MECH("Chief Mechanic"),//
	ELEC("Chief Electrician"),//
	AMECH("Mechanic","Assistant Mechanic"),//
	DRL("Driller"),//
	AD("Assistant Driller"),//
	SK("MATCO"),//
	HSEA("HSEA","HSE Advisor"),//
	DFM("Deck Foreman"),//
	AELEC("Electrician","Assistant Electrician"),//
	DKM("Derrickman","Pump Man"),//
	FLH("Floorman"),//
	RSB("Roustabout","Scaffolder"),//
	RO("Radio Operator"),//
	CO("Crane Operator"),//
	MTM("Motorman"),//
	WLD("Welder"),//
	MEDIC("Rig Medic"),//
	CLIENT(),//
	CLIENT_SERVICE(),//
	COSL_SERVICE(),//
	CATERING();



	private final String[] arr;

	private PositionCode(String... arr) {
		this.arr = arr;
	}

	public static PositionCode fromString(String position) {
		position = position.trim().replaceAll("[\s]+", " ");
		for (PositionCode b : PositionCode.values()) {
			for (int i = 0; i < b.arr.length; i++) {
				if (b.arr[i].equalsIgnoreCase(position)) {
					return b;
				}
			}
		}

		throw new UnsupportedOperationException("cant find: " + position);
	}

	public static void main(String[] args) throws IOException {
		List<String> ll = Files.readAllLines(Paths.get(
				"C:\\dev\\eclipse\\jse\\default\\workspace\\CoslLet\\src\\main\\resources\\position-code-mapping"));
		for (int x = 0; x < ll.size(); x++) {
			String line = ll.get(x);
			String[] arr = line.split("[=]");
			String key = arr[0];
			String positions[] = null;
			if (arr.length == 1) {
				positions = new String[] {};
			} else {
				positions = arr[1].split("[,]");
			}
			StringJoiner sj = new StringJoiner(",");
			for (int i = 0; i < positions.length; i++) {
				sj.add("\"" + positions[i] + "\"");
			}
			System.out.printf("%s(%s)", key.toUpperCase(), sj);
			if (x + 1 < ll.size()) {
				System.out.println(",//");
			}
		}
		System.out.println(";");

	}
}
