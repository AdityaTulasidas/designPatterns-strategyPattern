package pattern.strategy.service;

public interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}

class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}

