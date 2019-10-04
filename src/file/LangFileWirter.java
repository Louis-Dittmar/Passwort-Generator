package file;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import main.var;

public class LangFileWirter {

	public LangFileWirter() {

	}

	public static void LangGerWriter() {

		try {
			XMLEncoder o = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(var.K_File_de_DE)));

			o.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void LangEngWriter() {

		try {
			XMLEncoder o = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(var.K_File_en_EN)));

			o.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
