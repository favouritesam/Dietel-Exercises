package TicTacToeTwo;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        get the names of both players
        System.out.println("Player 1:What is your name?  ");
        String Player1 = input.next();
        System.out.println("Player 2: What is your name? ");
        String Player2 = input.next();

//        3*3 tictactoe board
//        creat an empty board
//        player 1
//        player 2
        char[][] board = new char[3][3];
//        fill the board with dashes
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                board [i][j] = '_';
            }
        }
//        draw a drawBoard
        drawBoard(board);
//        keep track of whose turn it is
        boolean isplayer1 = true;
//        keep track of which symbol being played with
        char symbol = ' ';
        if (isplayer1){
            symbol = 'x';
        }else {
            symbol = 'o';
            while (true){

            }

        }
//        get row and colum from user
        System.out.println("Enter a row(0,1 or 2):");
        int row = input.nextInt();
        System.out.println("Enter a colum(0,1 or 2):");
        int colum = input.nextInt();
//        check if the row and colum are valid
        if (row < 0 || colum < 0 || row > 2 || colum >2){
//            row and colum are out of bounds
            System.out.println("your row and colum are out of bounds!");
        } else if (board[row][colum]!='_') {
//            board positioner has an x or o
            System.out.println("someone has already made a move there!");

        }

    }
//    print out board
    public static void drawBoard(char[][]board){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }
}
