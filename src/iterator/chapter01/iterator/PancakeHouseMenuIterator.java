package iterator.chapter01.iterator;

import iterator.chapter01.menu.MenuItem;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    private final List<MenuItem> list;
    private int index = 0;

    public PancakeHouseMenuIterator(List<MenuItem> list) {
        this.list = list;
    }

    @Override
    public boolean hashNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = list.get(index);
        index++;
        return menuItem;
    }
}
