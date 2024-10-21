package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);//ilk sayfa
        //1. yol
        // zoo.leng ini arıyorum yani kaç satır var
        int rowCount=sheet.getPhysicalNumberOfRows();// satır sayısını verdi
        System.out.println("rowCount = " + rowCount);

        for (int i = 0; i < rowCount; i++) {
            Row row =sheet.getRow(i);// satırı aldım
            int cellCount=row.getPhysicalNumberOfCells();// satırdaki hüçre sayısı zoo[i].length
            for (int j = 0; j < cellCount; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
        //2.yol
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { //zoo length oldu
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) { //zoo[i].length oldu
                System.out.print(sheet.getRow(i).getCell(j)+" "); //zoo[i][j] gibi oldu
            }
            System.out.println();
        }
    }
}
