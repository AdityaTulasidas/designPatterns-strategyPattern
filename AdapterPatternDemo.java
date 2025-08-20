// Adapter Pattern Example from Head First Design Patterns

interface Duck {
    void quack();
    void fly();
}

class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }
    public void fly() {
        System.out.println("I'm flying");
    }
}

class Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

class TurkeyAdapter implements Duck {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    public void quack() {
        turkey.gobble();
    }
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

public class AdapterPatternDemo {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new Turkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();
        System.out.println("The TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}

