package compound.chapter05.factory;

import compound.chapter05.adapter.GooseAdapter;
import compound.chapter05.decorator.QuackCount;
import compound.chapter05.duck.Goose;
import compound.chapter05.duck.MallardDuck;
import compound.chapter05.duck.Quackable;
import compound.chapter05.duck.RedheadDuck;

public class DuckFactory extends AbDuckFactory {

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCount(new RedheadDuck());
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quackable createGooseDuck() {
        return new QuackCount(new GooseAdapter(new Goose()));
    }
}
