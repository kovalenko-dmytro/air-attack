package study.apach.observers;

import study.apach.observers.classes.ObserverType;
import study.apach.event.EventType;
import study.apach.observable.Observable;
import study.apach.observers.behavior.Behavior;

import java.util.HashMap;
import java.util.Map;

public abstract class ObserverUnit implements Observer {

    private Map<EventType, Behavior> behaviorMap = new HashMap<>();
    private Observable target;

    public static ObserverUnit createObserverUnit(ObserverType type) {

        ObserverUnit instance = null;
        try {
            instance = (ObserverUnit) type.getType().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return instance;
    }

    @Override
    public void update(EventType type) {
        System.out.print(this.getClass().getSimpleName() + ": ");

        if (behaviorMap.get(type) != null) {
            todo(type);
        } else {
            System.out.println("У нас нет инструкций для этого события.");
        }
    }

    public void setBehavior(EventType type, Behavior behavior) {
        behaviorMap.put(type, behavior);
    }

    public Observable getTarget() {
        return target;
    }

    public void setTarget(Observable target) {
        this.target = target;
    }

    private void todo(EventType type) {
        behaviorMap.get(type).todo();
    }
}
