public class Main {
    public static void main(String[] args){
        Vanding v = new Vanding(); // 리시버

        WaterOnCommand wc = new WaterOnCommand(v);
        SnackOnCommand sc = new SnackOnCommand(v);

        Button b = new Button(wc); // 인보커
        b.pressButton(); // 물 주문

        b.setCommand(sc); // 과자로 변경
        b.pressButton(); // 과자 주문
    }

}
