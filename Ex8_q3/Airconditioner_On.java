public class Airconditioner_On implements Command{
    private Airconditioner airConditioner;
    
    public Airconditioner_On(Airconditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
       airConditioner.on();
       airConditioner.setTemp(25);
    }
    
}
