package codes.abdullah.cosl.ui.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.slf4j.Logger;

import codes.abdullah.cosl.MainCLI;

public class FileUtils {
	public static final Logger log = MainCLI.log;
	public static void createDirsIfNotExists(Path p) throws IOException {
		if (Files.exists(p))
			return;
		Files.createDirectories(p);
		log.debug(p.toString());
	}
	
	
}
