from strategies import *

class Context():
    def __init__(self):
        self.__athletics_strategies = None
        
    def move(self):
        self.__athletics_strategies.move()

    def print_current_sports(self):
        self.__athletics_strategies.current_sports()

    @property
    def current_strategy(self):
        return self.__athletics_strategies

    @current_strategy.setter
    def current_strategy(self, strategy):
        self.__athletics_strategies = strategy