package org.passwort.file;

import java.io.File;
import java.io.IOException;

public class FileCreator {

    /***
     * Diese Datei wird nicht mehr benötigt, da das Projekt nie fertiggestellt wurde.
     *
     *
     *
     */

    public static File DataFolder = new File("src/data");
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
