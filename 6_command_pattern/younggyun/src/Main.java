public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light livingRoomLight = new Light("living room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        System.out.println(remote);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        remote.undoButtonWasPushed();
        remote.undoButtonWasPushed();
        remote.undoButtonWasPushed();

        Light restRoomLight = new Light("rest room");
        LightOnCommand restRoomLightOn = new LightOnCommand(restRoomLight);
        LightOffCommand restRoomLightOff = new LightOffCommand(restRoomLight);
        remote.setCommand(1, restRoomLightOn, restRoomLightOff);
        System.out.println(remote);

        remote.onButtonWasPushed(1);

        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(0);

        remote.undoButtonWasPushed();
        remote.undoButtonWasPushed();
    }
}