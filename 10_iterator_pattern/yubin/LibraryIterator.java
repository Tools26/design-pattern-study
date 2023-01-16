package iterator_pattern;

public class LibraryIterator implements Iterator{

  private Library library;
  private int index;

  public LibraryIterator(Library library) {
    this.library = library;
    this.index = 0;
  }

  @Override
  public boolean hasNext() {
    return index < library.getLength();
  }

  @Override
  public Object next() {
    Book book = library.getBook(index);
    index++;
    return book;
  }
}
