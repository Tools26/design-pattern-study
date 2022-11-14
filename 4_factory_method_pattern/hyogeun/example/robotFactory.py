from abc import ABCMeta, abstractmethod
from robot import *

class RobotFactory(metaclass=ABCMeta):
    @abstractmethod
    def createRobot(self, name):
        pass

class SuperRobotFactory(RobotFactory):
    def createRobot(self, name):
        if name == "super":
            return SuperRobot()
        elif name == "power":
            return PowerRobot()
        else:
            return None