package study.apach.observers.classes;

import study.apach.event.EventType;
import study.apach.observers.ObserverUnit;
import study.apach.observers.behavior.UNSСResolution;

public class UNSecurityCouncil extends ObserverUnit {

    public UNSecurityCouncil() {
        setBehavior(EventType.AIR_ATTACK, new UNSСResolution());
    }

}
