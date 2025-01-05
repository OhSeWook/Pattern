package iterator.chapter01.menu;

import iterator.chapter01.iterator.Iterator;
import iterator.chapter01.iterator.PancakeHouseMenuIterator;
import lombok.Getter;

import java.util.ArrayList;
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

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

}
