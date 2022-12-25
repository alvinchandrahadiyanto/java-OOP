package dao.models;

public class Book {
  private String title;
  private String author;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    return "Book [title=" + title + ", author=" + author + "]";
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
