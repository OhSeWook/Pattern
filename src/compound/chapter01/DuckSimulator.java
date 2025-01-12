package compound.chapter01;

import compound.chapter01.adapter.GooseAdapter;
import compound.chapter01.duck.Goose;
import compound.chapter01.duck.MallardDuck;
import compound.chapter01.duck.Quackable;
import compound.chapter01.duck.RedheadDuck;

public class DuckSimulator {

    void simulate() {
        Quackable mallarDuck = new MallardDuck();
        Quackable redDuck = new RedheadDuck();
        GooseAdapter gooseAdapter = new GooseAdapter(new Goose());

        simulateQuack(mallarDuck);
        simulateQuack(redDuck);
        simulateQuack(gooseAdapter);
    }

    void simulateQuack(Quackable duck) {
        duck.quack();
    }
}
