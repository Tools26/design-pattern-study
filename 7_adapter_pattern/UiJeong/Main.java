public class Main {
    public static void main(String[] args) {

        Login user = new LoginInWeb(); // 웹에서 로그인
        user.login("의정inWeb");

        user = new Adapter(new LoginInMobile()); // 모바일에서 로그인
        user.login("의정inMobile");
    }

    /*
        의정inWeb: 웹에서 로그인했습니다!
        Adapter 사용되었습니다
        의정inMobile: 모바일에서 로그인했습니다!
    */
}
