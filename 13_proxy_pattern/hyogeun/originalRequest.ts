export class OriginalRequest {
  protected data: string = "";
  protected url: string = "";
  constructor(d: string, url: string) {
    this.data = d;
    this.url = url;
  }
  sendRequest = () => {
    if (this.url.includes("localhost")) {
      console.log("Request Successful");
    } else {
      console.log("cors");
    }
  };
}
