package task4;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String opsi;
    
  public static void menuApp() {
    System.out.println("======== SISTEM PEMESANAN RESTORAN ========");
    System.out.println("1. Lihat daftar Menu");
    System.out.println("2. Input Pemesanan");
    System.out.println("3. Pembayaran");
    System.out.print("Pilihan User: ");
    opsi = input.nextLine();
  }
  public static void main(String[] args) {
    do {
      menuApp();

      switch (opsi) {
        case "1":
            System.out.println("Opsi 1");
            break;

        case "2":
            System.out.println("Opsi 2");
            break;

        case "3":
            System.out.println("Opsi 3");
            break;

        default:
          System.out.println("Pilihan tidak tersedia!");
          break;
      }

        System.out.print("Apakah ingin keluar aplikasi? (y|n)");
        opsi = input.nextLine();
    } while (opsi.equalsIgnoreCase("n"));

    System.out.println("Terima kasih. Sampai jumpa kembali!");
  }
}
