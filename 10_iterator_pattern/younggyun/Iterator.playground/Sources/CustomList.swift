import Foundation

public final class CustomList<T> {
  public typealias Element = T
  public typealias Iterator = DefaultIterator<Element>
  private var list: [Element] = []

  public init() { }
}

extension CustomList: Iterable {
  
  public func append(_ element: Element) {
    list.append(element)
  }
  
  public func makeIterator() -> Iterator {
    return Iterator(items: list)
  }
}
