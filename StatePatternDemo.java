// State Pattern Example from Head First Design Patterns

interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}

class NoQuarterState implements State {
    GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }
    public void dispense() {
        System.out.println("You need to pay first");
    }
}

class HasQuarterState implements State {
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}

class SoldState implements State {
    GumballMachine gumballMachine;
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}

class GumballMachine {
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state;
    public GumballMachine() {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        state = noQuarterState;
    }
    void setState(State state) { this.state = state; }
    public State getNoQuarterState() { return noQuarterState; }
    public State getHasQuarterState() { return hasQuarterState; }
    public State getSoldState() { return soldState; }
    public void insertQuarter() { state.insertQuarter(); }
    public void ejectQuarter() { state.ejectQuarter(); }
    public void turnCrank() { state.turnCrank(); state.dispense(); }
}

public class StatePatternDemo {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
    }
}

