//
//  Customer.swift
//  Observer
//
//  Created by 김영균 on 2022/10/31.
//

import Foundation

class Customer: Observer {
  internal var id: Int
  private var name: String
  
  init(id: Int, name: String) {
    self.id = id
    self.name = name
  }
  
  // closure 방식에선 필요없다.
  func update(message: String) {
    // 
  }
}
