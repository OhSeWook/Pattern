package iterator.chapter02;

import iterator.chapter02.menu.DinerMenu;
import iterator.chapter02.menu.Menu;
import iterator.chapter02.menu.PancakeHouseMenu;

public class ClientMain {

    public static void main(String[] args) {
        Menu dinerMenu = new DinerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.run();
    }


}
