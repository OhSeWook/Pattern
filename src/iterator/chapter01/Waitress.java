package iterator.chapter01;

import iterator.chapter01.iterator.Iterator;
import iterator.chapter01.menu.DinerMenu;
import iterator.chapter01.menu.MenuItem;
import iterator.chapter01.menu.PancakeHouseMenu;

import java.util.List;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void run() {

        MenuItem[] dinerMenuMenuItems = dinerMenu.getMenuItems();
        List<MenuItem> pancakeHouseMenuMenuItems = pancakeHouseMenu.getMenuItems();

        //캡슐화 하기전
        for (MenuItem menuItem : pancakeHouseMenuMenuItems) {
            System.out.println(menuItem.getName() + " " + menuItem.getDescription() + " " + menuItem.getPrice() + " " + menuItem.getPrice());
        }

        for (MenuItem menuItem : dinerMenuMenuItems) {
            System.out.println(menuItem.getName() + " " + menuItem.getDescription() + " " + menuItem.getPrice() + " " + menuItem.getPrice());
        }

        //반복 잡업을 캡슐화
        printMenu(dinerMenu.createIterator());
        printMenu(pancakeHouseMenu.createIterator());
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hashNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " " + menuItem.getDescription() + " " + menuItem.getPrice() + " " + menuItem.getPrice());
        }
    }
}
