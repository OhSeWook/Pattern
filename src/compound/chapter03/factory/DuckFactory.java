package compound.chapter03.factory;

import compound.chapter03.adapter.GooseAdapter;
import compound.chapter03.decorator.QuackCount;
import compound.chapter03.duck.Goose;
import compound.chapter03.duck.MallardDuck;
import compound.chapter03.duck.Quackable;
import compound.chapter03.duck.RedheadDuck;

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
