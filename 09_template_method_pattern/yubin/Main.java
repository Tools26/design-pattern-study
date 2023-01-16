package template_method_pattern;

public class Main {
  public static void main(String[] args) {
    KakaoOauth kakaoOauth = new KakaoOauth();
    NaverOauth naverOauth = new NaverOauth();

    System.out.println("****** 카카오 로그인을 시작합니다. ******");
    kakaoOauth.login();
    System.out.println();
    System.out.println("****** 네이버 로그인을 시작합니다. ******");
    naverOauth.login();
  }
}
