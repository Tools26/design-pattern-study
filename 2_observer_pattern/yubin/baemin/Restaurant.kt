package observer_pattern.baemin

interface Restaurant {

    val name: String
    fun getNewOrder(consumer: Consumer)
    fun completeOrder(consumer: Consumer)
    fun notifyDeliveryComplete(deliveryCompany: DeliveryCompany)
}