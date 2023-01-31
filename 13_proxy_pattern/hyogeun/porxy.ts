import { OriginalRequest } from "./originalRequest";
export class Proxy {
  protected req: OriginalRequest;
  constructor(d: string, u: string) {
    this.req = new OriginalRequest(d, u);
  }
  sendRequest = () => {
    console.log("Request Successful");
  };
}
