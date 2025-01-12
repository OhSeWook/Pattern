package compound.chapter05.observer.log;

import compound.chapter05.observer.subject.QuackObservable;

public interface Observer {
    public void update(QuackObservable duck);
}
