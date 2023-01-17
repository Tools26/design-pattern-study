import { User } from "./User";
import { UserSet } from "./UserSet";

const userSet = new UserSet();
userSet.addUser(new User("hi", true));
userSet.addUser(new User("hello", true));
userSet.addUser(new User("nice", false));
userSet.addUser(new User("to", true));
userSet.addUser(new User("meet", false));
userSet.addUser(new User("you", true));

const iterator = userSet.getIterator();

for (let i = 0; i < 6; ++i) {
  console.log(iterator.next());
}
