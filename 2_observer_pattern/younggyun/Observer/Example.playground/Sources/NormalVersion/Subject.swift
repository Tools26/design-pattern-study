import Foundation

public protocol Subject {
  var observers: [ObserverProtocol] { get set }
  func registerObserver(_ o: ObserverProtocol)
  func removeObserver(_ o: ObserverProtocol)
  func notifyObservers()
}
