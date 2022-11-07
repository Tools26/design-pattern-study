from abc import ABCMeta, abstractmethod

class Sandwich(object):
    __metaclass__ = ABCMeta
    def __init__(self):
        self.sandwitch_info = ""
        
    def get_description(self):
        return self.sandwitch_info

class VegetableDecorator(Sandwich):
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def get_description(self):
        pass

class LettuceDecorator(VegetableDecorator):
    def __init__(self, sandwich):
        self.sandwich = sandwich
    
    def get_description(self):
        return self.sandwich.get_description() + "Add Lettuce\n"

class TomatoDecorator(VegetableDecorator):
    def __init__(self, sandwich):
        self.sandwich = sandwich
    
    def get_description(self):
        return self.sandwich.get_description() + "Add Tomato\n"


class CucumbersDecorator(VegetableDecorator):
    def __init__(self, sandwich):
        self.sandwich = sandwich
    
    def get_description(self):
        return self.sandwich.get_description() + "Add Cucumber\n"


class PeppersDecorator(VegetableDecorator):
    def __init__(self, sandwich):
        self.sandwich = sandwich
    
    def get_description(self):
        return self.sandwich.get_description() + "Add Pepper\n"

if __name__ == "__main__":
    AllVegeSandwich = CucumbersDecorator(TomatoDecorator(PeppersDecorator(LettuceDecorator(Sandwich()))))
    print("AllVegeSandwich Sandwich : \n"+AllVegeSandwich.get_description())
    
    pepperLettuceSandwich = PeppersDecorator(LettuceDecorator(Sandwich()))
    print("PepperLettuce Sandwich : \n"+pepperLettuceSandwich.get_description())