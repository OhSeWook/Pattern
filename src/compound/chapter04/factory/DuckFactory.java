package compound.chapter04.factory;

import compound.chapter04.adapter.GooseAdapter;
import compound.chapter04.decorator.QuackCount;
import compound.chapter04.duck.Goose;
import compound.chapter04.duck.MallardDuck;
import compound.chapter04.duck.Quackable;
import compound.chapter04.duck.RedheadDuck;

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
