package dao.controller;

import dao.models.Book;
import dao.repository.BookRepository;
import dao.services.DaoService;

import java.util.Scanner;

public class BookController {
  private static DaoService<Book, Integer> bookDao = new BookRepository();

  // Instance scanner
  static Scanner input = new Scanner(System.in);
  static String opsi;
  static String judul;
  static String pembuat;

  public static void menuApp() {
    System.out.println("=== SISTEM BUKU MANAGEMENT ===");
    System.out.println("1. Tambah Data Buku");
    System.out.println("2. Lihat Data Buku");
    System.out.print("Pilihan User: ");
    opsi = input.nextLine();
  }

  public static void main(String[] args) {
    // get all, get by id, delete
    // instance object book
    Book book = new Book();
    book.setTitle("Buku 1");
    book.setAuthor("Penulis 1");

    // save data
    bookDao.save(book);

    // getall
    System.out.println(bookDao.findAll());

    do {
      menuApp();

      switch (opsi) {
        case "1":
          System.out.println("Tambah Data Buku");
          System.out.print("Pilihan Judul Buku: ");
          judul = input.nextLine();
          System.out.print("Pilihan Pembuat Buku: ");
          pembuat = input.nextLine();
          book = new Book();
          book.setTitle(judul);
          book.setAuthor(pembuat);
          // save data
          bookDao.save(book);
          break;

        case "2":
          System.out.println(bookDao.findAll());
          break;

        default:
          System.out.println("Pilihan tidak tersedia!");
          break;
      }

      System.out.print("Apakah ingin keluar aplikasi? (y|n)");
      opsi = input.nextLine();
    } while (opsi.equalsIgnoreCase("n"));
  }
}
