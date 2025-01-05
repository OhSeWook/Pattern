package iterator.chapter01;

import iterator.chapter01.menu.DinerMenu;
import iterator.chapter01.menu.PancakeHouseMenu;

public class ClientMain {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.run();
    }


}
