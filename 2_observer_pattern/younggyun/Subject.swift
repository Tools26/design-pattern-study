//
//  Subject.swift
//  Observer
//
//  Created by 김영균 on 2022/10/31.
//

import Foundation

protocol Subject {
  typealias CompletionHandler = ((Int) -> Void)
  var observers: [Int: CompletionHandler] { get set }
  
  func registerObserver(_ o: Observer, completion: @escaping CompletionHandler)
  func removeObserver(_ o: Observer)
  func notifyObservers()
}
