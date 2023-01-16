package observer_pattern.newspaper

interface NewsPaper {
    fun register(subscriber: Subscriber)
    fun unregister(subscriber: Subscriber)
    fun sendNews(newsBody: String)
}