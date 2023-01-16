public class Student extends User{
    private int num; // 학번을 확인 할 수 있음

    public Student(int n){
        super();
        this.num = n;
    }

    @Override
    public void login(){
        this.setLogin(true);
        System.out.println("학생증으로 로그인 완료");
    }

    @Override
    public void whoAmI(){
        System.out.println("I'm student!");
    }

    public void whatNum(){
        System.out.println("학번 : " + num);
    }
}
