package template_method_pattern;

public abstract class Oauth {
  public void login() {
    getAuthCode();
    getToken();
    getUserInfo();
    joinUserToDB();
    returnApplicationToken();
  }
  abstract void getAuthCode();
  abstract void getToken();
  abstract void getUserInfo();
  public void joinUserToDB() {
    System.out.println("사용자 정보를 서비스 디비에 저장합니다.");
  }
  public void returnApplicationToken() {
    System.out.println("서비스 자체 토큰을 생성해 반환합니다.");
  }
}
