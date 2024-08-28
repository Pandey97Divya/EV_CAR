package org.restassured;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import static org.restassured.ExcelSheetCreation.sheet;

public class OpenBrowser {
    public static void openBrowser() throws FileNotFoundException, IOException{
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //Test case 1
            HSSFRow row = sheet.createRow((short)1);
            row.createCell(0).setCellValue("TS_001");
            row.createCell(1).setCellValue("Sign IN");
            row.createCell(2).setCellValue("TC_01");
            row.createCell(3).setCellValue("Verify login with valid email and password combination.");
            row.createCell(4).setCellValue("");
            row.createCell(5).setCellValue("Fill Username & password then Click on Submit Button");
            row.createCell(6).setCellValue("Login to Homepage");
            row.createCell(7).setCellValue("");
            row.createCell(8).setCellValue("Pass or Fail");
            TakeScreenShot.screenshot(driver);
            row.createCell(9).setCellValue("Record "+TakeScreenShot.screenshotFileName);
            Date currentDate = new Date();
            row.createCell(10).setCellValue(currentDate.toString());
            row.createCell(11).setCellValue("");
            row.createCell(12).setCellValue("");
    }
}
