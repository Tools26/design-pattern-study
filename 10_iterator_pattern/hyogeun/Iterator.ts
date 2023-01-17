export interface Iterator<T> {
  current(): T;
  next(): T;
  rewind(): void;
}
