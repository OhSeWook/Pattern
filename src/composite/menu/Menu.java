package composite.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponet {

    List<MenuComponet> list = new ArrayList<MenuComponet>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponet componet) {
        list.add(componet);
    }

    public void remove(MenuComponet componet) {
        list.remove(componet);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println(name + " " + description);
        for (MenuComponet componet : list) {
            componet.print();
        }
    }
}
