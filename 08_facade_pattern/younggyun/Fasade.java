package younggyun;

public class Fasade {
  private final Shelve shelve;
  private final Computer computer;
  private final PowerStrip powerStrip;
  
  public Fasade(Shelve shelve, Computer computer, PowerStrip powerStrip) {
    this.shelve = shelve;
    this.computer = computer;
    this.powerStrip = powerStrip;
  }

  public void 출근() {
    this.powerStrip.turnOnAll();
    this.shelve.openFirstSlot();
    this.shelve.takeOutFirstSlot();
    this.shelve.closeFirstSlot();
    this.computer.turnOn();
    this.computer.turnOff();
  }
}