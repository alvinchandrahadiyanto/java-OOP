package dao.controller;

import dao.models.Book;
import dao.repository.BookRepository;
import dao.services.DaoService;

import java.util.List;
import java.util.Scanner;

public class BookController {
  private DaoService<Book, Integer> bookDao = new BookRepository();
  Book book = new Book();
  private List<Book> booklist;
  static Scanner input = new Scanner(System.in);
  static String opsi;
  static String judul;
  static String pembuat;
  static Integer idbook;

  public void allbooks(){
    booklist=bookDao.findAll();
    System.out.println(" ");
    System.out.println("Semua Data Buku");
    for (int i = 0; i < booklist.size(); i++) {
      System.out.println(booklist.get(i).toString());
    }
  }

  public void getBooks(){
    if(bookDao.findAll().isEmpty()){
      System.out.println("Buku Kosong!");
    }else{
      allbooks();
    }
  }

  public void getBookById(){
    if(bookDao.findAll().isEmpty()){
      System.out.println("Buku Kosong!");
      System.out.println(" ");
    }else{
      System.out.println("Cari Data Buku");
      System.out.print("Pilihan ID Buku yang akan dicari: ");
      idbook = Integer.parseInt(input.nextLine());
      if(idbook>bookDao.findAll().size()){
        System.out.println("Id tidak ada");
      }else{
        allbooks();
      }
    }
  }

  public void saveBook(){
    System.out.println(" ");
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
    if(bookDao.findAll().isEmpty()){
      System.out.println("Buku Kosong!");
      System.out.println(" ");
    }else{
      System.out.println(bookDao.findAll());
      System.out.println("Edit Data Buku");
      System.out.print("Pilihan ID Buku yang akan diedit: ");
      idbook = Integer.parseInt(input.nextLine());
      if(idbook>bookDao.findAll().size()){
        System.out.println("Id tidak ada");
      }else{
        System.out.print("Edit Judul Buku: ");
        judul = input.nextLine();
        System.out.print("Edit Pembuat Buku: ");
        pembuat = input.nextLine();
          
        book = new Book();
        book.setTitle(judul);
        book.setAuthor(pembuat);
        // save data
        bookDao.update(book,idbook);
        allbooks();
      }
    }
  }

  public void deleteBook(){
    if(bookDao.findAll().isEmpty()){
      System.out.println("Buku Kosong!");
      System.out.println(" ");
    }else{
      System.out.println(bookDao.findAll());
      System.out.println("Hapus Data Buku");
      System.out.print("Pilihan ID Buku yang akan dihapus: ");
      idbook = input.nextInt();
      if(idbook>bookDao.findAll().size()){
        System.out.println("Id tidak ada");
      }else{
        bookDao.delete(idbook);
        System.out.println("Buku Sudah Terhapus!");
        System.out.println(" ");
        allbooks();
      }
    }
  }
}
