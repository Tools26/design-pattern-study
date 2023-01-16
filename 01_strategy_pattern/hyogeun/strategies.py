from abc import *

class AthlecticsStrategy(metaclass=ABCMeta):
    @abstractmethod
    def move(self):
        pass
    @abstractmethod
    def current_sports(self):
        pass

class RunStrategy(AthlecticsStrategy):
    def move(self):
        print("Run!!")
    def current_sports(self):
        print("Current Sports is Running")

class SwimStrategy(AthlecticsStrategy):
    def move(self):
        print("Swimming!!")
    def current_sports(self):
        print("Current Sports is Swimming")
        
class CycleStrategy(AthlecticsStrategy):
    def move(self):
        print("Cycling!!")
    def current_sports(self):
        print("Current Sports is Cycling")
    
        
    