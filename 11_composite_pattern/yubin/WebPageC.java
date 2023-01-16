package composite_pattern;

public class WebPageC implements WebPage{

  private String title;
  private String content;

  public WebPageC(String title, String content) {
    this.title = title;
    this.content = content;
  }

  @Override
  public void printPageIfWordIsInvolved(String word) {
    if(content.contains(word)){
      System.out.println("title : " + title);
      System.out.println("content : " + content);
    }
    System.out.println();
  }
}
