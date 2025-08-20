// Template Method Pattern Example from Head First Design Patterns

abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

class Tea extends CaffeineBeverage {
    void brew() {
        System.out.println("Steeping the tea");
    }
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}

class Coffee extends CaffeineBeverage {
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}

