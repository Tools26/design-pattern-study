import { Iterator } from "./Iterator";
import { User } from "./User";

export interface Aggregator {
  getIterator(): Iterator<User>;
}
