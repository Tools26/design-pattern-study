export class User {
  private name: string;
  private isNotify: boolean;
  constructor(n: string, notify: boolean) {
    this.name = n;
    this.isNotify = notify;
  }
  get getName() {
    return this.name;
  }
  get getIsNotify() {
    return this.isNotify;
  }
}
