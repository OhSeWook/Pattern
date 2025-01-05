package iterator.chapter02;

import iterator.chapter02.menu.Menu;
import iterator.chapter02.menu.MenuItem;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void run() {

        //반복 잡업을 캡슐화
        printMenu(dinerMenu.createIterator());
        printMenu(pancakeHouseMenu.createIterator());
    }

    public void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + " " + menuItem.getDescription() + " " + menuItem.getPrice() + " " + menuItem.getPrice());
        }
    }
}
