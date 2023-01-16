package decorater_pattern

open class NotifierDecorator(
    private val notifier: Notifier
) : Notifier {
    override fun send() {
        notifier.send()
    }
}