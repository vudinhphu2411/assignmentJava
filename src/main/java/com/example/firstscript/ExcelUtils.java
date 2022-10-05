package com.example.firstscript;

// package com.example.firstscript;

// import java.io.FileInputStream;
// import java.io.IOException;
// import java.io.InputStream;

// import org.apache.poi.hssf.usermodel.HSSFSheet;
// import org.apache.poi.hssf.usermodel.HSSFWorkbook;
// import org.apache.poi.poifs.filesystem.POIFSFileSystem;
// import org.apache.poi.ss.usermodel.DataFormatter;

// public class ExcelUtils {

// static HSSFWorkbook workbook;
// static HSSFSheet sheet;

// public ExcelUtils(String excelPath, String sheetName) {
// try {
// InputStream file = new FileInputStream(excelPath);

// workbook = new HSSFWorkbook(new POIFSFileSystem(file));
// sheet = workbook.getSheet(sheetName);
// } catch (Exception e) {
// System.out.println(e.getCause());
// System.out.println(e.getMessage());
// e.printStackTrace();
// }
// }

// public static void getCellData(int rowNum, int collNum) throws IOException {
// DataFormatter formatter = new DataFormatter();
// Object value =
// formatter.formatCellValue(sheet.getRow(rowNum).getCell(collNum));
// System.out.println(value);
// }

// public void getRowCount() {
// int rowCount = sheet.getPhysicalNumberOfRows();
// System.out.println("No of row: " + rowCount);
// }
// }

// ----------------------------------------------------------
// import java.io.FileInputStream;
// import java.io.IOException;
// import java.util.Iterator;

// import org.apache.poi.EncryptedDocumentException;
// import org.apache.poi.ss.usermodel.Cell;
// import org.apache.poi.ss.usermodel.Row;
// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// public class ExcelUtils {
// private static XSSFWorkbook workbook;
// int cellIndex;
// String description;

// @Test
// public void excel() throws EncryptedDocumentException, IOException {
// // get the excel sheet file location
// FileInputStream fis = new
// FileInputStream("C:/Users/Administrator/Desktop/assignment2.xlsx");
// workbook = new XSSFWorkbook(fis);
// // XSSFSheet sheet = workbook.getSheetAt(0);
// XSSFSheet sheet = workbook.getSheet("Sheet1");
// // Duyệt các ptu từ đầu đến cuối của 1 collection
// Iterator<Row> iterator = sheet.rowIterator();
// cellIndex = 0;
// description = null;
// while (iterator.hasNext()) {
// Row row = iterator.next();

// for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
// Cell cell = row.getCell(i);
// // print the cell value
// System.out.println(i + " - " + cell);
// }
// }
// }
// }

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