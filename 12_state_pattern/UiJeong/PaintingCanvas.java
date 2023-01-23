public class PaintingCanvas implements State{
    private final Canvas canvas; // 변경할 수 없는 값

    public PaintingCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void paint() {
        System.out.println("계속 그림을 그리는 중~");
    }

    @Override
    public void save() {
        canvas.setState(canvas.getEmptyCanvas());
        System.out.println("해당 그림이 저장되었습니다");
    }

    @Override
    public void exit() {
        System.out.println("경고 : 저장 되지 않았습니다. 그림은 저장하세요");
    }
}
