class Sorter (
    private var sort: Sort
){

    fun sort(list: MutableList<Int>) : MutableList<Int>{
        return sort.sort(list)
    }

    fun whoAmI() : String{
        return sort.whoAmI()
    }

    fun setSortStrategy(sort: Sort) {
        this.sort = sort
    }

}