package iterator_pattern;

public class Main {
  public static void main(String[] args) {
    Library library = new Library(4);
    library.addBook(new Book(1L, "아리스토텔레스", Category.PHILOSOPHY));
    library.addBook(new Book(2L, "불교로부터 찾는 내면의 평화~", Category.RELIGION));
    library.addBook(new Book(3L, "군주론", Category.SOCIAL_SCIENCE));
    library.addBook(new Book(4L, "나비의 생체구조", Category.NATURAL_SCIENCE));

    LibraryIterator libraryIterator = new LibraryIterator(library);

    while (libraryIterator.hasNext()) {
      Book book = (Book) libraryIterator.next();
      System.out.println("id : " + book.id);
      System.out.println("name : " + book.name);
      System.out.println("category : " + book.category.getKorean());
      System.out.println("---------------------------");
    }
  }
}
