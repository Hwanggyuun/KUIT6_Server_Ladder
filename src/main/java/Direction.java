public enum Direction {
    RIGHT(1),
    LEFT(-1);
    private final int direction;
    Direction(int direction) {
        this.direction = direction;
    }

    public int getValue() {
        return direction;
    }
}
