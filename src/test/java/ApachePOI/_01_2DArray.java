package ApachePOI;

public class _01_2DArray {
    public static void main(String[] args) { // hatırlatma için yazıldı asıl işlem excel de.
        String [][] zoo={
                {"Aslan","1"},
                {"Kaplan","2"},
                {"Zebra","3","1"},
                {"Fil","4"}
        };
        System.out.println("--------------------");
        System.out.println(zoo[2][0]);
        System.out.println(zoo[2][1]);

        for (int i = 0; i < zoo.length; i++) { //kaç satır
            for (int j = 0; j < zoo[i].length; j++) { // bulunduğum satırın uzunluğu
                System.out.print(zoo[i][j]+" ");
            }
            System.out.println();
        }
    }
}
