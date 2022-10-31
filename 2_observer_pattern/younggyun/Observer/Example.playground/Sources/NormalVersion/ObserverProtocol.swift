import Foundation

public protocol ObserverProtocol {
  var id: Int { get }
  func update(message: String)
}

