package StrategyObserver;

import java.util.ArrayList;
import java.util.List;

public class StrategicModel {
    private Strategy economicStrategy;
    private Strategy defenseStrategy;
    private Strategy educationStrategy;


    private final List<Observer> observers = new ArrayList<>();

    // observer қосу(тіркеу.) методы
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //observer-ге өзгерістер туралы хабарлау әдісі
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public StrategicModel() {
        this.economicStrategy = new EconomicStrategy(3.0);
        this.defenseStrategy = new DefenseStrategy(89);
        this.educationStrategy = new EducationStrategy("Patterns of Java");
    }

    public void setEconomicStrategy(Strategy economicStrategy) {
        this.economicStrategy = economicStrategy;
    }
    public void setEconomicStrategyLow(Strategy economicStrategy) {
        this.economicStrategy = economicStrategy;
    }


    public void setDefenseStrategy(Strategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void setEducationStrategy(Strategy educationStrategy) {
        this.educationStrategy = educationStrategy;
    }

  // стратегия орындалу барысы
    public void executeStrategies() {
        defenseStrategy.execute();
        economicStrategy.execute();
        educationStrategy.execute();
    }


    }

