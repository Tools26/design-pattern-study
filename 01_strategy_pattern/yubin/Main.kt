fun main(args: Array<String>) {

    var list:MutableList<Int> = mutableListOf(2,5,3,4,1)
    val swap = Swap()

    var sorter = Sorter(IntSelectionSort(swap))
    list = sorter.sort(list)
    println("지금 sort 방법은 " + sorter.whoAmI())
    println(list)

    list = mutableListOf(2,5,3,4,1)
    sorter.setSortStrategy(IntBubbleSort(swap))
    list = sorter.sort(list)
    println("지금 sort 방법은 " + sorter.whoAmI())
    println(list)

}