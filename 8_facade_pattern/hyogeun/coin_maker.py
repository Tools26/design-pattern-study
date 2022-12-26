from modules.coin_generator import CoinGenerator
from modules.face_alignment import FaceAlignment
from modules.face_parser import FaceParser

class getCoin:
  def __init__(self):
    self.coinGenerator = CoinGenerator()
    self.faceAlignment = FaceAlignment()
    self.faceParser = FaceParser()
    
  def makeCoin(self):
    self.faceAlignment.faceAlignment()
    self.faceParser.faceParsing()
    self.coinGenerator.coinGenerator()
    return "Make Coin Success!!"