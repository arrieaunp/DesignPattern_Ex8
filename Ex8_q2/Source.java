import java.util.ArrayList;

public class Source {
    ArrayList<MyObserver> observers; 
    public Source() {
        observers = new ArrayList<>();
    }
    public void addObserver(MyObserver obj) {
        observers.add(obj);
    }
    public void notifyObservers() {
        for (MyObserver observer: observers) {
            observer.update(this);
	}
    }
}
