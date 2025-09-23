public class CheckIndex {
    private CheckIndex() {} // 인스턴스화 방지

    public static void checkIndex(int i, Index index) {
        if (i == Rows.LEFT) {
            index.sub();
            return;
        }
        if (i == Rows.RIGHT) {
            index.add();
            return;
        }
    }
}