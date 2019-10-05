package main;

public class var {

	// file
	public static String PasswortMainFolderLocation = "", PasswortMainFolderName = "Passwort-Verwatlung";
	public static String FolderLangName = "language", ProjectName = "Passwort Verwaltung";
	public static String FileGer = "de_DE.xml", FileEng = "en_EN.xml";
	public static String VorläufigeFolderLocation = "src/file",FinaleFolderLocation = null;
	public static String InternFile = "src/file/InfomationFile.xml", AdminPasswort = null, AdminPasswortVorläufig = null;
	

	// Messages
	public static String MessagePasswortVergesen = "Hinweis:\r\nAlle Passw\u00F6rter die in diesem Programm gespeichert wurden\r\nwerden mit dem Klicken \r\nauf Best\u00E4digen unwiderufich Gel\u00F6scht  ";
	
	// Kürzungen
	public static String K_FileMainFolder = var.PasswortMainFolderLocation + "/" + var.PasswortMainFolderName;
	public static String K_FileLangFolder = var.PasswortMainFolderLocation + "/" + var.PasswortMainFolderName + "/" + var.FolderLangName;
	public static String K_File_de_DE = var.PasswortMainFolderLocation + "/" + var.PasswortMainFolderName + "/" + var.FolderLangName + "/" + var.FileGer;
	public static String K_File_en_EN = var.PasswortMainFolderLocation + "/" + var.PasswortMainFolderName + "/"	+ var.FolderLangName + "/" + var.FileEng;

	public var() {

	}

}
