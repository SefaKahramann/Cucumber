package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        //Ortada bir excel olmadığına göre
        //Workbook u ve Sheet i hafızada oluşturmam lazım

        XSSFWorkbook workbook=new XSSFWorkbook(); // bu hafızadaki workbook
        XSSFSheet sheet= workbook.createSheet("Sheet1");

        Row row= sheet.createRow(0);
        Cell cell= row.createCell(0);

        cell.setCellValue("Merhaba dünya");

        String path="src/test/java/ApachePOI/resource/YeniExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}
