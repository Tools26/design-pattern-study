import UIKit

let imageUrl = "https://img.gqkorea.co.kr/gq/2022/10/style_634e7c680d723.jpg"
let imageUrl2 = "https://i.pinimg.com/564x/71/bc/f5/71bcf594dc6809d3b85fdbbb73085150.jpg"

let networkManager: NetworkManager = ProxyNetworkManager()
func loadImage(_ url: String, completion: @escaping (UIImage) -> Void){
  networkManager.loadImage(url) { result in
    switch result {
    case .success(let image):
      completion(image)
    case .failure(let error):
      print(error.rawValue)
    }
  }
}

loadImage(imageUrl) { $0 }

loadImage(imageUrl) { $0 }
loadImage(imageUrl2) { $0 }
loadImage(imageUrl2) { $0 }
