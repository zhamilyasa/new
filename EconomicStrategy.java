package StrategyObserver;

public class EconomicStrategy implements Strategy{
    private double economicIndicator;

    public EconomicStrategy(double economicIndicator) {
        this.economicIndicator = economicIndicator;
    }

    @Override
    public void execute() {
        if (economicIndicator > 4.0) {
            System.out.println("Даму стратегиясының агрессивті деңгейін әзірлеу");
        } else if (economicIndicator > 3.0) {
            System.out.println("Даму стратегиясының қалыпты деңгейін әзірлеу");
        } else {
            System.out.println("Даму стратегиясының төменгі деңгейін әзірлеу");
        }
    }

    // біз осы жерде экономиканы басқару жүйесінің логикасын көрсеттік

}

