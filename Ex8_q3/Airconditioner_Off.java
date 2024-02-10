public class Airconditioner_Off implements Command{
    private Airconditioner airConditioner;
    
    public Airconditioner_Off(Airconditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.off();
    }
    
}
