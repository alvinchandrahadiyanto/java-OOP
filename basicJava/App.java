import java.util.ArrayList;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nomor 1");
        System.out.println("");
        String firstName = "Alvin";
        String lastName = " Chandra Hadiyanto";
        String birthPlace = "Bandung";
        String birthYear = "1998";
        String progrLangFav = "Python";

        System.out.println("Nama: "+firstName+lastName);
        System.out.println("Tempat lahir: "+birthPlace);
        System.out.println("Tahun lahir: "+birthYear);
        System.out.println("progrLangFav: "+progrLangFav);

        System.out.println("");
        System.out.println("Nomor 2");
        System.out.println("");
        int[] array1 = { 2,3,4,5 };
        int[] array2 = { 1,3,5,7 };
        ArrayList<Integer> array3 = new ArrayList<Integer>();

        for (int x : array1) {
            for (int y : array2) {
               if (x == y) {
                  array3.add(x);
               }
            }
         }
        System.out.println(array3);

        System.out.println("");
        System.out.println("Nomor 3");
        System.out.println("");
        
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,2,4,1,5));
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println("arrayList yang sudah di urutkan");
        System.out.println(arrayList);
    }
}
