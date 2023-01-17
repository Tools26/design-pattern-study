import { User } from "./User";
import { UserSet } from "./UserSet";
import { Iterator } from "./Iterator";

export class UserIterator implements Iterator<User> {
  private userSet: UserSet;
  private index: number = 0;

  constructor(users: UserSet) {
    this.userSet = users;
  }

  public current(): User {
    return this.userSet.getUsers()[this.index];
  }

  public next(): User {
    const item = this.userSet.getUsers()[this.index];
    this.index += 1;
    return item;
  }

  public rewind() {
    this.index = 0;
  }
}
