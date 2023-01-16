class Swap {
    fun swap(list: MutableList<Int>, i: Int, j: Int) {
        val temp = list[i]
        list[i] = list[j]
        list[j] = temp
    }
}