import UIKit

let images: [String] = [
  "1579962413362-65c6d6ba55de?ixlib=rb-1.2.1&auto=format&fit=crop&w=934&q=80","1580394693981-254c3aeded6a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=3326&q=80", "1579202673506-ca3ce28943ef?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=934&q=80", "1535745049887-3cd1c8aef237?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=934&q=80", "1568389494699-9076492b22e7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=937&q=80",  "1566624790190-511a09f6ddbd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=934&q=80"
]


enum MyError: Error {
  case fetchError
}

class APIService {
  static let shared: APIService = APIService()
  private let base: String = "https://images.unsplash.com/photo-"
  private init() { }
  
  func fetch(imageNames: [String],
             completion: @escaping (Result<[UIImage], MyError>) -> Void) {
    var downloadedImages: [UIImage] = []
    let group = DispatchGroup()
    
    for name in imageNames {
      guard let url = URL(string: "\(self.base)\(name)") else { return }
      group.enter()
      
      let task = URLSession.shared.dataTask(with: url) { data, _, error in
        defer {
          group.leave()
        }
        
        if error == nil, let data = data, let image = UIImage(data: data) {
          downloadedImages.append(image)
        }
      }
      task.resume()
    }
    
    group.notify(queue: .main) {
      if downloadedImages.count == imageNames.count {
        completion(.success(downloadedImages))
      } else {
        completion(.failure(.fetchError))
      }
    }
  }
}


APIService.shared.fetch(imageNames: images) { response in
  switch response {
  case .success(let data):
    data
  case .failure(let error):
    print(error)
  }
}

