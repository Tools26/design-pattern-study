from abc import ABCMeta, abstractmethod

class File(metaclass=ABCMeta):
    def __init__(self, name):
        self.filename = name

    @abstractmethod
    def getName(self):
        pass

class PythonFile(File):
    def getName(self):
        return f"This is Python File, filename : {self.filename}"

class SwiftFile(File):
    def getName(self):
        return f"This is Swift File, filename : {self.filename}"

class KotlinFile(File):
    def getName(self):
        return f"This is Kotlin File, filename : {self.filename}"

class JavaFile(File):
    def getName(self):
        return f"This is Java File, filename : {self.filename}"

class TextFile(File):
    def getName(self):
        return f"This is Text File, filename : {self.filename}"