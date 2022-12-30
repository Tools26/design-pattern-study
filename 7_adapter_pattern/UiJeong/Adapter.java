public class Adapter implements Login{
    private LoginMobile loginMobile;

    public Adapter(LoginInMobile loginInMobile) {
        this.loginMobile = loginInMobile;
    }

    @Override
    public void login(String user) {
        System.out.println("Adapter 사용되었습니다");
        loginMobile.login(user);
    }
}
