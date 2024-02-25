package StrategyObserver;

public class EconomicAnalyst implements Observer{
    private String report;

    @Override
    public void update(String data) {
        report = "Анализ влияния новой налоговой политики: " + data;
        System.out.println(report);
    }

    @Override
    public void update() {

    }
}
