package compound.chapter03.factory;

import compound.chapter03.duck.Quackable;

public abstract class AbDuckFactory {
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createMallardDuck();
    public abstract Quackable createGooseDuck();
}
