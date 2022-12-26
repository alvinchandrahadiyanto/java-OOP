package task1;
import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);
    static String opsi;
    static Pendidikan study = new Pendidikan();
    static Person orang = new Person();

    public static void menuApp() {
        System.out.println("1. Lihat Orang");
        System.out.println("2. Lihat Pendidikan");
        System.out.println("3. Tambah Orang");
        System.out.println("4. Tambah Pendidikan"); 
        System.out.print("Input User ");
        opsi = input.nextLine();
    }
  
    public static void main(String[] args) {
        do {
            menuApp();
      
            switch (opsi) {
              case "1":
                System.out.println("Lihat Orang");
                orang.print();
                break;
      
              case "2":
                System.out.println("Lihat Pendidikan");
                study.print();
                break;
      
              case "3":
                System.out.println("Tambah Orang");
                orang.setPerson();
                break;

              case "4":
                System.out.println("Tambah Pendidikan");
                study.setPendidikan();
                break;
      
              default:
                System.out.println("Pilihan tidak tersedia!");
                break;
            }
            System.out.print("Apakah ingin keluar aplikasi? (y|n) ");
            opsi = input.nextLine();
          } while (!opsi.equalsIgnoreCase("y"));
  }
}