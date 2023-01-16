package observer_pattern.newspaper

interface Subscriber {
    val name: String
    fun readNews(newsBody: String)
}