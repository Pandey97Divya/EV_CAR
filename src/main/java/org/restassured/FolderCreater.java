package org.restassured;

import java.io.File;
import java.util.Date;

public class FolderCreater {
	public static String folderName;

	public static void folderCreater() {
        Date currentDate = new Date();
        folderName = currentDate.toString().replace(":", "");
        folderName=folderName.replaceAll("[^a-zA-Z0-9]", "");
		// Specify the path of the new folder
        String folderPath = "C:\\\\Users\\\\Fluper_\\\\Documents\\\\Screenshot\\\\Record"+folderName;
        // Create a File object representing the new folder
        File folder = new File(folderPath);
        // Use mkdir() to create the folder
        boolean folderCreated = folder.mkdir();
        if (folderCreated) {
            System.out.println("Folder created successfully.");
        } else {
            System.out.println("Failed to create folder.");
        }
	}
}
