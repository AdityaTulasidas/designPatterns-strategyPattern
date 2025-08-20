// Iterator Pattern Example from Head First Design Patterns
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class PancakeHouseMenu {
    List<String> menuItems;
    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
    }
    public void addItem(String item) {
        menuItems.add(item);
    }
    public Iterator<String> createIterator() {
        return menuItems.iterator();
    }
}

public class IteratorPatternDemo {
    public static void main(String[] args) {
        PancakeHouseMenu menu = new PancakeHouseMenu();
        Iterator<String> iterator = menu.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

