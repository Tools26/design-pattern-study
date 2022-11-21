class SingletonInstance():
    __instance = None

    @classmethod
    def __getInstance(cls):
        return cls.__instance

    @classmethod
    def instance(cls, *args, **kargs):
        cls.__instance = cls(*args, **kargs)
        cls.instance = cls.__getInstance
        return cls.__instance

class KeyboardListener(SingletonInstance):
    def __init__(self):
        print("This is KeyBoard Input Listener")