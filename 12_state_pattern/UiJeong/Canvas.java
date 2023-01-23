public class Canvas {
    // 한번 선언하면 변경할 수 없는 값
    final State emptyCanvas;
    final State paintingCanvas;

    // 현재 상태를 저장할 변수
    private State currentCanvas;

    public Canvas() {
        this.emptyCanvas = new EmptyCanvas(this);
        this.paintingCanvas = new PaintingCanvas(this);

        //최초 상태는 emptyCanvas
        this.currentCanvas = this.emptyCanvas;
    }

    // State에 있는 함수
    public void paintCanvas(){
        this.currentCanvas.paint();
    }

    public void exitCanvas(){
        this.currentCanvas.exit();
    }

    public void saveCanvas(){
        this.currentCanvas.save();
    }

    public void setState(State s){
        this.currentCanvas = s;
    }

    public State getEmptyCanvas(){
        return this.emptyCanvas;
    }

    public State getPaintingCanvas(){
        return this.paintingCanvas;
    }
}
