import { Context } from "./Context";

export abstract class State {
  protected context: Context | undefined = undefined;

  public setContext(context: Context) {
    this.context = context;
  }

  public abstract AccessToMypage(): boolean;

  public abstract AccessToLoginPage(): boolean;

  public abstract AccessToLogoutPage(): boolean;
}
