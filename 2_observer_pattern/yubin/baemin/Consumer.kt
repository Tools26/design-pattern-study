package observer_pattern.baemin

interface Consumer {
    val name: String
    fun getRestaurantList()
    fun orderFood()
    fun getDeliveryComplete(restaurant: Restaurant)
}