package composite.menu;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class PancakeHouseMenu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItme("펜케익 세트", "펜케익+콜라", false, 10.0);
        addItme("베지테리언 펜케익 세트", "펜케익+우유", true, 20.0);
    }

    private void addItme(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    @Override
//    public Iterator<MenuItem> createIterator() {
//        return menuItems.iterator();
//    }

}
