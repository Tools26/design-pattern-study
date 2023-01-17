export interface IComponent {
  add?: (c: IComponent) => void;
  remnove?: (C: IComponent) => void;
  getInfo: () => void;
  getName: () => void;
}
