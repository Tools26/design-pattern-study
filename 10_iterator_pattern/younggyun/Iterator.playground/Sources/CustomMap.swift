import Foundation

public final class CustomMap<T> {
  public typealias Key = String
  public typealias Element = T
  public typealias Iterator = DefaultIterator<Element>
  private var map: [Key: Element] = [:]
  
  public init() { }
}

extension CustomMap: Iterable {
  public func add(element: Element, for key: Key) {
    map.updateValue(element, forKey: key)
  }
  
  public func makeIterator() -> Iterator {
    return Iterator(items: map.values.map { $0 })
  }
}
