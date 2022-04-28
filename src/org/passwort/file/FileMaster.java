package org.passwort.file;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.passwort.main.var;

public class FileMaster {

    /**
     * This file is no longer needed as the project was never completed.
     * It should store and read the master password in a file.
     * However, this is not recommended as the contents of the file are not encrypted.
     * <p>
     * Diese Datei wird nicht mehr benötigt, da das Projekt nie fertiggestellt wurde.
     * Sie sollte das Master-Passwort in einer Datei speichern und lesen. Allerdings ist diese Lösung nicht zu empfehlen,
     * da der Inhalt der Datei nicht verschlüsselt wird.
     */

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
