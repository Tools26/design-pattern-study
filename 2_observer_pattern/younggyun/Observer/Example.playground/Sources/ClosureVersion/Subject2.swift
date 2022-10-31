import Foundation

typealias CompletionHandler = ((Int) -> Void)
internal protocol Subject {
  var observers: [Int: CompletionHandler] { get }
  func registerObserver(_ o: Observer, completion: @escaping CompletionHandler)
  func removeObserver(_ o: Observer, completion: @escaping CompletionHandler)
  func notifyObservers()
}
