package compound.chapter05.observer.subject;

import compound.chapter05.observer.log.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements QuackObservable {

    List<Observer> list = new ArrayList<>();
    QuackObservable quackObservable;

    public Subject(QuackObservable quackObservable) {
        this.quackObservable = quackObservable;
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        list.stream()
                .forEach(f->f.update(quackObservable));
    }
}
