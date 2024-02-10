public class Subscriber implements MyObserver{
    @Override
    public void update(Source observable) {
        System.out.println("live result: Thai " + 
                ((Reporter)observable).getScoreLine() + "-0 UAE");
    }
    
}
