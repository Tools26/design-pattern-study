class IntSelectionSort(
    private val swap: Swap
) : Sort() {

    override fun sort(list: MutableList<Int>): MutableList<Int> {
        for (i in list.indices) {
            var minIndex = i

            for (j in i + 1 until list.size) {
                if (list[j] < list[minIndex]) {
                    minIndex = j
                }
            }
            if(minIndex != i)
                swap.swap(list, minIndex, i)
        }

        return list
    }

    override fun whoAmI() : String{
        return "선택 정렬"
    }

}