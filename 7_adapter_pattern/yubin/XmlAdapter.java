package adapter_pattern;

public class XmlAdapter implements JsonParser{
  private XmlParser xmlParser;

  public XmlAdapter(XmlParser xmlParser) {
    this.xmlParser = xmlParser;
  }

  @Override
  public void parse() {
    System.out.println("XmlAdapter is converting xml to json");
    System.out.println("parsing json");
  }
}
