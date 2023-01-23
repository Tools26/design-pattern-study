import { State } from "./State";

export class LoginState extends State {
  public AccessToMypage() {
    return true;
  }

  public AccessToLoginPage() {
    return false;
  }

  public AccessToLogoutPage() {
    return true;
  }
}
