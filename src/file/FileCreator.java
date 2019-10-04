package file;

import java.io.File;
import java.io.IOException;

import main.var;

public class FileCreator {

	// Folder
	public static File FileMainFolder = new File(var.K_FileMainFolder);
	public static File FileLangFolder = new File(var.K_FileLangFolder);

	// Files
	public static File File_de_DE = new File(var.K_File_de_DE);
	public static File File_en_EN = new File(var.K_File_en_EN);

	public FileCreator() {

	}

	public static void MainFolder() {

		if (!FileMainFolder.exists()) {
			FileMainFolder.mkdirs();
		}

	}

	public static void LangFolder() {

		if (!FileLangFolder.exists()) {

			if (FileMainFolder.exists()) {
				FileLangFolder.mkdirs();

			} else {

				MainFolder();
			}

		}

	}

	public static void LangGer() {

		if (!File_de_DE.exists()) {

			if (FileLangFolder.exists()) {

				try {
					File_de_DE.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else {
				LangFolder();

			}

		}

	}

	public static void LangEng() {

		if (!File_en_EN.exists()) {

			if (FileLangFolder.exists()) {

				try {
					File_en_EN.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else {
				LangFolder();

			}

		}

	}

}
