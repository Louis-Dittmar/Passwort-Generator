package org.passwort.file;

import java.io.File;
import java.io.IOException;

public class FileCreator {

	public static File DataFolder = new File("");
	public static File MasterFile = new File("src/data/Master.xml");

	public static void CreateDataFolder() {

		if (!DataFolder.exists()) {

			DataFolder.mkdirs();
		}

	}

	public static void MasterCreator() {

		if (!MasterFile.exists()) {

			try {
				MasterFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
