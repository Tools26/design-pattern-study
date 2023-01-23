import { State } from "./State";

export class LogoutState extends State {
  public AccessToMypage() {
    return false;
  }

  public AccessToLoginPage() {
    return true;
  }

  public AccessToLogoutPage() {
    return false;
  }
}
