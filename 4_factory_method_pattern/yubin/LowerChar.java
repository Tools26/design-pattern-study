package factory_pattern;

class LowerChar implements Char{

  char value;

  public LowerChar(char value) {
    this.value = value;
  }

  @Override
  public char reverse() {
    return (char) ('z' - value + 'a');
  }
}