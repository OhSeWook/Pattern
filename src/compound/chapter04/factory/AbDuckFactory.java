package compound.chapter04.factory;

import compound.chapter04.duck.Quackable;

public abstract class AbDuckFactory {
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createGooseDuck();
}
