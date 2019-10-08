package org.passwort.file;

import java.io.File;

public class FileCreator {

	public static File DataFolder = new File("");

	public static void CreateDataFolder() {
		
		if (!DataFolder.exists()) {
			
			DataFolder.mkdirs();
		}

	}

}
