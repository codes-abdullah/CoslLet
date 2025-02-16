package codes.abdullah.cosl;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import codes.abdullah.cosl.r.R;
import codes.abdullah.cosl.ui.utils.FileUtils;
import codes.abdullah.cosl.utils.POB;



public class MainCLI {
//	public static final Path APP_DIR = Paths.get(System.getProperty("user.home")).resolve("CoslLet");
	public static final Logger log = LoggerFactory.getLogger(MainCLI.class);
	public static void main(String[] args) throws Exception {
		
		
		FileUtils.createDirsIfNotExists(R.paths.APP_DIR);
		FileUtils.createDirsIfNotExists(R.paths.POB_DIR);
//		POB.loadPobs(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 2));
		MainFX.main(args);
	}

}
