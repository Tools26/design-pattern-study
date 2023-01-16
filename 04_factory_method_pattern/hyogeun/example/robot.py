from abc import abstractmethod, ABCMeta

class Robot(metaclass=ABCMeta):
    @abstractmethod
    def getName(self):
        pass

class SuperRobot(Robot):
    def getName(self):
        return "SuperRobot"

class PowerRobot(Robot):
    def getName(self):
        return "PowerRobot"