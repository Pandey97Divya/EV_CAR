package org.restassured;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.util.Date;
public class TakeScreenShot{
    public static String screenshotFileName=null;
    public static void screenshot(WebDriver driver) {
    	try {
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            //Call getScreenshotAs method to create image file
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            Date currentDate = new Date();
            screenshotFileName = currentDate.toString().replace(":", ".");
            //Move image file to new destination            
            File DestFile = new File("C:\\Users\\Fluper_\\Documents\\Screenshot\\Record"+FolderCreater.folderName+"\\Record " + screenshotFileName + ".png");
            FileHandler.copy(SrcFile, DestFile);
            System.out.println("Screenshot file name: Record " + screenshotFileName + ".png");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
