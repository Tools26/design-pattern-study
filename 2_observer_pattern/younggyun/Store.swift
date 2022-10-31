//
//  Store.swift
//  Observer
//
//  Created by 김영균 on 2022/10/31.
//

import Foundation

class Store {
  var iPhoneCount: Count
  var iPadCount: Count
  
  init(iPhoneCount: Count = Count(count: 0),
       iPadCount: Count = Count(count: 0)) {
    self.iPhoneCount = iPhoneCount
    self.iPadCount = iPadCount
  }
  
  func addIphone() {
    self.iPhoneCount.count = self.iPhoneCount.count + 1
  }
  
  func addIpad() {
    self.iPadCount.count = self.iPadCount.count + 1
  }
}
