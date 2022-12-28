package task4;

import task4.controller.RestoController;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String opsi;
    static RestoController resto = new RestoController();
    
  public static void menuApp() {
    System.out.println("======== SISTEM PEMESANAN RESTORAN ========");
    System.out.println("1. Lihat daftar Menu");
    System.out.println("2. Input Pemesanan");
    System.out.println("3. Pembayaran");
    System.out.print("Pilihan: ");
    opsi = input.nextLine();
  }
  public static void main(String[] args) {
    do {
      menuApp();

      switch (opsi) {
        case "1":
            System.out.println("Opsi 1");
            resto.menuList();
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

        System.out.print("Apakah ingin melanjutkan ke pemesanan/pembayaran? (y|n)");
        opsi = input.nextLine();
    } while (opsi.equalsIgnoreCase("y"));

    System.out.println("Terima kasih. Sampai jumpa kembali!");
  }
}
