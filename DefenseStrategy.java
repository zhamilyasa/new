package StrategyObserver;

public class DefenseStrategy implements Strategy{
    private int defenceIndex;

    public DefenseStrategy(int defenceIndex) {
        this.defenceIndex = defenceIndex;
    }

    @Override
    public void execute() {
        if (defenceIndex > 80) {
            System.out.println("Қорғаныс шараларының деңгейі жоғары ");
        } else if (defenceIndex > 60) {
            System.out.println("Қорғаныс шараларының деңгейі орташа ");
        } else {
            System.out.println("Қорғаныс шараларының деңгейі төмен ");
        }
    }
}
// біз осы жерде  қорғаныс жүйесінің басқару логикасын көрсеттік
