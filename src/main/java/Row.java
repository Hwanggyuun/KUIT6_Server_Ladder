public class Row {

    //todo Node 객체 도입
    private final int[] row;

    public Row(GreaterThanOne numberOfPerson){
        validateNumberPerson(numberOfPerson.getNumber());
        row = new int[numberOfPerson.getNumber()];
    }

    public int nextPosition(int position){
        validatePosition(position);

        if(isRight(position)){
            return position + 1;
        }

        if(isLeft(position)){
            return position - 1;
        }
        return position;
    }

    private boolean isLeft(int position) {
        return row[position] == Direction.LEFT.getValue();
    }

    private boolean isRight(int position) {
        return row[position] == Direction.RIGHT.getValue();
    }

    private void validatePosition(int position) {
        if(position >= row.length || position < 0){
            throw new IllegalArgumentException(ErrorMessage.INVALID_POSITION.getMessage());
        }
    }

    public void drawLine(int startPosition){
        validateDrawLinePosition(startPosition);
        row[startPosition] = Direction.RIGHT.getValue();
        row[startPosition + 1] = Direction.LEFT.getValue();
    }

    private void validateDrawLinePosition(int startPosition) {
        if (startPosition >= row.length -1 || startPosition < 0 || row[startPosition] == -1 || row[startPosition + 1] == 1) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_DRAW_POSITION.getMessage());
        }
    }

    private void validateNumberPerson(int numberOfPerson) {
        if(numberOfPerson <= 1){
            throw new IllegalArgumentException("참여 인원은 1명 이상이어야 합니다.");
        }
    }
}
