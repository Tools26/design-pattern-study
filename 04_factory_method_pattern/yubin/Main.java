package factory_pattern;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    StringBuilder answer = new StringBuilder();
    word.chars()
      .mapToObj(c -> CharacterFactory.convert((char) c))
      .map(Char::reverse)
      .forEach(answer::append);
    System.out.println(answer);
  }
}






