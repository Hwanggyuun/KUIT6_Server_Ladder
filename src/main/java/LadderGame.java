public class LadderGame {

    private final LadderCreator ladderCreator;

    private LadderGame(LadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
    }

    public static LadderGame of(LadderCreator ladderCreator){
        return new LadderGame(ladderCreator);
    }

    public int run(NaturalNum n){
        //사다리의 생성을 요청
        Rows rows = ladderCreator.getRows();
        //runner에게 완성된 사다리를 건네주기
        LadderRunner ladderRunner = LadderRunner.of(rows);
        //runner에게 사다리를 타라고 메세지를 보내기
        return ladderRunner.run(n);
    }


    public Rows getRows() {
        return ladderCreator.getRows();
    }
}