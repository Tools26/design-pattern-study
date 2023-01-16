from abc import ABC, abstractmethod

class DBMS(ABC):
    @abstractmethod
    def connect(self): pass
    @abstractmethod
    def queryData(self): pass

class Oracle(DBMS):
    def connect(self):
        print("Connect to Oracle")

    def queryData(self):
        print("Data from Oracle database")    

class Adapter(DBMS):
    def __init__(self, dbms):
        self.dbms = dbms

    def queryData(self):
        return self.dbms.scan()

    def connect(self):
        return self.dbms.connectMySQL()

class MySQL():
    def connectMySQL(self):
        print("Connect to MySQL")

    def scan(self):
        print("Data from MySQL database")

oracleClient = Oracle()
mysqlClient = Adapter(MySQL())

oracleClient.connect()
mysqlClient.connect()

print("--------------------------")

oracleClient.queryData()
mysqlClient.queryData()