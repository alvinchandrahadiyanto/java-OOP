package dao.controller;

import dao.models.Book;
import dao.repository.BookRepository;
import dao.services.DaoService;

import java.util.Scanner;

public class BookController {
  private static DaoService<Book, Integer> bookDao = new BookRepository();
  Book book = new Book();
  static Scanner input = new Scanner(System.in);
  static String opsi;
  static String judul;
  static String pembuat;
  static Integer idbook;

  public void getBooks(){
    System.out.println("Semua Data Buku");
    System.out.println(bookDao.findAll());
  }

  public void getBookById(){
    System.out.println("Cari Data Buku");
    System.out.print("Pilihan ID Buku yang akan dicari: ");
    idbook = Integer.parseInt(input.nextLine());
    System.out.println(bookDao.findById(idbook));
  }

  public void saveBook(){
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
  }

  public void updateBook(){
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
  }

  public void deleteBook(){
    System.out.println(bookDao.findAll());
    System.out.println("Hapus Data Buku");
    System.out.print("Pilihan ID Buku yang akan dihapus: ");
    idbook = input.nextInt();
    bookDao.delete(idbook);
    System.out.println(bookDao.findAll());
  }
}
