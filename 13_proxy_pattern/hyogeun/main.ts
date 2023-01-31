import { OriginalRequest } from "./originalRequest";
import { Proxy } from "./porxy";
// 1. 서버에 post 요청
// 2. CORS Error 발생
// 3. Proxy 서버를 이용해서 해결
console.log("서버에 POST 요청");
console.log("프록시 없이 localhost에 요청");
const OR1: OriginalRequest = new OriginalRequest("hi", "localhost:8080/api/v1");
OR1.sendRequest();
console.log("프록시 없이 123.456.78.9에 요청");
const OR2: OriginalRequest = new OriginalRequest(
  "hi",
  "123.456.78.9:8080/api/v1"
);
OR2.sendRequest();
console.log("프록시 사용하여 123.456.78.9에 요청");
const PR1: Proxy = new Proxy("hi", "123.456.78.9:8080/api/v1");
PR1.sendRequest();
