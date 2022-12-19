package adapter_pattern;

public class Main {
  public static void main(String[] args) {
    JsonParser jsonParser = new JsonParserImpl();
    XmlParser xmlParser = new XmlParserImpl();
    XmlAdapter xmlAdapter = new XmlAdapter(xmlParser);

    jsonParser.parse();
    xmlParser.parse();
    xmlAdapter.parse();
  }
}
