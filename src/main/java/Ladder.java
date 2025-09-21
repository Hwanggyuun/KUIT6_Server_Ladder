public class Ladder {

    //todo 사다리 책임 분배
    private final Row[] rows;

    public Ladder(GreaterThanOne row, GreaterThanOne numberOfPerson) {
        rows = new Row[numberOfPerson.getNumber()];
        for (int i = 0; i < numberOfPerson.getNumber(); i++) {
            rows[i] = new Row(numberOfPerson);
        }
    }

    public void drawLine(Position row, Position col){
        rows[row.getValue()].drawLine(col);
    }

    public int run(Position position){
        for(int i=0; i<rows.length; i++){
            rows[i].nextPosition(position);
        }
        return position.getValue();
    }
}
