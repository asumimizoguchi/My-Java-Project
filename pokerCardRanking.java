/*
date: Mar 1, 2020
author: Asumi
purpose: This project reads 5 integers, 
each of which is in the range of 1 and 13 representing a simplified poker card with no suit.
Your program should then print the ranking of the hand with card number(s) besides the ranking. 
 */

import java.util.Scanner;
class polerCardRanking {       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1, n2, n3, n4, n5;
        
        System.out.print("Enter n1(1-13): "); 
            n1 = in.nextInt();
        if (n1 < 1 || n1 > 13)
            System.out.println("Enter n1 between 1 and 13.");
        System.out.print("Enter n2(1-13): "); 
            n2 = in.nextInt();
        if (n2 < 1 || n2 > 13)
            System.out.println("Enter n2 between 1 and 13.");
        System.out.print("Enter n3(1-13): "); 
            n3 = in.nextInt();
        if (n3 < 1 || n3 > 13)
            System.out.println("Enter n3 between 1 and 13.");
        System.out.print("Enter n4(1-13): "); 
            n4 = in.nextInt();
        if (n4 < 1 || n4 > 13)
            System.out.println("Enter n4 between 1 and 13."); 
        System.out.print("Enter n5(1-13): "); 
            n5 = in.nextInt();
        if (n5 < 1 || n5 > 13)
            System.out.println("Enter n5 between 1 and 13.");
      
        
        if (n1 > n2) {
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n2 > n3) {
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n3 > n4) {
            int t = n3;
            n3 = n4;
            n4 = t;
        }
        if (n4 > n5) {
            int t = n4;
            n4 = n5;
            n5 = t;
        }       
        if (n1 > n2) {
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n2 > n3) {
            int t = n2;
            n2 = n3;
            n3 = t;
        }
        if (n3 > n4) {
            int t = n3;
            n3 = n4;
            n4 = t;
        }       
        if (n1 > n2) {
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        if (n2 > n3) {
            int t = n2;
            n2 = n3;
            n3 = t;
        }        
        if (n1 > n2) {
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        
        System.out.println(n1+", "+n2+", "+n3+", "+n4+", "+n5);
        
        if (n1 == n4) {
            System.out.println("Four of a kind ("+n2+")");
        }else if (n2 == n5) {
            System.out.println("Four of a kind ("+n2+")");
        }else if (n1 == n3) {
            if (n4 == n5)
                System.out.println("Full house("+n2+","+n4+")");
            else
                System.out.println("Three of a kind("+n3+")");
        }else if (n3 == n5) {
            if (n1 == n2)
                System.out.println("Full house("+n2+","+n4+")");
            else
                System.out.println("Three of a kind("+n3+")");
        }else if (n2 == n4) {
            System.out.println("Three of a kind("+n3+")");
        }else if (n5-n4 == 1 && n4-n3 == 1 && n3-n2 == 1 && n2-n1 == 1) {
            System.out.println("Straight("+n5+")");            
        }else if (n1 == 1 && n5 == 13) {
            if (n5-n4 == 1 && n4-n3 == 1 && n3-n2 == 1)
                System.out.println("Straight("+n1+")");
            else
                System.out.println("High card("+n1+")");
        }else if (n1 == n2) {
            if (n3 == n4)
                System.out.println("Two Pair("+n2+","+n4+")");
            else if (n4 == n5)
                System.out.println("Two Pair("+n2+","+n4+")");
                else
                System.out.println("one Pair("+n4+")");
        }else if (n2 == n3) {
            if (n4 == n5)
                System.out.println("Two Pair("+n2+","+n4+")");
            else
                System.out.println("one Pair("+n2+")");
        }else if (n3 == n4) {
            System.out.println("one Pair("+n3+")");
        }else if (n4 == n5) {
            System.out.println("one Pair("+n4+")");
        }else if (n1 == 1) {
            System.out.println("High card("+n1+")");     
        }else
            System.out.println("High card("+n5+")"); 
        }
    }
