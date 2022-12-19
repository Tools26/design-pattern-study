package adapter_pattern;

interface JsonParser {

  public void parse();
}

class JsonParserImpl implements JsonParser {

  @Override
  public void parse() {
    System.out.println("parsing json");
  }
}
