package StrategyObserver;

public class Executer {
    public static void main(String[] args) {

        StrategicModel model = new StrategicModel();

        model.executeStrategies();                                   // стратегия орындалуы

        Government government = new Government();
        EconomicAnalyst analyst1 = new EconomicAnalyst();
        EconomicAnalyst analyst2 = new EconomicAnalyst();

        EconomicStrategy ecomomicLow = new EconomicStrategy(3.0-1);

        government.registerObserver(analyst1);
        government.registerObserver(analyst2);

        government.changeTaxPolicy(" Повышение налогов для лиц с высоким уровнем дохода");

        government.removeObserver(analyst2);

        government.changeTaxPolicy("Снижение налогов для малого бизнеса");


    }
}
