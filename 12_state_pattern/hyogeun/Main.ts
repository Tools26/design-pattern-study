import { Context } from "./Context";
import { LogoutState } from "./LogoutState";
import { LoginState } from "./LoginState";

const context = new Context(new LogoutState());
console.log("# Request Logout");
context.requestLogout();
console.log("# Request Mypage");
context.requestMypage();
console.log("# Request Login -> State Changed");
context.requestLogin();
console.log("# Request Login");
context.requestLogin();
console.log("# Request Mypage");
context.requestMypage();
console.log("# Request Logout -> State Changed");
context.requestLogout();
