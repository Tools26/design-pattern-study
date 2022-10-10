# Strategy Pattern

## **전략 패턴이란?**

> In computer programming, the strategy pattern (also known as the policy pattern) is a behavioral software design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

위키피디아에서 전략 패턴 검색하면 전략 패턴은 행동 패턴의 하나로 런타임 과정에서 알고리즘 군에서 알고리즘 하나를 선택하여 사용할 수 있게 해준다고 한다. 이게 무슨 소리인지는 예제를 통해 알아보자.

## **전사 캐릭터 클래스 만들기**

점프와 눕기 기능이 있는 전사 캐릭터 클래스가 있다고 하자.

```swift
class Warrior {
  init() { }
  
  func jumping() {
    print("점프! 점프!")
  }

  func lying() {
    print("눕기! 눕기!")
  }
}
```

전사 캐릭터에 무기와 무기에 따른 싸우는 기능을 추가해달라는 요구사항이 있어 클래스에 무기 종류 열거체를 갖는 `weapon` 프로퍼티와 `fight` 메서드를 추가했다.

```swift
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
  // ... 생략
}
```

시간이 지나면서 무기가 추가되어 `fight` 메서드가 길어지고, 전사 캐릭터뿐만 아니라 마법사, 궁수 캐릭터도 만들어야 한다는 요구사항이 생겼다고 가정하자. 어떻게 해결할 것인가? 무기 공용체를 외부로 빼고 마법사, 궁수 캐릭터도 전사 캐릭터와 똑같이 만들 것인가? 이렇게 할 경우 당장의 요구사항을 해결할 수 있지만 무기를 추가할수록 코드를 계속 수정해야 한다. 즉 **유지보수가 어려워진다.**

## **해결 방법 고민하기**

요구사항으로 인해 클래스에서 달라지는 부분을 찾고, 달라지지 않은 부분과 분리해보자. 달라지는 부분을 찾아 달라지지 않은 부분에 영향을 주지 않도록 **캡슐화**하자. 캡슐화를 하여 달라지는 부분만 고치거나 확장할 수 있도록 하는 것이다.

현재 요구사항에서 `Warrior` 클래스가 달라지는 무기와 관련된 기능이고 달라지지 않은 부분은 점프와 눕기 기능이다. 따라서 무기와 관련된 기능을 분리한다. 이때 특정 무기에 따라 싸우는 행동이 정해 지므로 행동에 맞춰 프로토콜(인터페이스)로 분리한다.

```swift
protocol WeaponStrategy {
  func fight()
}
```

특정 무기에 대한 행동을 구현하기 위해선 어떠한 무기에 대한 행동을 나타내는 프로토콜을 채택하여 구현할 수 있다. 기존 코드에서 `Warrior` 클래스는 sword, axe, knife 무기에 대한 행동을 가지므로 각각의 무기에 대한 행동 클래스를 구현하자.

```swift
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
```

## **캐릭터 클래스와 무기 클래스 합치기**

캐릭터 클래스와 무기 클래스를 합치기 위해서는 상속(Inheritance)의 is-a 관계가 아닌 구성(composition)의 has-a 관계이어야 한다. 캐릭터 클래스가 무기 클래스의 프로토콜인 `WeaponStrategy`를 바라봄으로써 의존성 역전 관계를 만족하게 된다.

![injection_inversion](./image.png) 

```swift
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
```

## **동적으로 무기 지정하기**

Warrior 클래스는 WeaponStrategy 타입의 프로퍼티를 가지고 있기 때문에 무기를 추가하는 요구사항을 WeaponStrategy 프로토콜을 채택한 클래스를 추가하여 쉽게 해결할 수 있다. 또한 프로퍼티의 setter 메서드를 통해 런타임에서도 무기를 교체할 수 있다.

```swift
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
```

## **전략 패턴이란!**

지금까지 한 것은 기존의 전사 클래스에서 공통된 부분을 추출하고 캡슐화하여 각각의 무기에 따라 수정하여 사용할 수 있도록 만들었다. 따라서 전략 패턴을 정의하면 다음과 같다. **애플리케이션(전사 클래스)에서 알고리즘 군(무기를 사용하는 행동)을 정의하고 캡슐화해서 각각의 알고리즘(Sword, Axe, Knife, Bow 클래스)을 만들어 애플리케이션에서 수정하여 쓸 수 있도록 만드는 디자인 패턴이다.**
