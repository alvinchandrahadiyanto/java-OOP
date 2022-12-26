package dao;

import dao.controller.BookController;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String opsi;
    static BookController funcBook = new BookController();

  public static void menuApp() {
    System.out.println("=== SISTEM BUKU MANAGEMENT ===");
    System.out.println("1. Lihat Data Buku");
    System.out.println("2. Cari Data Buku Berdasar ID");
    System.out.println("3. Tambah Data Buku");
    System.out.println("4. Edit Data Buku");
    System.out.println("5. Hapus Data Buku");
    System.out.print("Pilihan User: ");
    opsi = input.nextLine();
  }

  public static void main(String[] args) {
    do {
      menuApp();

      switch (opsi) {
        case "1":
            funcBook.getBooks();
            break;

        case "2":
            funcBook.getBookById();
            break;

        case "3":
            funcBook.saveBook();
            break;

        case "4":
            funcBook.updateBook();
            break;
        
        case "5":
            funcBook.deleteBook();
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
