package study.apach;

import study.apach.event.EventType;
import study.apach.observable.WarningStation;
import study.apach.observers.*;
import study.apach.observers.behavior.DefaultBehavior;
import study.apach.observers.behavior.Evacuation;
import study.apach.observers.classes.AirDefenceForce;
import study.apach.observers.classes.Citizen;
import study.apach.observers.classes.ObserverType;
import study.apach.observers.classes.UNSecurityCouncil;

import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) {

        WarningStation station = new WarningStation();

        ArrayList<ObserverUnit> units = new ArrayList<>();

        for (ObserverType type : ObserverType.values()) {
            units.add(ObserverUnit.createObserverUnit(type));
        }

        units.forEach(unit -> {
            unit.setTarget(station);
            station.registerObserver(unit);
        });

        station.setEvent(EventType.AIR_ATTACK);
        System.out.println();

        station.setEvent(EventType.FIRE);
        System.out.println();

        units.forEach(unit -> {
            if (unit instanceof Citizen) {
                unit.setBehavior(EventType.FIRE, new Evacuation());
            }
            if (unit instanceof AirDefenceForce || unit instanceof UNSecurityCouncil) {
                unit.setBehavior(EventType.FIRE, new DefaultBehavior());
            }
        });

        station.setEvent(EventType.FIRE);
    }
}
