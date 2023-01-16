public class TextView implements Component { // BaseComponent
    private String result;
    @Override
    public void draw() {
        this.result = "TextView 완성이다~";
    }

    public String printS() {
        return result;
    }
}
