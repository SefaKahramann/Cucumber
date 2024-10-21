package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**

 Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 bulup ve sonucun döndürülmesi için metod kullanınız.
 src/test/java/ApachePOI/resources/LoginData.xlsx*/

public class _05_Soru_GetSpecificData {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachePOI/resource/LoginData.xlsx";
        Scanner scanner=new Scanner(System.in);

        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheetAt(0);
        List<String> keys =new ArrayList<>();

        for (Row row : sheet){
            keys.add(row.getCell(0).getStringCellValue()); // keyleri kullanıcının karşısına çıkartması için
        }
        System.out.println("Keyler  : "+keys);

        System.out.print("Aramak istediğiniz key i girin : ");
        System.out.println(getData(path, scanner.nextLine())); // yazılanı methoda gönderip yazdırmak için yer
    }

    public static String getData(String path,String key){
        String data="";
        try {
            FileInputStream file=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(file);
            Sheet sheet=workbook.getSheetAt(0);
            for (Row row : sheet){
                if (row.getCell(0).getStringCellValue().equalsIgnoreCase(key)){
                    data="";
                    for (Cell cell : row){
                        data += cell.toString()+" ";
                    }
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
