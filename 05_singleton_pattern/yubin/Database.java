package singleton_pattern;

import java.util.ArrayList;
import java.util.List;

public class Database {
  private static volatile Database instance;

  public String value;

  private Database(String value) {
    this.value = value;
  }

  public static Database getDatabase(String value) {
    Database result = instance;
    if (result != null) {
      return result;
    }
    synchronized(Database.class) {
      if (instance == null) {
        instance = new Database(value);
      }
      return instance;
    }
  }

  private List<String> users = new ArrayList<>(List.of("유저1", "유저2", "유저3"));

  public List<String> getUsers() {
    return users;
  }

  public void addUser(String userName) {
    users.add(userName);
  }
}
