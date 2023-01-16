abstract public class Decorator implements Component {
    private Component component;

    public Decorator(Component c) { // 즉 자신의 상위 클래스를 가져와서 메소드를 호출하기 위함
        this.component = c;
    }

    @Override
    public void draw() {
        component.draw();
    }

    @Override
    public String printS() {
        return component.printS();
    }
}
