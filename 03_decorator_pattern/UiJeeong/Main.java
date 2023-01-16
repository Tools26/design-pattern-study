public class Main {
    public static void main(String[] args){
        Window window = new Window(); // Window 객체

        // Component 객체 생성
        Component component = new BorderDecorator(new ScrollDecorate(new TextView()));

        component.draw(); // 그림을 그리고
        window.setContents(component); // 출력
        /*
         Window는 SetContents()에 정의된 Component 클래스로만 매개변수를 알고 있음. Decorator가 추가 되었다고 해서 변경할 필요가 없다.
         걍 기존의 클래스에 추가 된 느낌!!
         */
    }
}
