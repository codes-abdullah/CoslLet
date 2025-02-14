package codes.abdullah.cosl.r;

import java.nio.file.Path;
import java.nio.file.Paths;

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
	public static class patterns {
		public static final String POB_FILENAME = "CHR_POB_([\\d]{4}-[\\d]{2}-[\\d]{2}).xlsx";
		
	}
	
	public class paths {
		public static final Path APP_DIR = Paths.get(System.getProperty("user.home")+"/Coslet");
		public static final Path POB_DIR = Paths.get(System.getProperty("user.home")+"/Coslet/POB");
	}

	public static class resources {
		public static class fxml {
			public static final String STOP_TRACKER = "/fxml/stop_tracker.fxml";
			public static final String HOME = "/fxml/home.fxml";

		}

	}

}
