package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _06_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";

        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0);

        int endRow= sheet.getPhysicalNumberOfRows(); // en son var olan satır no
        Row newRow= sheet.createRow(endRow); // en son boş yere yeni satır oluştur
        Cell newCell= newRow.createCell(0); // yeni satırda hüçre oluşturuldu

        newCell.setCellValue("Merhaba dünya");
        inputStream.close(); // okuma modunu kapat

        // dosyayı kaydet
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close(); // hafızayı boşalt
        outputStream.close();// yazma modunu kapat

        System.out.println("işlem tamamlandı");
    }
}
