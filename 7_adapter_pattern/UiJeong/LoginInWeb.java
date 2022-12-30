public class LoginInWeb implements Login {

    @Override
    public void login(String user) {
        System.out.println(user +": 웹에서 로그인했습니다!");
    }
}
