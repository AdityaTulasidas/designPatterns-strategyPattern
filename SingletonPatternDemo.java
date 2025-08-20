// Singleton Pattern Example from Head First Design Patterns

class Singleton {
    private static Singleton uniqueInstance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}

