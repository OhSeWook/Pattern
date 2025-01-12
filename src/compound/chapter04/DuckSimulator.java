package compound.chapter04;

import compound.chapter04.composit.Flock;
import compound.chapter04.decorator.QuackCount;
import compound.chapter04.duck.Quackable;
import compound.chapter04.factory.AbDuckFactory;
import compound.chapter04.factory.DuckFactory;

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
