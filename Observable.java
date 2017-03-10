import java.util.ArrayList;

public class Observable {
  private ArrayList<Observer> observers = 
    new ArrayList<Observer>();

    public void addObserver(Observer o) {
      observers.add(o);
    }

    public void notifyObservers(String msg) {
      for (Observer o : observers) {
        o.myNotify(msg);
      }
    }

}