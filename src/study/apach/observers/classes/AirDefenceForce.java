package study.apach.observers.classes;

import study.apach.event.EventType;
import study.apach.observers.ObserverUnit;
import study.apach.observers.behavior.AirDefenceReady;

public class AirDefenceForce extends ObserverUnit {

    public AirDefenceForce() {
        setBehavior(EventType.AIR_ATTACK, new AirDefenceReady());
    }

}
