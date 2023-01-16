from context import Context
from strategies import *

class Athlete(Context):
    def __init__(self):
        super().__init__()
        print("I'm triathlon Athlete")

athlete = Athlete()
athlete.current_strategy = RunStrategy()
athlete.print_current_sports()
athlete.move()
athlete.current_strategy = CycleStrategy()
athlete.print_current_sports()
athlete.move()
athlete.current_strategy = SwimStrategy()
athlete.print_current_sports()
athlete.move()
