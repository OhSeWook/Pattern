package iterator.chapter01.iterator;

import iterator.chapter01.menu.MenuItem;

public class DinerIterator implements Iterator {

    MenuItem[] menuItems;
    int index;

    public DinerIterator(MenuItem[] menuItem) {
        this.menuItems = menuItem;
    }

    @Override
    public boolean hashNext() {
        return index < menuItems.length;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[index];
        index++;
        return menuItem;
    }
}
