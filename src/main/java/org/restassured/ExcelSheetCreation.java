package org.restassured;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileOutputStream;
import java.util.Date;

public class ExcelSheetCreation {
    public static String filename=null;
    public static HSSFWorkbook workbook = new HSSFWorkbook();
    public static HSSFSheet sheet = workbook.createSheet("M1");
    public static HSSFRow rowhead = sheet.createRow((short)0);
    public static void excelSheetCreation(){
        try
        {
            FolderCreater.folderCreater();
            Date currentDate = new Date();
            String excelSheetFileName = currentDate.toString().replace(":", ".");
            filename = "C:\\Users\\Fluper_\\Documents\\Screenshot\\Record"+FolderCreater.folderName+"\\Record " +excelSheetFileName+ ".xls";
            rowhead.createCell(0).setCellValue("TS_ID");
            rowhead.createCell(1).setCellValue("Test Scenario");
            rowhead.createCell(2).setCellValue("TC_ID");
            rowhead.createCell(3).setCellValue("Test Case Description");
            rowhead.createCell(4).setCellValue("Test Data");
            rowhead.createCell(5).setCellValue("Test Step");
            rowhead.createCell(6).setCellValue("Expected Result");
            rowhead.createCell(7).setCellValue("Actual Result");
            rowhead.createCell(8).setCellValue("STATUS");
            rowhead.createCell(9).setCellValue("SCREENSHOT NAME");
            rowhead.createCell(10).setCellValue("TEST CASE RUN TIME");
            rowhead.createCell(11).setCellValue("REMARK");
            rowhead.createCell(12).setCellValue("");
            OpenBrowser.openBrowser();
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            System.out.println("Excel file has been generated successfully.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
