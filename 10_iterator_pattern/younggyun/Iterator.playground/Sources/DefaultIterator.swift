import Foundation

public final class DefaultIterator<T> {
  public typealias Element = T
  private var items: [Element] = []
  private var index = 0
  
  init(items: [Element]) {
    self.items = items
  }
}

extension DefaultIterator: Iterator {
  public func next() -> Element? {
    guard hasNext() else { return nil }
    defer { index += 1 }
    return items[index]
  }

  public func hasNext() -> Bool {
    return index < items.count
  }
}
