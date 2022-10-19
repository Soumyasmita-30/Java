package FileHandling.readExcelFile;

import org.apache.poi.xssf.usermodel.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {
    public ReadDataFromExcel() throws IOException {
    }


        public static void main (String[]args) throws IOException {
            FileInputStream file = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\training\\resources\\Exceldata.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            int rowCount = sheet.getLastRowNum();
            int columnCount = sheet.getRow(0).getLastCellNum();
            for (int i = 1; i <= rowCount; i++) {
                XSSFRow currentRow = sheet.getRow(i);
                for (int j = 0; j < columnCount; j++) {
                    String cellValue = currentRow.getCell(j).toString();
                    System.out.println("\t\t" + cellValue);
                }
            }
            workbook.close();
        }
    }


