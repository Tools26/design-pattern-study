public class General extends User{
    public General(){
        super();
    }

    @Override
    public void login(){
        this.setLogin(true);
        System.out.println("이메일로 로그인 완료");
    }

    @Override
    public void whoAmI(){
        System.out.println("I'm not Student");
    }
}
