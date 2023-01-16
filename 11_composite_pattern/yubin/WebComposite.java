package composite_pattern;

import java.util.LinkedList;
import java.util.List;

public class WebComposite implements WebPage{

  List<WebPage> pages = new LinkedList<>();

  public void addComponent(WebPage webPage) { pages.add(webPage); }

  @Override
  public void printPageIfWordIsInvolved(String word) {
    for (WebPage page : pages) {
      page.printPageIfWordIsInvolved(word);
    }
  }
}
