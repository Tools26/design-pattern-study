package composite_pattern;

public class Google {

  public static void main(String[] args) {

    WebPageA webPageA = new WebPageA("titleA", "contentA");
    WebPageB webPageB = new WebPageB("titleB", "contentB");
    WebPageC webPageC = new WebPageC("titleC", "contentC");

    WebComposite webCompositeA = new WebComposite();
    WebComposite webCompositeB = new WebComposite();

    webCompositeA.addComponent(webPageA);
    webCompositeA.addComponent(webPageB);
    webCompositeA.addComponent(webPageC);

    webCompositeB.addComponent(webPageA);
    webCompositeB.addComponent(webPageB);

    webCompositeA.addComponent(webCompositeB);

    webCompositeA.printPageIfWordIsInvolved("content");

  }
}
