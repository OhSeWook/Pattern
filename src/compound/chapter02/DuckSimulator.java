package compound.chapter02;

import compound.chapter02.adapter.GooseAdapter;
import compound.chapter02.decorator.QuackCount;
import compound.chapter02.duck.Goose;
import compound.chapter02.duck.MallardDuck;
import compound.chapter02.duck.Quackable;
import compound.chapter02.duck.RedheadDuck;

public class DuckSimulator {

    void simulate() {
        Quackable mallarDuck = new QuackCount(new MallardDuck());
        Quackable redDuck = new QuackCount(new RedheadDuck());
        GooseAdapter gooseAdapter = new GooseAdapter(new Goose());

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
