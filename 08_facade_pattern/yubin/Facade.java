package facade_pattern;

public class Facade {

  public void makeRamen() {
    Cook cook = new Cook();
    Ventilation ventilation = new Ventilation();
    WasherMachine washerMachine = new WasherMachine();

    cook.boilWater();
    cook.addPowder();
    cook.addNoodle();
    ventilation.turnOnVentilation();
    washerMachine.washDishes();
  }
}
