public class SnackOnCommand implements Command{
    private Vanding vanding;

    public SnackOnCommand(Vanding vanding){
        this.vanding = vanding;
    }

    @Override
    public void execute(){
        vanding.snack();
    }
}
