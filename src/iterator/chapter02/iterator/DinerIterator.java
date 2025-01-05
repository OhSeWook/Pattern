package iterator.chapter02.iterator;

import iterator.chapter02.menu.MenuItem;

import java.util.Iterator;
import java.util.function.Consumer;

public class DinerIterator implements Iterator {

    MenuItem[] menuItems;
    int index;

    public DinerIterator(MenuItem[] menuItem) {
        this.menuItems = menuItem;
    }

    @Override
    public boolean hasNext() {
        return index < menuItems.length;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[index];
        index++;
        return menuItem;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
