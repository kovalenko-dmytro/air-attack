package study.apach.observers.classes;

import study.apach.event.EventType;
import study.apach.observers.ObserverUnit;
import study.apach.observers.behavior.Hide;

public class Citizen extends ObserverUnit {

    public Citizen() {
        setBehavior(EventType.AIR_ATTACK, new Hide());
    }

}
