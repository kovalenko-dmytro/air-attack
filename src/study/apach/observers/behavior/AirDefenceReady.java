package study.apach.observers.behavior;

public class AirDefenceReady implements Behavior {

    @Override
    public void todo() {
        System.out.println("ПВО докладывает: ЗРК развернуты и готовы к бою");
    }
}
