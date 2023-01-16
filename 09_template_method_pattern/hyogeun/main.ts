abstract class MakeChicken {
  public makeChicken(): void {
    this.trimChicken();
    this.kneadChicken();
    this.cookChicken();
    this.complete();
  }
  private trimChicken(): void {
    console.log("닭을 손질합니다.");
  }
  private kneadChicken(): void {
    console.log("반죽을 합니다.");
  }
  protected abstract cookChicken(): void;
  protected abstract complete(): void;
}

class KyoChonRedCombo extends MakeChicken {
  protected cookChicken(): void {
    console.log("Fry and Sauce chicken.");
  }
  protected complete(): void {
    console.log("Red Combo Complete!");
  }
}

class GoobneBasasak extends MakeChicken {
  protected cookChicken(): void {
    console.log("Bake and Sauce Chicken.");
  }
  protected complete(): void {
    console.log("GoobneBasasak Complete!");
  }
}

const red = new KyoChonRedCombo();
const basasak = new GoobneBasasak();

red.makeChicken();
console.log("--------------");
basasak.makeChicken();
