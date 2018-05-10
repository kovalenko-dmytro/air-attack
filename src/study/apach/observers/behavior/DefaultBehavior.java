package study.apach.observers.behavior;

public class DefaultBehavior implements Behavior {
    @Override
    public void todo() {
        System.out.println("Это не наше дело...");
    }
}
