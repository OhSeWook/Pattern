package compound.chapter05.factory;

import compound.chapter05.duck.Quackable;

public abstract class AbDuckFactory {
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createGooseDuck();
}
