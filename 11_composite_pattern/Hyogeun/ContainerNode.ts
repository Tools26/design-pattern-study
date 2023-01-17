import { IComponent } from "./Component";

export class ContainerNode implements IComponent {
  name: string;
  children: IComponent[] = [];
  constructor(name: string) {
    this.name = name;
  }
  add = (c: IComponent) => {
    this.children.push(c);
  };
  remove = (c1: IComponent) => {
    this.children = this.children.filter((c2: IComponent) => c1 !== c2);
  };
  getName = () => {
    return this.name;
  };
  getInfo = () => {
    console.log(`This is ${this.name} Node`);
    for (let i = 0; i < this.children.length; ++i) {
      this.children[i].getInfo();
    }
  };
}
