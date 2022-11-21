from model import KeyboardListener

class BaseModel:
    def __init__(self):
        self.keyboardListener = KeyboardListener.instance()

    def getInstance(self):
        return self.keyboardListener

class Menu(BaseModel):
    def __init__(self):
        print("This is Tetris Menu Class")
        super().__init__()


class Block(BaseModel):
    def __init__(self):
        print("This is Tetris Block Class")
        super().__init__()

class Board(BaseModel):
    def __init__(self):
        print("This is Tetris Board class")
        super().__init__()

menu = Menu()
block = Block()
board = Board()

print(menu.keyboardListener)
print(block.keyboardListener)
print(board.keyboardListener)