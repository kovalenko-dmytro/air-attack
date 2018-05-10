package study.apach.observers;

import study.apach.event.EventType;
import study.apach.observers.behavior.Behavior;

public interface Observer {
    void update(EventType type);
}
