package file;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import main.var;

public class MainFileWirter {

	public static void FolderDateiSaver() {

		if (FileCreator.InternalFile.exists()) {

			try {
				XMLEncoder o = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(var.InternFile)));

				o.writeObject(var.AdminPasswort);

				o.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		} else {
			FileCreator.InternFile();
		}

	}

}
