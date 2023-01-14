import Foundation

public protocol Iterable {
  associatedtype Iterator
  func makeIterator() -> Iterator
}
