/*
date: Aug 20,2021
author: Asumi
purpose: This program is to write a java program that uses nested loops to produce output from asterisks building the following shapes.
 */

import java.util.Scanner;
public class nestPractice {        
    static void printShapes(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++)
                System.out.print(" ");
            for (int k = 1; k <= 1; k++) 
                System.out.print("*");
            for (int l = 1; l <= 2*(n-i+1)-1; l++)
                System.out.print(" ");
            for (int k = 1; k <= 1; k++) 
                System.out.print("*");
            System.out.println();
        }
    }
 
    static void printShapes2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k =1; k <=2*(n-i+1)-2; k++)
                System.out.print(" ");          
            for (int j = 1; j <= i; j++)
                System.out.print("*");           
            System.out.println();   
        }
    }

    static void printShapes3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k =1; k <=i-1; k++)
                System.out.print(" ");
            for (int j = 1; j <=n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    static void printShapes4(int n) {
        for (int i = 1; i <= n; i+=2) {
            for (int j = 1; j <= i-2; j++) //j stops at i
                System.out.print("*");
            System.out.println();

        }
    }
    
    static void printShapes5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k<=n-i; k++)
                System.out.print(" ");                       
            for (int c = n-i+1; c >n-i; c--)
                for (int j = n-i+1; j <= n; j++)
                    System.out.print(c*j);  
            System.out.println();   
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer n: ");
        int n = in.nextInt();
        
        printShapes(n);
        printShapes2(n);
        printShapes3(n);
        printShapes4(n);
        printShapes5(n);
        
    }  
}
