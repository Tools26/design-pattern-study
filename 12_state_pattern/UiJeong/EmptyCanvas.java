public class EmptyCanvas implements State{
    private final Canvas canvas; // 변경할 수 없는 값

    public EmptyCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void paint() {
        // painting 상태 변환
        canvas.setState(this.canvas.getPaintingCanvas());
    }

    @Override
    public void save() {
        System.out.println("빈 캔버스가 저장되었습니다");
    }

    @Override
    public void exit() {
        System.out.println("그림판이 종료되었습니다.");
    }
}
