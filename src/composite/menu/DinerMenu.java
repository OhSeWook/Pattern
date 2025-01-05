package composite.menu;

import composite.iterator.DinerIterator;
import lombok.Getter;

import java.util.Iterator;

@Getter
public class DinerMenu {

    static final int MAX_ITEMS = 6;
    private MenuItem[] menuItems;
    private int currentItem;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("채식주의자용 BLT", "상추 + 토마토 + 깻잎", true, 4.2);
        addItem("동물성 1BLT", "상추 + 토마토 + 깻잎", false, 5.6);
        addItem("동물성 2BLT", "상추 + 토마토 + 깻잎", false, 5.6);
        addItem("동물성 3BLT", "상추 + 토마토 + 깻잎", false, 5.6);
        addItem("동물성 4BLT", "상추 + 토마토 + 깻잎", false, 5.6);
        addItem("동물성 5BLT", "상추 + 토마토 + 깻잎", false, 5.6);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(currentItem == MAX_ITEMS) {
            System.out.println("메뉴 full 꽉참!!");
        }else{
            menuItems[currentItem] = menuItem;
            currentItem++;
        }
    }

//    @Override
//    public Iterator<MenuItem> createIterator() {
//        return new DinerIterator(menuItems);
//    }

}
