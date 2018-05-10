package study.apach.observers.classes;


public enum ObserverType {
    CITIZEN(Citizen.class), AIR_DEFENCE_FORCE(AirDefenceForce.class), UN_SECURITY_COUNCIL(UNSecurityCouncil.class);

    ObserverType(Class type) {
        this.type = type;
    }

    private Class type;

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }
}
