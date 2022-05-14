package tk.p4rty;

public class Board {
    private final Character[][] board;
    private final int sideLength;

    public Board(Character[][] board, int sideLength) {
        this.board = board;
        this.sideLength = sideLength;
    }
    @Override
    public String toString() {
        return Arrays.deepToString(board);
    }
    public int getSize() {
        return sideLength;
    }
}