class IntBubbleSort (
    private val swap: Swap
) : Sort() {

    override fun sort(list: MutableList<Int>): MutableList<Int> {
        for(i in list.indices){
            for(j in 1 until list.size - i)
                if(list[j] < list[j-1]) {
                    swap.swap(list, j, j-1)
                }
        }
        return list
    }

    override fun whoAmI() : String {
        return "버블 정렬"
    }
}