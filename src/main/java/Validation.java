public class Validation {
    public static String RowsValidation(Row[] rows, int leftColumn, int rightColumn, Height height){
        int min = Math.min(leftColumn, rightColumn) - 1;
        int max = Math.max(leftColumn, rightColumn) - 1;

        if(Math.abs(leftColumn-rightColumn)!=1) {
            return ErrorMessage.NOT_ADJACENT.getMessage();
        }
        if(height.current() >= rows.length) {
            return ErrorMessage.OUT_OF_HEIGHT.getMessage();
        }
        if (leftColumn == rightColumn) return ErrorMessage.SAME_COLUMN.getMessage();
        if (rows[height.current()].line()[min] != 0 || rows[height.current()].line()[max] != 0) return ErrorMessage.SAME_COLUMN.getMessage();
        if (min - 1 >= 0 && rows[height.current()].line()[min - 1] == Rows.RIGHT) return ErrorMessage.SAME_COLUMN.getMessage();
        if (max + 1 < rows[0].length() && rows[height.current()].line()[max + 1] == Rows.LEFT) return ErrorMessage.SAME_COLUMN.getMessage();

        return null;
    }
}
