public class StudentFactory implements UserFactory{ // 자식 클래스, 어떤 인스턴스를 생성할지 구체적으로 정하는 구현부
    private int num;

    public StudentFactory(){
        this.num = 0;
    }

    @Override
    public User createAccount() {
        this.num++;
        System.out.println("학생증으로 계정 생성" + num);
        return new Student(num);
    }
}
