package compound.chapter05.composit;

import compound.chapter05.duck.Quackable;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private List<Quackable> list = new ArrayList<Quackable>();

    public void add(Quackable quackable) {
        list.add(quackable);
    }

    @Override
    public void quack() {
        list.forEach(Quackable::quack);
    }
}
