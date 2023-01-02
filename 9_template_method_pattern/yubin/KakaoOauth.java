package template_method_pattern;

public class KakaoOauth extends Oauth{
  @Override
  void getAuthCode() {
    System.out.println("카카오 인증 서버로부터 인가코드를 받아옵니다.");
  }

  @Override
  void getToken() {
    System.out.println("카카오 인증 서버로부터 토큰을 받아옵니다.");
  }

  @Override
  void getUserInfo() {
    System.out.println("토큰을 가지고 카카오 인증 서버로부터 사용자 정보를 받아옵니다.");
  }
}
