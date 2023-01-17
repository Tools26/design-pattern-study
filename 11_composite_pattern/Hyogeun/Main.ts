import { ContainerNode } from "./ContainerNode";
import { LinkNode } from "./LinkNode";

let Header = new ContainerNode("header");
let Logo = new LinkNode("logo", "www.naver.com");
let Logo2 = new LinkNode("logo2", "www.google.com");

Header.add(Logo);
Header.add(Logo2);

console.log("Add Compoennts");
Header.getInfo();

Header.remove(Logo2);

console.log("After Remove Component");
Header.getInfo();

let NavBar = new ContainerNode("nav");
let Mail = new LinkNode("mail", "https://mail.naver.com/");
let Cafe = new LinkNode("cafe", "https://section.cafe.naver.com/");
let Blog = new LinkNode("blog", "https://section.blog.naver.com/");

NavBar.add(Mail);
NavBar.add(Cafe);
NavBar.add(Blog);

NavBar.getInfo();

Header.add(NavBar);
Header.getInfo();
