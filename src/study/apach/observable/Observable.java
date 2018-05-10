package study.apach.observable;

import study.apach.observers.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void notifyObservers();
}
