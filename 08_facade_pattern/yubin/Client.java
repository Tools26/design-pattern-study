package facade_pattern;

public class Client {

  public void eatRamen() {
    Facade facade = new Facade();
    facade.makeRamen();
  }
}
