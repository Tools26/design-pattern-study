//
//  ProxyNetworkManager.swift
//  younggyun
//
//  Created by 김영균 on 2023/01/30.
//

import Foundation
import UIKit

final public class ProxyNetworkManager: NetworkManager {
  let networkManager: NetworkManager
  var cache: [String: UIImage] = [:]
  
  public init(_ networkManager: NetworkManager = DefaultNetworkManager.shared) {
    self.networkManager = networkManager
  }
  
  public func loadImage(_ url: String,  completion: @escaping (Result<UIImage, NetworkError>) -> Void) {
    if let cachedImage = cache[url] {
      print(" \(url) has been cached")
      completion(.success(cachedImage))
      return
    } else {
      print("\(url) is not cached")
      networkManager.loadImage(url) { [weak self] result in
        switch result {
        case .success(let str):
          self?.cache[url] = str
          completion(.success(str))
        case .failure(let error):
          completion(.failure(error))
        }
      }
    }
  }
  
  
}
