protocol Rice {
    var name: String { get set }
    func cost() -> Int
    func getName() -> String
}

extension Rice {
    func getName() -> String {
        return name
    }
}

class BarleyRice: Rice { // 보리밥
    var name = "보리밥"
    func cost() -> Int {
        return 1500
    }
}

class BrownRice: Rice { // 현미밥
    var name = "현미밥"
    func cost() -> Int {
        return 1000
    }
}

protocol IngredientDecorator: Rice {
    var rice: Rice { get set }
}

class Spam: IngredientDecorator {
    var name = "스팸"
    var rice: Rice

    init(_ r: Rice) {
        self.rice = r
    } 

    func cost() -> Int {
        return 1000 + rice.cost()
    } 

    func getName() -> String {
        return self.name + rice.getName()
    }
}

class Tuna: IngredientDecorator {
    var name = "참치"
    var rice: Rice
    
    init(_ r: Rice) {
        self.rice = r
    } 

    func cost() -> Int {
        return 700 + rice.cost()
    } 

    func getName() -> String {
        return self.name + rice.getName()
    }
}

class Chicken: IngredientDecorator {
    var name = "치킨"
    var rice: Rice
    
    init(_ r: Rice) {
        self.rice = r
    } 

    func cost() -> Int {
        return 900 + rice.cost()
    } 

    func getName() -> String {
        return self.name + rice.getName()
    }
}

class Bulgogi: IngredientDecorator {
    var name = "불고기"
    var rice: Rice
    
    init(_ r: Rice) {
        self.rice = r
    } 

    func cost() -> Int {
        return 1200 + rice.cost()
    } 

    func getName() -> String {
        return self.name + rice.getName()
    }
}

var mayo: Rice = Tuna(Spam(BarleyRice()))
print("메뉴: ", mayo.getName() + "마요")
print("가격: ", mayo.cost())

mayo = Bulgogi(mayo)
print("메뉴: ", mayo.getName() + "마요")
print("가격: ", mayo.cost())

mayo = Spam(mayo)
print("메뉴: ", mayo.getName() + "마요")
print("가격: ", mayo.cost())

var mayo2: Rice = Chicken(Spam(BrownRice()))
print("메뉴: ", mayo2.getName() + "마요")
print("가격: ", mayo2.cost())