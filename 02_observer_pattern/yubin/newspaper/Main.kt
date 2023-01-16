package observer_pattern.newspaper

fun main() {
    val newsPaper1 = NewsPaperImpl()
    val subscriber1 = SubscriberImpl("subscriber1")
    val subscriber2 = SubscriberImpl("subscriber2")
    val subscriber3 = SubscriberImpl("subscriber3")

    newsPaper1.register(subscriber1)
    newsPaper1.register(subscriber2)
    newsPaper1.register(subscriber3)
    newsPaper1.sendNews("오늘의 날씨는 맑음. 내일은 하루종일 화창하겠습니다")

    newsPaper1.unregister(subscriber3)
    newsPaper1.sendNews("오늘의 날씨는 흐림. 내일은 비가 내리겠습니다")
}