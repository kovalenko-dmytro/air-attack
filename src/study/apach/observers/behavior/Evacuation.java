package study.apach.observers.behavior;

public class Evacuation implements Behavior {

    @Override
    public void todo() {
        System.out.println("Граждане покидают горящий дом");
    }
}
