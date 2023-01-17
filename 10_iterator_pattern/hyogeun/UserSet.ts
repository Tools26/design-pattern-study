import { User } from "./User";
import { Aggregator } from "./Aggregator";
import { Iterator } from "./Iterator";
import { UserIterator } from "./UserIterator";

export class UserSet implements Aggregator {
  private Users: User[] = [];
  constructor() {}
  public getUsers = (): User[] => {
    return this.Users;
  };
  public addUser(user: User) {
    this.Users.push(user);
  }
  public getIterator(): Iterator<User> {
    return new UserIterator(this);
  }
}
