public class Main {
    public static void main(String[] args){
        Canvas canvas = new Canvas();

        canvas.saveCanvas(); // 최초상태(빈 캔버스)에서 저장

        // paint -> Painting Canvas로 상태변환
        canvas.paintCanvas();

        // 상태 변환 없음 -> 계속 그림 그리는 중~
        canvas.paintCanvas();

        // 저장 하지 않고 exit -> 경고문
        canvas.exitCanvas();

        // 저장 -> 빈 캔버스로 상태 변환
        canvas.saveCanvas();

        // 빈 캔버스에서 exit -> 그림판 종료 되었습니다. 알림
        canvas.exitCanvas();
    }
}
