/*
date: Sep 9, 2020
author: Asumi
purpose: This program is to write a java program which will allow two users to play tic, tac, toe. 
*/

import java.util.Scanner;
public class ticTocToe {
    public static char[][] board = new char[3][3];
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, column;
        char player = 'X';

        char[][] board;
        board = new char[3][3];
        char ch = '1';
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++) {
                board[i][j] = ch++;
            }
        }
        
    
        displayBoard(board);
        while(!winner(board) == true){
            System.out.println("Enter a row (1,2, or 3) for player" + player+ ":");
            row = in.nextInt();
            System.out.println("Enter a column (1,2, or 3); for player" + player+":");
            column = in.nextInt();

            if (board[row][column] == 'X' || board[row][column] == 'O') {
                System.out.println("This spot is occupied. Please choose another spot again");
            }
            
            board[row][column] = player;
            displayBoard(board);

            if (winner(board)){
                System.out.println("Player " + player + " is the winner!");
            }
      
            if (player == 'O') {
                player = 'X';
            }
            else {
                player = 'O';
            }
            
            if (winner(board) == false) {
            System.out.println("The game is a draw. Please try again.");
            } 
        }
    }
        
    public static void displayBoard (char[][] board) { 
    System.out.println(" ---------------");
        for (int i = 0; i < board.length; i++) {              
            for (int j = 0; j < board[i].length; j++) {                  
                if (j == board[i].length - 1)
                    System.out.print(board[i][j]);                      
                else 
                    System.out.print(board[i][j] + " |   | ");
            }
            System.out.println();
            System.out.print(" ---------------");
            System.out.println();
        }   
    }
    
    public static Boolean winner(char[][] board){
    boolean occupied = true;
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j < board[0].length; j++) { 
                if(board[i][j] != 'O' || board[i][j] != 'X') {
                    occupied = false;
            }
        }
    }
    if(occupied)
        return false;

    return  (board[1][1] == board [1][2] && board[1][1] == board [1][3]) ||
            (board[1][1] == board [2][2] && board[1][1] == board [3][3]) ||
            (board[1][1] == board [2][1] && board[1][1] == board [3][1]) ||
            (board[3][1] == board [3][2] && board[3][1] == board [3][3]) ||
            (board[3][1] == board [2][2] && board[1][1] == board [1][3]) ||
            (board[1][3] == board [2][3] && board[1][3] == board [3][3]) ||
            (board[1][2] == board [2][2] && board[1][2] == board [3][2]) ||
            (board[2][1] == board [2][2] && board[2][1] == board [2][3]);
    }
}

