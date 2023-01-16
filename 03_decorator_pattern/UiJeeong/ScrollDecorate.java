public class ScrollDecorate extends Decorator{
    private String scroll;

    public ScrollDecorate(Component c) {
        super(c); // 즉 Decorator(c)를 호출
    }

    private void drawScroll(){
        this.scroll = " 근데 Scroll이 곁들인..";
    }

    @Override
    public void draw() {
        super.draw(); // 상위 클래스의 메소드를 호출
        drawScroll(); // 자신의 메소드를 호출

    }

    @Override
    public String printS() {
        return super.printS() + this.scroll;
    }
}
