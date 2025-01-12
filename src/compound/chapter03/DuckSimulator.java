package compound.chapter03;

import compound.chapter03.decorator.QuackCount;
import compound.chapter03.duck.Quackable;
import compound.chapter03.factory.AbDuckFactory;
import compound.chapter03.factory.DuckFactory;

public class DuckSimulator {

    void simulate() {
        AbDuckFactory factory = new DuckFactory();
        Quackable mallarDuck = factory.createMallardDuck();
        Quackable redDuck = factory.createRedHeadDuck();
        Quackable gooseAdapter = factory.createGooseDuck();

        simulateQuack(mallarDuck);
        simulateQuack(redDuck);
        simulateQuack(gooseAdapter);
    }

    void simulateQuack(Quackable duck) {
        duck.quack();
    }

    int getCount(){
        return QuackCount.count;
    }
}
