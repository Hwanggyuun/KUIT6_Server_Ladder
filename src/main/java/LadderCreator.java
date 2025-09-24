public class LadderCreator {
    private final Rows rows;

    private LadderCreator(NaturalNum row, NaturalNum numberOfPerson) {
        this.rows = new Rows(row, numberOfPerson);
    }
    public static LadderCreator of(NaturalNum row, NaturalNum numberOfPerson) {
        return new LadderCreator(row, numberOfPerson);
    }
    public Rows getRows(){
        return rows;
    }

    public void drawLine(NaturalNum leftColumn,  Height height) {
        rows.draw(leftColumn,height);
    }
}
