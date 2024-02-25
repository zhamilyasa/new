package StrategyObserver;

import java.util.ArrayList;
import java.util.List;

public class Government implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String data) {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    public void changeTaxPolicy(String newPolicy) {
        notifyObservers(newPolicy);
    }

}
