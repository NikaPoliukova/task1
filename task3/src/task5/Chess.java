package task5;

import java.util.Arrays;

public class Chess {
    public static void execute() {
        System.out.println("Массив шахматная доска");
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
                System.out.print(chessBoard[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
