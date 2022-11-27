public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) { // 명령 변경
        this.command = command;
    }

    public void pressButton() { // 명령 실행
        this.command.execute();
    }
}
