package composite;

import composite.menu.Menu;
import composite.menu.MenuComponet;
import composite.menu.MenuItem;

import java.util.Iterator;

public class Waitress {

    MenuComponet menuComponet;

    public Waitress(MenuComponet menuComponet) {
        this.menuComponet = menuComponet;
    }

    public void printMenu(){
        menuComponet.print();
    }
}
