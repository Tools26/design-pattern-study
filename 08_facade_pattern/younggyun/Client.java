package younggyun;

public class Client {
  public static void main(String args[]) {
    Shelve shelve = new Shelve();
    Computer computer = new Computer();
    PowerStrip powerStrip = new PowerStrip();
    Fasade fasade = new Fasade(shelve, computer, powerStrip);
    fasade.출근();
  }
}
