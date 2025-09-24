public class LadderGame {

    private final LadderCreator ladderCreator;

    private LadderGame(LadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
    }

    public static LadderGame of(LadderCreator ladderCreator){
        return new LadderGame(ladderCreator);
    }

    public int run(NaturalNum n){
        int[][] ladderMatrix = ladderCreator.toMatrix();
        LadderRunner ladderRunner = LadderRunner.of(ladderMatrix);
        return ladderRunner.run(n);
    }
}