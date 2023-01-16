package singleton_pattern;

public class Main {
  public static void main(String[] args) {
    Database database1 = Database.getDatabase("1번 db");
    Database database2 = Database.getDatabase("2번 db");

    database1.addUser("유저111");
    System.out.println(database2.getUsers());
  }
}
