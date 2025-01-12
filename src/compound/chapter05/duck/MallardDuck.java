package compound.chapter05.duck;

import compound.chapter05.observer.subject.Subject;

public class MallardDuck implements Quackable {
    Subject subject;

    public MallardDuck() {
        this.subject = new Subject(this);
    }

    @Override
    public void quack() {
        System.out.println("Mallard Quack");
    }
}
