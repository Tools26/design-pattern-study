package factory_pattern;

class UpperChar implements Char{

  char value;

  public UpperChar(char value) {
    this.value = value;
  }

  @Override
  public char reverse() {
    return (char) ('Z' - value + 'A');
  }
}
