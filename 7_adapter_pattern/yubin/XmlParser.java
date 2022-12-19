package adapter_pattern;

interface XmlParser {

  public void parse();
}

class XmlParserImpl implements XmlParser{

  @Override
  public void parse() {
    System.out.println("parsing xml");
  }
}
