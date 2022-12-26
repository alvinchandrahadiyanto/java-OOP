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
  static Integer idbook;

  public static void menuApp() {
    System.out.println("=== SISTEM BUKU MANAGEMENT ===");
    System.out.println("1. Tambah Data Buku");
    System.out.println("2. Lihat Data Buku");
    System.out.println("3. Hapus Data Buku");
    System.out.println("4. Edit Data Buku");
    System.out.println("5. Cari Data Buku Berdasar ID");
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

    book = new Book();
    book.setTitle("Buku 2");
    book.setAuthor("Penulis 2");
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
          System.out.println("Semua Data Buku");
          System.out.println(bookDao.findAll());
          break;

        case "3":
          System.out.println(bookDao.findAll());
          System.out.println("Hapus Data Buku");
          System.out.print("Pilihan ID Buku yang akan dihapus: ");
          idbook = input.nextInt();
          bookDao.delete(idbook);
          System.out.println(bookDao.findAll());
          break;

        case "4":
          System.out.println(bookDao.findAll());
          System.out.println("Edit Data Buku");
          System.out.print("Pilihan ID Buku yang akan diedit: ");
          idbook = Integer.parseInt(input.nextLine());
          System.out.print("Edit Judul Buku: ");
          judul = input.nextLine();
          System.out.print("Edit Pembuat Buku: ");
          pembuat = input.nextLine();
          
          book = new Book();
          book.setTitle(judul);
          book.setAuthor(pembuat);
          // save data
          bookDao.update(book,idbook);
          System.out.println(bookDao.findAll());
          break;

        case "5":
          System.out.println(bookDao.findAll());
          System.out.println("Edit Data Buku");
          System.out.print("Pilihan ID Buku yang akan dicari: ");
          idbook = Integer.parseInt(input.nextLine());
          System.out.println(bookDao.findById(idbook));
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
