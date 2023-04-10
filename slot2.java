/*
date: Feb 21, 2020
author: Asumi
purpose: This program is that simulates a simplified slot machine with 5 reels.
        Each reel will display a digit(a number between 1 and 9) randomly.
 */

import java.util.Scanner;
import java.util.Random;
class slot2 {
    static int getPrize(int g1, int g2, int g3,int u1, int u2, int u3) {

        //code to determine the prize goes here
        int prize = 7;
        
        if (u1 == g1 && u2 == g2 && u3 == g3)
            prize = 1;
        //2
        else if (u1 == g2 && u2 == g3 && u3 == g1)
                prize = 2;
        else if (u1 == g3 && u2 == g1 && u3 == g2)
                prize = 2;
        else if (u1 == g1 && u2 == g3 && u3 == g2)
                prize = 2;
        else if (u1 == g3 && u2 == g2 && u3 == g1)
                prize = 2;
        else if (u1 == g2 && u2 == g1 && u3 == g3)
                prize = 2;
        //3
        else if (u2 == g2 && u3 == g3)
                prize = 3;
        else if (u1 == g1 && u3 == g3)
                prize = 3;
        else if (u1 == g1 && u2 == g2)
                prize = 3;
        //4
        else if (u1 == g1 && u3 == g2)
                prize =4;
        else if (u1 == g1 && u2 == g3)
                prize =4;
        else if (u1 == g2 && u2 == g1)
                prize =4;
        else if (u1 == g2 && u3 == g1)
                prize =4;
        else if (u1 == g2 && u2 == g3)
                prize =4;
        else if (u1 == g2 && u3 == g3)
                prize =4;
        else if (u1 == g3 && u2 == g2)
                prize =4;
        else if (u1 == g3 && u3 == g2)
                prize =4;
        else if (u1 == g3 && u2 == g1)
                prize =4;
        else if (u1 == g3 && u3 == g1)
                prize =4;
        else if (u2 == g1 && u3 == g2)
                prize =4;
        else if (u2 == g2 && u3 == g1)
                prize =4;
        else if (u2 == g1 && u3 == g3)
                prize =4;
        else if (u2 == g3 && u3 == g1)
                prize =4;
        else if (u2 == g3 && u3 == g2)
                prize =4;
        //5
        else if (u1 == g1)
                prize = 5;
        else if (u2 == g2)
                prize = 5;
        else if (u3 == 3)
                prize = 5;
        //6
        else if (u2 == g1)
                prize = 6;
        else if (u3 == g1)
                prize = 6;
        else if (u1 == g2)
                prize = 6;
        else if (u3 == g2)
                prize = 6;
        else if (u1 == g3)
                prize = 6;
        else if (u2 == g3)
                prize = 6;
        
        return prize;
    }
    
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int g1, g2, g3; //3 digits generated
        int u1, u2, u3; //3 digits entered by user
        int prize;

        g1 = rand.nextInt(10); //generate an integer between 0 and 9;
        g2 = rand.nextInt(10);
        g3 = rand.nextInt(10);

        System.out.print("Enter the first digit(0-9):");
        u1 = in.nextInt();
        System.out.print("Enter the second digit(0-9):");
        u2 = in.nextInt();      
        System.out.print("Enter the third digit(0-9):");
        u3 = in.nextInt();

        //call getPrize method and print the result.
        prize = getPrize(g1, g2, g3, u1, u2, u3);
        switch (prize) {
            case 1:
                System.out.println("You got the first prize!");
                break;
            case 2:
                System.out.println("You got the second prize!");
                break;
            case 3:
                System.out.println("You got the thrid prize!");
                break;
            case 4:
                System.out.println("You got the fourth prize!");
                break;
            case 5:
                System.out.println("You got the fifth prize!");
                break;
            case 6:
                System.out.println("You got the sixth prize!");
                break;  
            default:
                System.out.println("No, prize! Sorry!");
                break;  
        }
   }
}