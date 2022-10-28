package observer_pattern.baemin

interface DeliveryCompany {

    val name: String

    fun registerRestaurant(restaurant: Restaurant)
    fun unregisterRestaurant(restaurant: Restaurant)
    fun registerConsumer(consumer: Consumer)
    fun unregisterConsumer(consumer: Consumer)
    fun getOrder(consumer: Consumer, restaurant: Restaurant)
    fun notifyOrder(consumer: Consumer, restaurant: Restaurant)
    fun showRestaurantsList(): List<Restaurant>
    fun getOrderComplete(restaurant: Restaurant, consumer: Consumer)
    fun sendOrderComplete(restaurant: Restaurant, consumer: Consumer)

}