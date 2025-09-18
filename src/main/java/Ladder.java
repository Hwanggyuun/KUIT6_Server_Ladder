public class Ladder {

    //todo 사다리 책임 분배
    private final Row[] rows;

    public Ladder(GreaterThanOne row, GreaterThanOne numberOfPerson) {
        rows = new Row[numberOfPerson.getNumber()];
        for (int i = 0; i < numberOfPerson.getNumber(); i++) {
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
