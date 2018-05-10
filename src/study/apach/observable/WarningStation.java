package study.apach.observable;

import study.apach.event.EventType;
import study.apach.observers.Observer;

import java.util.ArrayList;

public class WarningStation implements Observable {

    private ArrayList<Observer> observers;
    private EventType type;


    public WarningStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(type));
    }

    public void setEvent(EventType type) {
        switch (type) {
            case AIR_ATTACK:
                System.out.println("Внимание!!! Воздушная атака!!!");
                break;
            case FIRE:
                System.out.println("Пожар! Пожар! Пожар!");
                break;
            default:
                System.out.println("Что-то случилось....");
        }
        this.type = type;
        notifyObservers();
    }
}
