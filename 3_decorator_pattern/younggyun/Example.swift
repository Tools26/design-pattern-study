// The base Component interface
protocol Beverage { 
    var description: String { get set }
    func getDescription() -> String
    func cost() -> Double
}

extension Beverage {
    func getDescription() -> String {
        return description
    }
}

// The Concreate Conponent
class Espresso: Beverage {
    var description: String = "에스프레소"
    
    init() { }
    
    func cost() -> Double {
        return 1000
    }
}

// The base Decorator
protocol CondimentDecorator: Beverage {
    var beverage: Beverage { get set }
}

// The Concreate Decorators
class Milk: CondimentDecorator {
    var description = "우유"
    var beverage: Beverage

    init(_ beverage: Beverage) {
        self.beverage = beverage
    }
    
    func getDescription() -> String { 
        return "\(beverage.getDescription()) + \(self.description)"
    }

    func cost() -> Double {
        return 500 + beverage.cost()
    }
}

class Whip: CondimentDecorator {
    var description = "휘핑 크림"
    var beverage: Beverage

    init(_ beverage: Beverage) {
        self.beverage = beverage
    }
    
    func getDescription() -> String { 
        return "\(beverage.getDescription()) + \(self.description)"
    }
    
    func cost() -> Double {
        return 300 + beverage.cost()
    }
}

class Soy: CondimentDecorator { 
    var description = "두유"
    var beverage: Beverage

    init(_ beverage: Beverage) {
        self.beverage = beverage
    }
    
    func getDescription() -> String { 
        return "\(beverage.getDescription()) + \(self.description)"
    }
    
    func cost() -> Double {
        return 700 + beverage.cost()
    }
}

class Mocha: CondimentDecorator {
    var description = "모카"
    var beverage: Beverage

    init(_ beverage: Beverage) {
        self.beverage = beverage
    }
    
    func getDescription() -> String { 
        return "\(beverage.getDescription()) + \(self.description)"
    }
    
    func cost() -> Double {
        return 500 + beverage.cost()
    }
}

var beverage: Beverage = Espresso()
beverage = Mocha(beverage)
beverage = Whip(beverage)
beverage = Milk(beverage)
print(beverage.getDescription(), beverage.cost())

var beverage2: Beverage = Soy(Mocha(Espresso()))
print(beverage2.getDescription(), beverage2.cost())