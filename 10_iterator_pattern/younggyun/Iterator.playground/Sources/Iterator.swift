import Foundation

public protocol Iterator {
  associatedtype Element
  func hasNext() -> Bool
  func next() ->Element?
}
