public class Ladder {

    //todo 사다리 책임 분배
    private final Row[] rows;

    // todo int 타입 포장 (numberOfPerson)
    public Ladder(int row, int numberOfPerson) {
        rows = new Row[numberOfPerson];
        for (int i = 0; i < numberOfPerson; i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(int row, int col){
        rows[row].drawLine(col);
    }

    // todo int 타입 포장 (Position)
    public int run(int position){
        for(int i=0; i<rows.length; i++){
            position = rows[i].nextPosition(position);
        }
        return position;
    }
}
