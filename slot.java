/*
date: Feb 14, 2020
author: Asumi
purpose: This program is that simulates a simplified slot machine with 5 reels.
        Each reel will display a digit(a number between 1 and 9) randomly.
 */

import java.util.Scanner;
import java.util.Random;
class slot {
    public static void main(String [] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        
        int r1, r2, r3, r4, r5; //5 digits generated
        double prize = 0;

        r1 = rand.nextInt(9)+1; //generate an integer between 1 and 9
        r2 = rand.nextInt(9)+1;
        r3 = rand.nextInt(9)+1;
        r4 = rand.nextInt(9)+1;
        r5 = rand.nextInt(9)+1;
        System.out.println(r1+", "+r2+", "+r3+", "+r4+", "+r5);
        
        //(code for tallying money)
        //sort numbers
        if (r1 > r2) {
            int t = r1;
            r1 = r2;
            r2 = t;
        }
        if (r2 > r3) {
            int t = r2;
            r2 = r3;
            r3 = t;
        }
        if (r3 > r4) {
            int t = r3;
            r3 = r4;
            r4 = t;
        }
        if (r4 > r5) {
            int t = r4;
            r4 = r5;
            r5 = t;
        }
        if (r1 > r2) {
            int t = r1;
            r1 = r2;
            r2 = t;
        }
        if (r2 > r3) {
            int t = r2;
            r2 = r3;
            r3 = t;
        }
        if (r3 > r4) {
            int t = r3;
            r3 = r4;
            r4 = t;
        }
        if (r1 > r2) {
            int t = r1;
            r1 = r2;
            r2 = t;
        }
        if (r2 > r3) {
            int t = r2;
            r2 = r3;
            r3 = t;
        }
        if (r1 > r2) {
            int t = r1;
            r1 = r2;
            r2 = t;
        }      
        System.out.println(r1+", "+r2+", "+r3+", "+r4+", "+r5);
        
        //5
        if (r1 == r5) 
            prize = 10000;
        //4
        else if (r1 == r4)
            prize = 1000;
        else if (r2 == r5)
            prize = 1000;
        //3
        else if (r1 == r3){
            prize = 100;
            if (r4 == r5)
                prize = 110;
        }
        else if (r2 == r4)
            prize = 100;
        else if (r3 == r5){
            prize = 100;
            if (r1 == r2)
                prize = 110;
        }   
        //2
        else if (r1 == r2){
            prize = 10;
            if (r3 == r4)
                prize = 20;
            else if (r4 == r5)
                prize = 20;
        }
        else if (r2 == r3){
            prize = 10;
            if (r4 == r5)
                prize = 20;
        }
        else if (r3 == r4){
            prize = 10;
            if (r1 == r2)
                prize = 20;
        }
        else if (r4 == r5){
            prize = 10;
            if (r1 == r2)
                prize = 20;
            else if (r2 == r3)
                prize = 20;
        }
        //0
        else
            prize = 0;
        
        System.out.println("You won $"+prize+".");
   }
}
