import { LoginState } from "./LoginState";
import { LogoutState } from "./LogoutState";
import { State } from "./State";

export class Context {
  private state: State;

  constructor(state: State) {
    this.state = state; // error
    this.transitionTo(state);
  }

  public transitionTo(state: State): void {
    this.state = state;
    this.state.setContext(this);
  }

  public requestMypage(): void {
    if (this.state.AccessToMypage()) {
      console.log("Can Access Mypage");
    } else {
      console.log("Please Login to Mypage");
    }
  }

  public requestLogin(): void {
    if (this.state.AccessToLoginPage()) {
      console.log("Can Access Login Page");
      this.transitionTo(new LoginState());
    } else {
      console.log("Cannot Access Login Page");
    }
  }

  public requestLogout(): void {
    if (this.state.AccessToLogoutPage()) {
      console.log("Can Access Logout Page");
      this.transitionTo(new LogoutState());
    } else {
      console.log("Cannot Access Logout Page");
    }
  }
}
