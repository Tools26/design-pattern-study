public class BorderDecorator extends Decorator{
    private String border;


    public BorderDecorator(Component c) {
        super(c); // 즉 Decorator(c)를 호출
    }

    private void drawBorder(){
        this.border = " 근데 Border 곁들인..";
    }

    @Override
    public void draw() {
        super.draw(); // 상위 클래스 메소드를 호출
        drawBorder(); // 자신의 메소드를 호출
    }

    @Override
    public String printS() {
        return super.printS() + this.border;
    }
}
