import Foundation

class Warrior {
  enum WeaponStyle {
    case sword
    case axe
    case knife
  }

  var weapon: WeaponStyle
  
  init(weapon: WeaponStyle) {
    self.weapon = weapon
  }
  
  func setWeapon(weapon: WeaponStyle) {
    self.weapon = weapon
  }

  func fight() {
    switch weapon {
    case .sword: print("검으로 싸웁니다.")
    case .axe: print("도끼로 싸웁니다.")
    case .knife: print("단검으로 싸웁니다.")
    }
  }
  
  func jumping() {
    print("점프! 점프!")
  }

  func lying() {
    print("눕기! 눕기!")
  }
}

var warrior: Warrior = Warrior(weapon: .knife)

warrior.fight()
warrior.setWeapon(weapon: .axe)
warrior.fight()

/**
* 
* 무기가 추가될수록 코드를 수정해야 하며 수정될수록 코드가 난잡해진다.
* 이를 해결하기 위해서는 클래스에서 달라지는 부분을 찾고, 달라지지 않은 부분과 분리해야 한다.
* 달라지는 부분을 찾아서 나머지 코드에 영향을 주지 않도록 "캡슐화" 한다.
* 바뀌는 부분은 따로 뽑아서 캡슐화한다. 그러면 나중에 바뀌지 않는 부분에는 영향을 미치지 않고 그 부분만 고치거나 확장할 수 있다.
* => 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분과 분리한다.
*
* Warrior 클래스에서 달라지는 부분은 무기와 관련된 기능, 달라지지 않은 부분은 점프와 눕기 기능이다.
* 따라서 무기와 관련된 기능을 분리하여 별개의 클래스로 만든다.
* 특정 무기에 따라 싸우는 행동이 정해지므로 행동에 맞춰서 프로토콜(인터페이스)로 분리한다.
* => 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
*
* 싸우는 행동을 기존에 Warrior 클래스에서 정의한 메소드가 아닌 다른 클래스에 위임하여 실행한다.
* 바뀌지 않는 부분만 남겨진 Warrior 클래스와 바뀌는 부분을 떼어낸 WeaponStrategy를 서로 합치는 것은
* 상속(inheritance) is-a가 아닌 구성(composition) has-a 관계이어야 한다.
*
* 전략 패턴 : 알고리즘 군을 정의하고 캡슐화해서 각각의 알고리즘 군을 수정해서 쓸 수 있게 해준다.
*
**/


protocol WeaponStrategy {
  func fight()
}

class SwordStrategy: WeaponStrategy {
  func fight() {
    print("검으로 싸웁니다.")
  }
}

class AxeStrategy: WeaponStrategy {
  func fight() {
    print("도끼로 싸웁니다.")
  }
}

class KnifeStrategy: WeaponStrategy {
  func fight() {
    print("단검으로 싸웁니다.")
  }
}

class Warrior {
  var strategy: WeaponStrategy
  
  init(strategy: WeaponStrategy) {
    self.strategy = strategy
  }
  
  func setStrategy(strategy: WeaponStrategy) {
    self.strategy = strategy
  }
  
  func fight() {
    self.strategy.fight()
  }

  func jumping() {
    print("점프! 점프!")
  }
  
  func lying() {
    print("눕기! 눕기!")
  }
}

var warrior: Warrior = Warrior(strategy:  KnifeStrategy())
warrior.fight()
warrior.setStrategy(strategy: AxeStrategy())
warrior.fight()

// 활를 추가하려면 WeaponStrategy 프로토콜을 채택하는 활 전략를 만들면된다.
class BowStrategy: WeaponStrategy {
  func fight() {
    print("활로 싸웁니다.")
  }
}

warrior.setStrategy(strategy: BowStrategy())
warrior.fight()