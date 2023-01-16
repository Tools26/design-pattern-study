package iterator_pattern;

public class Library implements Aggregate{

  private Book[] books;
  private int num = 0;

  public Library(int num) {
    this.books = new Book[num];
  }

  public Book getBook(int index) {
    return books[index];
  }

  public void addBook(Book book) {
    this.books[num] = book;
    num++;
  }

  public int getLength() {
    return num;
  }

  @Override
  public Iterator iterator() {
    return new LibraryIterator(this);
  }
}
