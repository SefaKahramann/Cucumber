package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        // Java dosya okuma nesnesine bu yolu vererek bağlantı kuruyorum
        FileInputStream inputStream = new FileInputStream(path);
        //dosya okuma işlemcisi üzerinden Çalışma kitabını alıyorum

        // hafızada (RAM de) workbook ı alıp oluşturdu
        Workbook workbook = WorkbookFactory.create(inputStream);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet sheet=workbook.getSheet("Sheet1");

        //istenen satırı alıyorum
        Row row=sheet.getRow(0);//0. satır

        //istenilen sütundaki hüçreyi al
        Cell cell=row.getCell(0);//0. satırdaki hüçreyi alıyorum

        System.out.println("cell = " + cell);
    }
}
