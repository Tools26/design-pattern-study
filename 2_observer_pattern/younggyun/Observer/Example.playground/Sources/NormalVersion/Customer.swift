import Foundation

public class Customer: ObserverProtocol {
  public var id: Int
  public var name: String
  
  public init(id: Int, name: String) {
    self.id = id
    self.name = name
  }
  
  public func update(message: String) {
    print("\(name)에게 메세지: \(message)")
  }
}
