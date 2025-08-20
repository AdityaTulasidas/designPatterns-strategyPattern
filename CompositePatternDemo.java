// Composite Pattern Example from Head First Design Patterns
import java.util.ArrayList;
import java.util.List;

abstract class MenuComponent {
    public void add(MenuComponent menuComponent) { throw new UnsupportedOperationException(); }
    public void remove(MenuComponent menuComponent) { throw new UnsupportedOperationException(); }
    public MenuComponent getChild(int i) { throw new UnsupportedOperationException(); }
    public String getName() { throw new UnsupportedOperationException(); }
    public void print() { throw new UnsupportedOperationException(); }
}

class MenuItem extends MenuComponent {
    String name;
    public MenuItem(String name) { this.name = name; }
    public String getName() { return name; }
    public void print() { System.out.println("  " + getName()); }
}

class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    public Menu(String name) { this.name = name; }
    public void add(MenuComponent menuComponent) { menuComponents.add(menuComponent); }
    public void print() {
        System.out.println(getName());
        for (MenuComponent mc : menuComponents) {
            mc.print();
        }
    }
    public String getName() { return name; }
}

public class CompositePatternDemo {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("PANCAKE HOUSE MENU");
        MenuComponent dinerMenu = new Menu("DINER MENU");
        MenuComponent allMenus = new Menu("ALL MENUS");
        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        pancakeMenu.add(new MenuItem("Pancake Breakfast"));
        dinerMenu.add(new MenuItem("BLT"));
        allMenus.print();
    }
}

