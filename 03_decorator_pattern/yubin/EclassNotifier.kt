package decorater_pattern

class EclassNotifier : Notifier{
    override fun send() {
        println("새로운 이클래스 알림이 있습니다. ")
    }
}