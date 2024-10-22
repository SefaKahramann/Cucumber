package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_Soru {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/Carpim.xlsx";

        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheetAt(0);

        int endRow=0; //sheet.getPhysicalNumberOfRows(); kaldığın satırdan devam et
        for (int i = 1; i <=10; i++) {
            Row row = sheet.createRow(endRow++);
            Cell firstCell= row.createCell(0);
            Cell multiplyCell= row.createCell(1);
            Cell secondCell= row.createCell(2);
            Cell equalsCell= row.createCell(3);
            Cell resultCell= row.createCell(4);

            firstCell.setCellValue(1);
            multiplyCell.setCellValue("x");
            secondCell.setCellValue(i);
            equalsCell.setCellValue("=");
            resultCell.setCellValue(1*i);
        }
        inputStream.close();

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}
