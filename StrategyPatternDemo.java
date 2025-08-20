// Strategy Pattern Example from Head First Design Patterns

// The Duck class uses a FlyBehavior and QuackBehavior
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    public abstract void display();
}

// FlyBehavior interface and implementations
interface FlyBehavior {
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

// QuackBehavior interface and implementations
interface QuackBehavior {
    void quack();
}
class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

// A concrete Duck
class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

// Test the pattern
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        // Change behavior at runtime
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}

