package observer_pattern.baemin

fun main() {
    val baemin = DeliveryCompanyImpl("배달의 민족")
    val uijeong = ConsumerImpl(baemin, "으정이")

    val kyochon = RestaurantImpl("교촌치킨", baemin)
    val bhc = RestaurantImpl("BHC", baemin)
    val bbc = RestaurantImpl("BBC", baemin)

    // baemin에 교촌치킨, bhc치킨, bbc치킨을 등록한다.
    val restaurants = listOf(kyochon, bhc, bbc)
    baemin.restaurantList.addAll(restaurants)

    // 의정이가 배민을 구경한다.
    uijeong.getRestaurantList()
    // 의정이가 랜덤으로 특정 가게에 주문을 넣는다.
    uijeong.orderFood()


}