import Foundation

var map = CustomMap<String>()
map.add(element: "일번", for: "1번")
map.add(element: "이번", for: "2번")
map.add(element: "삼번", for: "3번")

var iterator: any Iterator = map.makeIterator()
while iterator.hasNext(),
      let elem = iterator.next() {
  print(elem)
}

var list = CustomList<Int>()
list.append(3)
list.append(4)
list.append(2)

iterator = list.makeIterator()
while iterator.hasNext(),
      let elem = iterator.next() {
  print(elem)
}
