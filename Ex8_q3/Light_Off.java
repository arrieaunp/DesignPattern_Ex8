public class Light_Off implements Command{
    private Light light;

    public Light_Off(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
    
}
