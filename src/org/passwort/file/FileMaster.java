package org.passwort.file;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.passwort.main.var;

public class FileMaster {

	public static void WriteMaster() {

		if (FileCreator.MasterFile.exists()) {

			try {
				XMLEncoder o = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("scr/data/Master.xml")));

				o.writeObject(var.MasterPasswortStatus);
				o.writeObject(var.MasterPass);

				o.close();
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
		} else {
			FileCreator.MasterCreator();

		}

	}

	public static void ReadMaster() {

		try {
			XMLEncoder o = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("scr/data/Master.xml")));

			System.out.println(o.get(var.MasterPasswortStatus));
			System.out.println(o.get(var.MasterPass));
			var.MasterPassLoad = o.get(var.MasterPass);

			o.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
