//
//  Count.swift
//  Observer
//
//  Created by 김영균 on 2022/10/31.
//

import Foundation

class Count: Subject {
  var count: Int {
    didSet {
      self.notifyObservers()
    }
  }
  
  var observers: [Int: CompletionHandler] = [:]
  
  init(count: Int) {
    self.count = count
  }
  
  func registerObserver(_ o: Observer, completion: @escaping CompletionHandler) {
    self.observers[o.id] = completion
  }
  
  func removeObserver(_ o: Observer) {
    self.observers.removeValue(forKey: o.id)
  }
  
  func notifyObservers() {
    self.observers.forEach { key, value in
      value(count)
    }
  }
}
