public class WaterOnCommand implements Command{
    private Vanding vanding;

    public WaterOnCommand(Vanding vanding){
        this.vanding = vanding;
    }

    @Override
    public void execute(){
        vanding.water();
    }
}
