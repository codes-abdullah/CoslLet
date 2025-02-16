package codes.abdullah.cosl.r;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import codes.abdullah.cosl.utils.Utils;

public class R {
	public static class strings {
		public static class text {

		}

		public static class error {

		}

		public static class title {

		}

		public static class status {

		}

	}

	public static class keys {
		public static final String LAST_WORD_IN_POB_TO_STOP_LOOKING = "COMPANY NAME 7";

	}

	public static class companies {
		public static final String COSL_MIDDLE_EAST_FZE_CME = "COSL Middle East FZE (CME)";
		public static final String COSL_DRILLING_SAUDI = "COSL DRILLING SAUDI";
		public static final String COSL_NEXUS_OR_OLYMPUS = "COSL - NEXUS or OLYMPUS";
		public static final String COSL_THIRD_PARTY_CATERING = "COSL THIRD PARTY CATERING";
		public static final String COSL_THIRD_PARTY = "COSL THIRD PARTY";
		public static final String ARAMCO_THIRD_PARTY = "ARAMCO THIRD PARTY";

		public static final String ARAMCO = "ARAMCO";
		public static final String COSL_CME = "COSL-CME";
		public static final String COSL_SAUDI = "COSL-SAUDI";

	}

	public static class patterns {
		public static final Pattern SPECIAL_REGEX_CHARS = Pattern.compile("[{}()\\[\\].+*?^$\\\\|]");

		public static final String POB_FILENAME = "CHR_POB_([\\d]{4}-[\\d]{2}-[\\d]{2}).xlsx";
		public static final String COMPANIES_CATEGOIES = Utils.escapeAndJoin("|", companies.ARAMCO,
				companies.COSL_MIDDLE_EAST_FZE_CME, companies.COSL_DRILLING_SAUDI, companies.COSL_NEXUS_OR_OLYMPUS,
				companies.COSL_THIRD_PARTY_CATERING, companies.COSL_THIRD_PARTY, companies.ARAMCO_THIRD_PARTY);
		public static final String EMPLOYEE_CATEGORY = Utils.escapeAndJoin("|", companies.COSL_MIDDLE_EAST_FZE_CME,
				companies.COSL_DRILLING_SAUDI, companies.COSL_NEXUS_OR_OLYMPUS);

	}

	public class paths {
		public static final Path APP_DIR = Paths.get(System.getProperty("user.home") + "/Coslet");
		public static final Path POB_DIR = Paths.get(System.getProperty("user.home") + "/Coslet/POB");
	}

	public static class resources {
		public static class fxml {
			public static final String STOP_TRACKER = "/fxml/stop_tracker.fxml";
			public static final String HOME = "/fxml/home.fxml";

		}

	}

}
