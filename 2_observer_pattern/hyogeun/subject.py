from abc import ABC, abstractmethod

class Subject(ABC):
    @abstractmethod
    def attach(self, observer):
        pass
    
    @abstractmethod
    def detach(self, observer):
        pass
    
    @abstractmethod
    def notify(self):
        pass
    
class ProfessorK(Subject):
    _isOnline = None
    
    _observers = []
    
    def attach(self, observer):
        self._observers.append(observer)
        print("새로운 학생이 추가되었습니다.")
        return super().attach(observer)
    
    def detach(self, observer):
        self._observers.remove(observer)
        print("학생이 드랍하였습니다.")
        return super().detach(observer)
    
    def notify(self):
        print("이번 주 수업 공지합니다.")
        for observer in self._observers:
            observer.update(self)
    
    def setState(self, isOnline):
        self._isOnline = isOnline
        self.notify()