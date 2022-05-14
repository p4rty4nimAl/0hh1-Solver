package tk.p4rty;

import java.util.ArrayList;

public static abstract class Utils {

    public static Character[][] convertToBoard(String stringBoard, int sideLength) {
        Character[][] board = new Character[sideLength][sideLength];
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                board[i][j] = stringBoard.charAt((i * sideLength) + j);
            }
        }
        return board;
    }

    public static int getBoardSize(String board) {
        return (int) Math.sqrt(board.length());
    }
    public static class Validation {
        public static int isValidBoard(String board) {
            if (!isSquareBoard(board)) return 0;
            if (getBoardSize(board) % 2 == 1) return 1;
            if (!isBoardOnly(board)) return 2;
            return 3;
        }
        private static boolean isSquareBoard(String board) {
            double length = Math.sqrt(board.length());
            return length - Math.floor(length) == 0;
        }
        private static boolean isBoardOnly(String board) {
            for (int i = 0; i < board.length(); i++) {
                if (board.charAt(i) != 'r' && board.charAt(i) != 'b' && board.charAt(i) != '-') return false;
            }
            return true;
        }
    }
}
