package factory_pattern;

class CharacterFactory{
  public static Char convert(char c) {
    if(Character.isLowerCase(c)) return new LowerChar(c);
    else if(Character.isUpperCase(c)) return new UpperChar(c);
    else return new OtherChar(c);
  }
}