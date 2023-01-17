import { IComponent } from "./Component";

export class LinkNode implements IComponent {
  name: string;
  url: string;
  constructor(name: string, url: string) {
    this.name = name;
    this.url = url;
  }
  getName = () => {
    return this.name;
  };
  getInfo = () => {
    console.log(`Name: ${this.name}, url: ${this.url}`);
  };
}
