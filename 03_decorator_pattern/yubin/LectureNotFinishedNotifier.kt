package decorater_pattern

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class LectureNotFinishedNotifier(
    private val notifier: Notifier
) : NotifierDecorator(notifier) {

    override fun send() {
        super.send()
        println("온라인 강의 학습이 완료되지 않았습니다. 해당 강의 학습마감은 ${LocalDateTime.now().plusDays(1).format(DateTimeFormatter.ISO_DATE)}까지 입니다.")
    }
}