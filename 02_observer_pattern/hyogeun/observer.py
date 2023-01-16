from abc import ABC, abstractmethod

class Observer(ABC):
    @abstractmethod
    def update(self, subject):
        pass
    
class Student(Observer):
    def update(self, subject):
        print("Online Class" if subject._isOnline else "Offline Class")
        return super().update(subject)