public class Light_On implements Command{
    private Light light;

    public Light_On(Light light){
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.on();
    }
    
}
