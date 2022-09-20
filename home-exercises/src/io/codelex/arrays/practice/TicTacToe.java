package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        initBoard();
        boolean end = false;
        int row = 0;
        int column = 0;
        int turn = 1;
        while (!findWinner(board) || isEmpty(board)) {
            System.out.println("Enter the row and column! ");
            row = keyboard.nextInt();
            column = keyboard.nextInt();
            if (board[row][column] == 'x' || board[row][column] == 'o') {
                System.out.println("Occupied");
                continue;
            }
            if (turn == 1) {
                board[row][column] = 'x';
                turn = 2;
                displayBoard();
            } else if (turn == 2) {
                board[row][column] = 'o';
                turn = 1;
                displayBoard();
            }
        }

    }
    public static boolean isEmpty (char[][] board) {
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length ; j++) {
                if (board[i][j] != '0' && board[i][j] != 'x'){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findWinner(char[][] board) {
        return (board[0][0] == board[0][1] && board[0][0] == board[0][2]) ||
                (board[0][0] == board[1][1] && board[0][0] == board[2][2]) ||
                (board[0][0] == board[1][0] && board[0][0] == board[2][0]) ||
                (board[2][0] == board[2][1] && board[2][0] == board[2][2]) ||
                (board[2][0] == board[1][1] && board[0][0] == board[0][2]) ||
                (board[0][2] == board[1][2] && board[0][2] == board[2][2]) ||
                (board[0][1] == board[1][1] && board[0][1] == board[2][1]) ||
                (board[1][0] == board[1][1] && board[1][0] == board[1][2]);

    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}