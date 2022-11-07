package decorater_pattern

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class DeadLineNotifier(
    private val notifier: Notifier
) : NotifierDecorator(notifier) {

    override fun send() {
        super.send()
        println("미제출 과제가 있습니다. 제출 마감은 ${LocalDateTime.now().plusDays(1).format(DateTimeFormatter.ISO_DATE)}까지 입니다.")
    }
}