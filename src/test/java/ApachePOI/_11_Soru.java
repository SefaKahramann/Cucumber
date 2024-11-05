package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _11_Soru {
    public static void main(String[] args) {
        String path="src/test/java/ApachePOI/resource/TestSonuclari.xlsx";
        String testResult="Test passed";
        String testName="Test Name";

        writeToExcel(path,testName,testResult);
        writeToExcel(path,testName,testResult);
        writeToExcel(path,testName,testResult);
        writeToExcel(path,testName,testResult);
        writeToExcel(path,testName,testResult);

    }

    public static void writeToExcel(String path ,String testName,String testResult){
        File file=new File(path);
        if (file.exists()){
            try {
                FileInputStream inputStream = new FileInputStream(path);
                Workbook workbook = WorkbookFactory.create(inputStream);
                Sheet sheet = workbook.getSheetAt(0);

                int endRow = sheet.getPhysicalNumberOfRows();
                Row newRow = sheet.createRow(endRow);
                Cell newCell = newRow.createCell(0);
                newCell.setCellValue(testName);

                newCell = newRow.createCell(1);
                newCell.setCellValue(testResult);

                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();

                System.out.println("Dosya eklendi");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            try {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Sheet1");

                Row newRow = sheet.createRow(0);
                Cell newCell = newRow.createCell(0);
                newCell.setCellValue(testName);

                newCell = newRow.createCell(1);
                newCell.setCellValue(testResult);


                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();

                System.out.println("Dosya oluşturuldu");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
