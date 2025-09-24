import java.util.Random;


public class AutoLadderCreator extends LadderCreator {
    private AutoLadderCreator(NaturalNum row, NaturalNum numberOfPerson) {
        super(row, numberOfPerson);
        autoDrawLines(row, numberOfPerson);
    }

    public static AutoLadderCreator of(NaturalNum row, NaturalNum numberOfPerson) {
        return new AutoLadderCreator(row, numberOfPerson);
    }

    private void autoDrawLines(NaturalNum row, NaturalNum numberOfPerson) {
        int rowCount = row.getNaturalNum();
        int colCount = numberOfPerson.getNaturalNum();
        int totalLines = (int)(rowCount * colCount * 0.3);

        Random random = new Random();

        while (totalLines > 0) {
            int rowIndex = random.nextInt(rowCount);
            int col = random.nextInt(colCount - 1) + 1;

            Height height = new Height(rowIndex);
            try {
                drawLine(NaturalNum.of(col), height);
                totalLines--;
            } catch (IllegalArgumentException e) {
                //일단 넘어가
            }
        }
    }
}
