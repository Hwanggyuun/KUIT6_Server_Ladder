public class Ladder {

    private final Rows rows;
    public Ladder(int row, int numberOfPerson) {
        this.rows = new Rows(row, numberOfPerson);
    }

    public int run(SelectedIndex S){
        Index index = new Index(S);
        for (int[] ints : rows.all()) {
            int i = index.readValue(ints);
            Index.checkIndex(i, index);
        }
        return index.getResult();
    }

    public void drawLine(int a, int b, Height height) {
        rows.draw(a,b,height);
    }


}
