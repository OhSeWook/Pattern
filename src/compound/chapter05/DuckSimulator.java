package compound.chapter05;

import compound.chapter05.composit.Flock;
import compound.chapter05.decorator.QuackCount;
import compound.chapter05.duck.Quackable;
import compound.chapter05.factory.AbDuckFactory;
import compound.chapter05.factory.DuckFactory;

public class DuckSimulator {

    void simulate() {
        AbDuckFactory factory = new DuckFactory();
        Quackable mallarDuck = factory.createMallardDuck();
        Quackable redDuck = factory.createRedHeadDuck();
        Quackable gooseAdapter = factory.createGooseDuck();

        Flock flock = new Flock();
        flock.add(mallarDuck);
        flock.add(redDuck);
        flock.add(gooseAdapter);

        Flock mallFlock = new Flock();
        mallFlock.add(mallarDuck);
        mallFlock.add(flock);

        simulateQuack(flock);

        simulateQuack(mallFlock);
    }

    void simulateQuack(Quackable duck) {
        duck.quack();
    }

    int getCount(){
        return QuackCount.count;
    }
}
