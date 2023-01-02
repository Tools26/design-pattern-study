abstract class KyoChonChicken {
  public makeChicken(): void {
    this.trimChicken();
    this.kneadChicken();
    this.fryChicken();
    this.sauceChicken();
    this.complete();
  }
  private trimChicken(): void {
    console.log("닭을 손질합니다.");
  }
  private kneadChicken(): void {
    console.log("반죽을 합니다.");
  }
  private fryChicken(): void {
    console.log("닭을 튀깁니다.");
  }
  protected abstract sauceChicken(): void;
  protected abstract complete(): void;
}

class Red extends KyoChonChicken {
  protected sauceChicken(): void {
    console.log("Add Red sauce");
  }
  protected complete(): void {
    console.log("Red Chicken Complete!");
  }
}

class Honey extends KyoChonChicken {
  protected sauceChicken(): void {
    console.log("Add Honey sauce");
  }
  protected complete(): void {
    console.log("Honey Chicken Complete!");
  }
}

const red = new Red();
const honey = new Honey();

red.makeChicken();
console.log("--------------");
honey.makeChicken();
