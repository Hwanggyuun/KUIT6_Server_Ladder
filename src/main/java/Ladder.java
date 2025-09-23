public class Ladder {

    private final Rows rows;

    public Ladder(NaturalNum row, NaturalNum numberOfPerson) {
        this.rows = new Rows(row, numberOfPerson);
    }

    public int run(NaturalNum S){
        Index index = new Index(S);
        for (int[] ints : rows.toMatrix()) {
            int i = index.readValue(ints);
            CheckIndex.checkIndex(i, index);
        }
        return index.getResult();
    }

    //todo 싫어
    public void drawLine(NaturalNum leftColumn, NaturalNum rightColumn, Height height) {
        rows.draw(leftColumn,rightColumn,height);
    }


}
