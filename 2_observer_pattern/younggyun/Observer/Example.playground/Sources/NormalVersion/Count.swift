import Foundation

public class Count: Subject {
  public var observers: [ObserverProtocol] = []
  public var count: Int {
    didSet {
      notifyObservers()
    }
  }
  
  public init(count: Int) {
    self.count = count
  }
  
  public func registerObserver(_ o: ObserverProtocol) {
    guard observers.contains(where: { $0.id == o.id }) == false else {
      return
    }
    observers.append(o)
  }
  
  public func removeObserver(_ o: ObserverProtocol) {
    guard let index = observers.firstIndex(where: { $0.id == o.id }) else {
      return
    }
    observers.remove(at: index)
  }
  
  public func notifyObservers() {
    for observer in observers {
      observer.update(message: "개수가 \(count)개로 변경!")
    }
  }
}
