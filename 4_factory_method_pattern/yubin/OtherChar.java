package factory_pattern;

class OtherChar implements Char {

  char value;

  public OtherChar(char value) {
    this.value = value;
  }

  @Override
  public char reverse() {
    return value;
  }
}