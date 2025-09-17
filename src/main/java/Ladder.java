public class Ladder {

    private final Row[] rows;

    public Ladder(int row, int numberOfPerson) {
        rows = new Row[numberOfPerson];
        for (int i = 0; i < numberOfPerson; i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(int row, int col){
        rows[row].drawLine(col);
    }

    public int run(int position){
        for(int i=0; i<rows.length; i++){
            position = rows[i].nextPosition(position);
        }
        return position;
    }
}
