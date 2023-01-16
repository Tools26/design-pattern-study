package observer_pattern.newspaper

class NewsPaperImpl : NewsPaper {

    var subscribers: MutableList<Subscriber> = mutableListOf()

    override fun register(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    override fun unregister(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    override fun sendNews(newsBody: String) {
        subscribers.forEach { it.readNews(newsBody) }
    }
}