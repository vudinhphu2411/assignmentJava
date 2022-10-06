package com.example.firstscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public void excel() {

        try {

            FileInputStream fis = new FileInputStream(new File("C:/Users/Administrator/Desktop/assignment2.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            Object[][] bookData = {
                    { "Jack", 85, "SALES", "JUG" },
                    { "Head", 74, "SALES", "VERONICA" }
            };

            int rowCount = sheet.getLastRowNum();

            for (Object[] Book : bookData) {

                // Create row for all the new data
                XSSFRow row = sheet.createRow(++rowCount);

                int columnCount = 0;

                // Create new cell for each row
                XSSFCell cell = row.createCell(columnCount);

                for (Object field : Book) {

                    cell = row.createCell(columnCount++);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
                System.out.println(cell);
            }

            fis.close();

            // Write the workbook in file system
            FileOutputStream outputStream = new FileOutputStream("C:/Users/Administrator/Desktop/assignment2.xlsx");
            workbook.write(outputStream);
            System.out.println("Excel is updated successfully");

            // Close the workbook
            workbook.close();
            outputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}