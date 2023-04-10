/*
Date: Feb 28, 2020
Author: Asumi
Program purpose:
*/

import java.util.Scanner;
import java.util.Random;

class oxGame {
    static char getWinner(char b11, char b12, char b13, char b21, char b22, char b23, char b31, char b32, char b33) {
        //code for finding the winner
        char winner = 'N';
        //O
        if (b11 == 'O' && b12 == 'O'  && b13 == 'O'){
            winner = 'O';
                if (b21 == 'X' && b22 == 'X' && b23 == 'X')
                    winner = 'B';
                else if (b31 == 'X' && b32 == 'X' && b33 == 'X')
                    winner = 'B';
        }else if (b11 == 'O' && b21 == 'O' && b31 == 'O'){
            winner = 'O';
                if (b12 == 'X' && b22 == 'X' && b32 == 'X')
                    winner = 'B';
                else if (b13 == 'X' && b23 == 'X' && b33 == 'X')
                    winner = 'B';
        }else if (b11 == 'O' && b22 == 'O' && b33 == 'O'){
            winner = 'O';
        }else if (b12 == 'O' && b22 == 'O' && b32 == 'O'){
            winner = 'O';
                if (b11 == 'X' && b21 == 'X' && b31 == 'X')
                    winner = 'B';
                else if (b13 == 'X' && b23 == 'X' && b33 == 'X')
                    winner = 'B';
        }else if (b13 == 'O' && b23 == 'O' && b33 == 'O'){
            winner = 'O';
                if (b11 == 'X' && b21 == 'X' && b31 == 'X')
                    winner = 'B';
                else if (b13 == 'X' && b23 == 'X' && b33 == 'X')
                    winner = 'B';
        }else if (b21 == 'O' && b22 == 'O' && b23 == 'O'){
            winner = 'O';
                if (b11 == 'X' && b12 == 'X' && b13 == 'X')
                    winner = 'B';
                else if (b31 == 'X' && b32 == 'X' && b33 == 'X')
                    winner = 'B';
        }else if (b31 == 'O' && b32 == 'O' && b33 == 'O'){
            winner = 'O';
                if (b11 == 'X' && b12 == 'X' && b13 == 'X')
                    winner = 'B';
                else if (b21 == 'X' && b22 == 'X' && b23 == 'X')
                    winner = 'B';
        }else if (b13 == 'O' && b22 == 'O' && b31 == 'O'){
            winner = 'O';
        //X
        }else if (b11 == 'X' && b12 == 'X'  && b13 == 'X'){
            winner = 'X';
                if (b21 == 'O' && b22 == 'O' && b23 == 'O')
                    winner = 'B';
                else if (b31 == 'O' && b32 == 'O' && b33 == 'O')
                    winner = 'B';
        }else if (b11 == 'X' && b21 == 'X' && b31 == 'X'){
            winner = 'X';
                if (b12 == 'O' && b22 == 'O' && b32 == 'O')
                    winner = 'B';
                else if (b13 == 'O' && b23 == 'O' && b33 == 'O')
                    winner = 'B';
        }else if (b11 == 'X' && b22 == 'X' && b33 == 'X'){
            winner = 'X';
        }else if (b12 == 'X' && b22 == 'X' && b32 == 'X'){
            winner = 'X';
                if (b11 == 'O' && b21 == 'O' && b31 == 'O')
                    winner = 'B';
                else if (b13 == 'O' && b23 == 'O' && b33 == 'O')
                    winner = 'B';
        }else if (b13 == 'X' && b23 == 'X' && b33 == 'X'){
            winner = 'X';
                if (b11 == 'O' && b21 == 'O' && b31 == 'O')
                    winner = 'B';
                else if (b13 == 'O' && b23 == 'O' && b33 == 'O')
                    winner = 'B';
        }else if (b21 == 'X' && b22 == 'X' && b23 == 'X'){
            winner = 'X';
                if (b11 == 'O' && b12 == 'O' && b13 == 'O')
                    winner = 'B';
                else if (b31 == 'O' && b32 == 'O' && b33 == 'O')
                    winner = 'B';
        }else if (b31 == 'X' && b32 == 'X' && b33 == 'X'){
            winner = 'X';
                if (b11 == 'O' && b12 == 'O' && b13 == 'O')
                    winner = 'B';
                else if (b21 == 'O' && b22 == 'O' && b23 == 'O')
                    winner = 'B';
        }else if (b13 == 'X' && b22 == 'X' && b31 == 'X')
            winner = 'X';
        
        return winner;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        String ox = "OX_";
        char b11, b12, b13,
             b21, b22, b23,
             b31, b32, b33;

        int n;
        n = rnd.nextInt(3); //get 0, 1, or 2 randomly       
        b11 = ox.charAt(n);
        n = rnd.nextInt(3);       
        b12 = ox.charAt(n);
        n = rnd.nextInt(3);       
        b13 = ox.charAt(n);
        n = rnd.nextInt(3);       
        b21 = ox.charAt(n);
        n = rnd.nextInt(3);       
        b22 = ox.charAt(n);
        n = rnd.nextInt(3);       
        b23 = ox.charAt(n);
        n = rnd.nextInt(3);       
        b31 = ox.charAt(n);
        n = rnd.nextInt(3);       
        b32 = ox.charAt(n);
        n = rnd.nextInt(3);       
        b33 = ox.charAt(n);

        System.out.println(b11+" "+b12+" "+b13);
        System.out.println(b21+" "+b22+" "+b23);
        System.out.println(b31+" "+b32+" "+b33);

        char winner = getWinner(b11,b12,b13,b21,b22,b23,b31,b32,b33);
      
        //print winner - print one of the following:
        //O wins!
        //X wins!
        //Both win!
        //No one wins!
        switch (winner) {
            case 'O':
                System.out.println("O wins!");
                break;
            case 'X':
                System.out.println("X wins!");
                break;
            case 'B':
                System.out.println("Both win!");
                break; 
            default:
                System.out.println("No one wins!");       
        }
    }
}