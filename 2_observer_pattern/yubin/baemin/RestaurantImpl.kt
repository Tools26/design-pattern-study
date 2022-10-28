package observer_pattern.baemin

import kotlin.random.Random

class RestaurantImpl(
    override val name: String,
    private val deliveryServiceCompany: DeliveryCompany
) : Restaurant {

    var orderSheets: MutableList<Consumer> = mutableListOf()

    override fun getNewOrder(consumer: Consumer) {
        println("${name}이 ${deliveryServiceCompany.name}이라는 publisher에 의해 ${consumer.name}님의 주문을 확인했습니다.")
        orderSheets.add(consumer)
    }

    override fun completeOrder(consumer: Consumer) {
        val randomIndex = Random.nextInt(orderSheets.size)
        val consumer = orderSheets[randomIndex]
        orderSheets.remove(consumer)
        println("${name}이 ${consumer.name}의 음식을 주문했습니다.")
        notifyDeliveryComplete(deliveryServiceCompany)
    }

    override fun notifyDeliveryComplete(deliveryServiceCompany: DeliveryCompany) {
        val randomIndex = Random.nextInt(orderSheets.size)
        val orderSheet = orderSheets[randomIndex]
        deliveryServiceCompany.getOrderComplete(this, orderSheet)
        orderSheets.remove(orderSheet)
    }

}