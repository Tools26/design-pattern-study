//
//  Observer.swift
//  Observer
//
//  Created by 김영균 on 2022/10/31.
//

import Foundation

protocol Observer {
  var id: Int { get }
  func update(message: String)
}
