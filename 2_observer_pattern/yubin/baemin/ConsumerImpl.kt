package observer_pattern.baemin

import kotlin.random.Random

class ConsumerImpl (
    private val deliveryCompany: DeliveryCompany, override val name: String
): Consumer{

    private lateinit var restaurantList: List<Restaurant>

    override fun getRestaurantList() {
        restaurantList = deliveryCompany.showRestaurantsList()
    }

    override fun orderFood() {
        val randomIndex = Random.nextInt(restaurantList.size)
        val restaurant = restaurantList[randomIndex]
        println("${name}이 ${restaurant.name}의 음식을 주문했습니다.")
        deliveryCompany.notifyOrder(this, restaurant)
    }

    override fun getDeliveryComplete(restaurant: Restaurant) {
        println("${name}님이 배달 완료 알람을 받았습니다.")
    }

}