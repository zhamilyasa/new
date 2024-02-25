package StrategyObserver;

public class EducationStrategy implements Strategy{
    // біз осы жерде  оқу жүйесінің басқару логикасын көрсетеміз
    private String educationalNeeds;

    public EducationStrategy(String educationalNeeds) {
        this.educationalNeeds = educationalNeeds;
    }

    @Override
    public void execute() {
            System.out.println("Оқу бағдарламасын " + educationalNeeds + " бойынша әзірлеу ");
    }
}
