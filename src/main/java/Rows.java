public class Rows {
    private final int[][] rows;
    public static final int LEFT = 1;
    public static final int RIGHT = 2;

    public Rows(int row, int numberOfPerson) {
        this.rows = new int[row][numberOfPerson];
    }

    public void draw(int leftColumn, int rightColumn, Height height){
        if(height.current()>=rows.length)
            throw new IllegalArgumentException("길이를 넘었습니다.");
        if(leftColumn==rightColumn){
            throw new IllegalArgumentException("하나 차이나게 선을 그어주세요");
        }
        if(Math.abs(leftColumn-rightColumn)!=1) {
            throw new IllegalArgumentException("두 칸 이상은 선을 그을 수 없습니다.");
        }
        int min = Math.min(leftColumn, rightColumn) - 1;
        int max = Math.max(leftColumn, rightColumn) - 1;
        if (rows[height.current()][min] != 0 || rows[height.current()][max] != 0) {
            throw new IllegalArgumentException("이미 해당 위치에 선이 존재합니다.");
        }
        if (min - 1 >= 0 && rows[height.current()][min - 1] == RIGHT) {
            throw new IllegalArgumentException("바로 옆에 선이 있어서 추가할 수 없습니다.");
        }
        if (max + 1 < rows[0].length && rows[height.current()][max + 1] == LEFT) {
            throw new IllegalArgumentException("바로 옆에 선이 있어서 추가할 수 없습니다.");
        }
        rows[height.current()][min] = RIGHT;
        rows[height.current()][max] = LEFT;
    }

    public int[][] all() {
        return rows;
    }

}
