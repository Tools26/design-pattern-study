package observer_pattern.baemin

class DeliveryCompanyImpl(
    override val name: String
) : DeliveryCompany{

    var restaurantList: MutableList<Restaurant> = mutableListOf()
    var currentWatingList: MutableList<Consumer> = mutableListOf()

    override fun registerRestaurant(restaurant: Restaurant) {
        restaurantList.add(restaurant)
    }

    override fun unregisterRestaurant(restaurant: Restaurant) {
        restaurantList.remove(restaurant)
    }

    override fun registerConsumer(consumer: Consumer) {
        currentWatingList.add(consumer)
    }

    override fun unregisterConsumer(consumer: Consumer) {
        currentWatingList.remove(consumer)
    }


    override fun getOrder(consumer: Consumer, restaurant: Restaurant) {
        registerConsumer(consumer)
        println("배민이 ${consumer.name} 고객님의 ${restaurant.name} 가게 주문을 확인했습니다.")
        notifyOrder(consumer, restaurant)
    }

    override fun notifyOrder(consumer: Consumer, restaurant: Restaurant) {
        println("배민이 ${restaurant.name} 가게에 ${consumer.name} 고객님의 주문을 전달했습니다.")
        restaurant.getNewOrder(consumer)
    }

    override fun showRestaurantsList(): List<Restaurant>{
        return restaurantList
    }

    override fun getOrderComplete(restaurant: Restaurant, consumer: Consumer) {
        restaurantList.remove(restaurant)
        currentWatingList.remove(consumer)
        println("${restaurant.name}이 보내온 ${consumer.name}님과 관련된 주문이 완료되었습니다.")
        sendOrderComplete(restaurant, consumer)
    }

    override fun sendOrderComplete(restaurant: Restaurant, consumer: Consumer) {
        println("${consumer.name}님께 배달 완료 알람을 보내러 갑시다.")
        consumer.getDeliveryComplete(restaurant)
    }

}