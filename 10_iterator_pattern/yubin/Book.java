package iterator_pattern;

public class Book {
  public Long id;
  public String name;
  public Category category;

  public Book(Long id, String name, Category category) {
    this.id = id;
    this.name = name;
    this.category = category;
  }
}
