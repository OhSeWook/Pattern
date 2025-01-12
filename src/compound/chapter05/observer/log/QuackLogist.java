package compound.chapter05.observer.log;

import compound.chapter05.observer.subject.QuackObservable;

public class QuackLogist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quack Quack Quack Quack Quack Quack");
    }
}
