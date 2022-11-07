package decorater_pattern

class NewAssignmentNotifier(
    private val notifier: Notifier
) : NotifierDecorator(notifier) {

    override fun send() {
        super.send()
        println("새로운 과제가 있습니다.")
    }
}