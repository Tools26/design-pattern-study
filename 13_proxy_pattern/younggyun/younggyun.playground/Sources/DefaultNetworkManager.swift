//
//  DefaultNetworkManager.swift
//  younggyun
//
//  Created by 김영균 on 2023/01/30.
//

import Foundation
import UIKit

final public class DefaultNetworkManager: NetworkManager {
  public static let shared = DefaultNetworkManager()
  
  private init() { }
  
  public func loadImage(_ url: String, completion: @escaping (Result<UIImage, NetworkError>) -> Void) {
    guard let url = URL(string: url) else {
      completion(.failure(NetworkError.urlError))
      return
    }
    var request = URLRequest(url: url)
    request.httpMethod = "GET"
    let task = URLSession.shared.dataTask(with: request) { data, response, error in
      guard let data = data, error == nil else {
        completion(.failure(NetworkError.fetchError))
        return
      }
      guard let image = UIImage(data: data) else {
        completion(.failure(NetworkError.encodeError))
        return
      }
      completion(.success(image))
    }
    task.resume()
  }
}
