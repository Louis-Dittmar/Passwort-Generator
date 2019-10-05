package main;

public class var {

	// file
	public static String PasswortMainFolderLocation = "", PasswortMainFolderName = "Passwort-Verwatlung";
	public static String FolderLangName = "language", ProjectName = "Passwort Verwaltung";
	public static String FileGer = "de_DE", FileEng = "en_EN";
	public static String VorläufigeFolderLocation = "";
	
	
	
	public static String K_FileMainFolder = var.PasswortMainFolderLocation + "/" + var.PasswortMainFolderName;
	public static String K_FileLangFolder = var.PasswortMainFolderLocation + "/" + var.PasswortMainFolderName + "/"  + var.FolderLangName;
	public static String K_File_de_DE = var.PasswortMainFolderLocation + "/" + var.PasswortMainFolderName + "/"  + var.FolderLangName + "/" + var.FileGer;
	public static String K_File_en_EN = var.PasswortMainFolderLocation + "/" + var.PasswortMainFolderName + "/"  + var.FolderLangName + "/" + var.FileEng;

	public var() {

	}

}
