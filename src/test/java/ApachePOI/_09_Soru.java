package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Soru {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/YeniExcel1.xlsx";
        File file = new File(path);
        if (!file.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook(); // yeni oluştur
            XSSFSheet sheet = workbook.createSheet("Sheet1");

            Row newRow = sheet.createRow(0);
            Cell newCell = newRow.createCell(0);
            newCell.setCellValue("Merhaba Dünya 1"); // değeri ver

            FileOutputStream outputStream = new FileOutputStream(path); //kaydet
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Dosya oluşturuldu");
        } else {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            int endRow = sheet.getPhysicalNumberOfRows();
            Row newRow = sheet.createRow(endRow);
            Cell newCell = newRow.createCell(0);
            newCell.setCellValue("Merhaba Dünya " + endRow ); // değeri ver

            FileOutputStream outputStream = new FileOutputStream(path); //kaydet
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Dosyaya eklendi");
        }
    }
}
