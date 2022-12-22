package task1;
import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);
    static String opsi;
  
    public static void menuApp() {
        System.out.println("1. Person");
        System.out.println("2. Pendidikan"); 
        System.out.println("3. Exit y/n");
        System.out.print("Input User ");
        opsi = input.nextLine();
    }
  
    public static void main(String[] args) {
        do {
            menuApp();
      
            switch (opsi) {
              case "1":
                System.out.println("opsi 1");
                Person orang = new Person();
                orang.print();
                break;
      
              case "2":
                System.out.println("opsi 2");
                Pendidikan study = new Pendidikan();
                study.print();
                break;
      
              case "3":
                System.out.print("Apakah ingin keluar aplikasi? (y|n) ");
                opsi = input.nextLine();
                break;
      
              default:
                System.out.println("Pilihan tidak tersedia!");
                break;
            }
          } while (!opsi.equalsIgnoreCase("y"));
  }
}