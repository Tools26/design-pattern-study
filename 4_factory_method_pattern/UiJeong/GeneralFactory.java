public class GeneralFactory implements UserFactory{ // // 자식 클래스, 어떤 인스턴스를 생성할지 구체적으로 정하는 구현부
    @Override
    public User createAccount() {
        System.out.println("이메일로 계정 생성");
        return new General();
    }
}
