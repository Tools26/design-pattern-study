import java.util.Stack;

public class SimpleRemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> commandHistory;
    public SimpleRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        commandHistory = new Stack<>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        commandHistory.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        commandHistory.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if(commandHistory.isEmpty()) return;
        Command prevCommand = commandHistory.peek();
        commandHistory.pop();
        prevCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n-------리모컨---------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot "+i+"]"+onCommands[i].getClass().getName() +  " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
