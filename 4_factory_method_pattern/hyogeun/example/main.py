from robot import *
from robotFactory import *

if __name__ == "__main__":
    factory = SuperRobotFactory()
    r1 = factory.createRobot("super")
    r2 = factory.createRobot("power")

    print(r1.getName())
    print(r2.getName())