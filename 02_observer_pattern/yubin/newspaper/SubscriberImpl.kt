package observer_pattern.newspaper

class SubscriberImpl(override val name: String) : Subscriber {
    override fun readNews(newsBody: String) {
        println("${name}님이 신문을 소리내어 읽습니다")
        println(newsBody)
    }
}