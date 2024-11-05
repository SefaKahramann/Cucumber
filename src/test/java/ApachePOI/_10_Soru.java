package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
   Main den bir metod çağırmak suretiyle, path i ve sheetName i verilen excelden
   istenilen sütun kadar veriyi okuyup bir List e atınız.
   Bu soruda kaynak Excel için : ApacheExcel2.xlsx  in 2.sheet ini kullanabilirsiniz.
 */
public class _10_Soru {
    public static void main(String[] args) {
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        String sheetName="testCitizen";
        int number=3;

        List<List<String >> data=getData(path,sheetName,number);
        for (List<String> row:data){
            for (String cell:row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> getData(String path ,String sheetName,int number){
        List<List<String>> data=new ArrayList<>();
        try {
            FileInputStream inputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(inputStream);
            Sheet sheet= workbook.getSheet(sheetName);

            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++){
                List<String> rowData=new ArrayList<>();
                for (int j = 0; j < number; j++) {
                    rowData.add(sheet.getRow(i).getCell(j).toString());
                }
                data.add(rowData);
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
