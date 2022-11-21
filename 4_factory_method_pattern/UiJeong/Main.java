public class Main {
    public static void main(String[] args){
        StudentFactory sf = new StudentFactory();
        // 팩토리 생성

        Student student = (Student) sf.createAccount();
        Student student2 = (Student) sf.createAccount();
        Student student3 = (Student) sf.createAccount();
        // 인스턴스 생성

        General general = (General) new GeneralFactory().createAccount();
        // 팩토리 + 인스턴스 생성


        student.whoAmI();
        general.whoAmI();

        student.login();
        general.login();
        // 로그인

        student.whatNum();
        student2.whatNum();
        student3.whatNum();
        // 학번 출력
    }
}
