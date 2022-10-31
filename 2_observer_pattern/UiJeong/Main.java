public class Main {
    public static void main(String args[]){
        Lecture web = new Lecture("웹 프로그래밍");
        Lecture system = new Lecture("컴퓨터 시스템 구조");

        Student a = new Student("전이");
        Student b = new Student("의이");
        Student c = new Student("정이");

        /*등록*/
        web.enroll(a);
        web.enroll(b);
        system.enroll(b);
        system.enroll(c);

        web.uploadLecture("1주차 자바스크립트 개요");
        web.uploadLecture("2주차 자바스크립트 문법");
        web.uploadLecture("3주차 express");

        system.professorNotice("오늘 2시 미래관 수업");
        system.cancel();
        system.professorNotice("오늘 휴강합니다.");

        a.printNotice();
        b.printNotice();
        c.printNotice();
    }
}
