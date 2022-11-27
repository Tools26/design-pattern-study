from abc import ABCMeta, abstractmethod
import sys
import os
import fileClass

class FileFactory(metaclass=ABCMeta):
    @abstractmethod
    def createFile(self, filename):
        pass

class CreateFileFactory(FileFactory):
    extMap = {
        ".py" : "Python",
        ".kt" : "Kotlin",
        ".swift" : "Swift",
        ".java" : "Java"
    }
    def createFile(self, filename):
        try:
            c = getattr(sys.modules['fileClass'], self.extMap[os.path.splitext(filename)[-1]]+"File")(filename)
        except:
            c = fileClass.TextFile(filename)
        return c