package tk.p4rty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static tk.p4rty.Utils.convertToBoard;
import static tk.p4rty.Utils.getBoardSize;
import static tk.p4rty.Utils.Validation.*;

public class Main {

    public static void main(String[] args) {
        Scanner inputBoard = new Scanner(System.in);
        System.out.println("Program ran with args: " + Arrays.toString(args) + "\n Enter a board: ");
        String board = inputBoard.nextLine();
        switch (isValidBoard(board)) {
            case 0:
                System.out.println("Board Invalid: board is not square.");
                return;
            case 1:
                System.out.println("Board Invalid: board is of odd length sides.");
                return;
            case 2:
                System.out.println("Board Invalid: board is of invalid characters");
                return;
            case 3:
                break;
        }
        Character[][] unsolvedBoard = convertToBoard(board, getBoardSize(board));
        System.out.println(Arrays.deepToString(unsolvedBoard));
    }
}
