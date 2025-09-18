public class Height {
    private int height;

    public Height(int height) {
        this.height = height;
    }

    public boolean isMax(int max) {
        return this.height >= max;
    }

    public int current() {
        return this.height;
    }
}