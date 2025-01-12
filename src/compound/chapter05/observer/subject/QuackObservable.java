package compound.chapter05.observer.subject;


import compound.chapter05.observer.log.Observer;

public interface QuackObservable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
}
