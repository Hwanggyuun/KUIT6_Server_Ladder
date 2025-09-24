import java.util.Arrays;

public class LadderRunner {

    private final int[][] ladderMatrix;

    private LadderRunner(int[][] ladderMatrix) {
        this.ladderMatrix = ladderMatrix;
    }

    public static LadderRunner of(int[][] ladderMatrix) {
        return new LadderRunner(ladderMatrix);
    }

    public int run(NaturalNum S) {
        Index index = new Index(S);
        int[][] matrix = this.ladderMatrix;
        int currentRow = 0;

        System.out.println("// " + (index.getResult() - 1) + " 번째로 들어온다.");
        System.out.println("Before");
        printLadder(matrix, currentRow, index.getResult() - 1);
        System.out.println();

        for (int[] ints : matrix) {
            int i = index.readValue(ints);

            if (i != 0) {
                System.out.println(getMovementMessage(i));
            }
            
            System.out.println("After");
            CheckIndex.checkIndex(i, index);
            printLadder(matrix, currentRow, index.getResult() - 1);
            System.out.println();

            if (currentRow < matrix.length - 1) {
                System.out.println("// 이동 후 아래로 한칸 내려간다.");
                System.out.println("Before");
                printLadder(matrix, currentRow + 1, index.getResult() - 1);
                System.out.println();
            }
            currentRow++;
        }
        return index.getResult();
    }

    private void printLadder(int[][] matrix, int currentRow, int currentColumn) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == currentRow && j == currentColumn) {
                    System.out.print(matrix[i][j] + "*");
                } else {
                    System.out.print(matrix[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private String getMovementMessage(int direction) {
        if (direction == Direction.LEFT.getValue()) {
            return "// 사다리의 -1을 만났으니 왼쪽으로 이동한다.";
        }
        if (direction == Direction.RIGHT.getValue()) {
            return "// 사다리의 1을 만났으니 오른쪽으로 이동한다.";
        }
        return "";
    }
}