//
//  NetworkManager.swift
//  younggyun
//
//  Created by 김영균 on 2023/01/30.
//

import Foundation
import UIKit

public enum NetworkError: String, Error {
  case urlError = "urlError"
  case encodeError = "encodeError"
  case fetchError = "fetchError"
}

public protocol NetworkManager {
  func loadImage(_ url: String, completion: @escaping (Result<UIImage, NetworkError>) -> Void)
}
