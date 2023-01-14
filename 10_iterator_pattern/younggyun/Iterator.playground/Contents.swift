import Foundation

var map = CustomMap<String>()
map.add(element: "일번", for: "1번")
map.add(element: "이번", for: "2번")
map.add(element: "삼번", for: "3번")

var iterator = map.makeIterator()
