/*
date: Sep 3, 2020
author: Asumi
purpose: This program is to write a java program of bean machine 
*/

import java.util.Scanner;
public class beanMachine {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of balls to drop: ");
    int numberOfBalls = in.nextInt();

    System.out.print("Enter the number of slots: ");
    int numberOfSlots = in.nextInt();
    
    System.out.print("Here is a summary of the path each ball took:");
    System.out.println();
    
    int[] slots = new int[numberOfSlots + 1];
    String rotation;
    for (int i=0; i<numberOfBalls; i++){
        int sum = 0;
        for (int j = 0; j < numberOfSlots; j++){
            int randomNumber = (int)(Math.random()*2);
                sum += randomNumber;
                if(randomNumber == 0)
                    rotation = "L";
                else
                    rotation = "R";
                System.out.print(rotation);
        }
            slots[sum]++;
            System.out.println();
    }
    System.out.println();
    System.out.println("Here is a sample histogram showing the balls in the resulting slots:");
    String[] ball = new String[numberOfSlots + 1];
    for (int i = numberOfBalls; i>0; i--){
        for (int j =1; j<= numberOfSlots; j++){
            if (i == slots[j]){
                ball[j] = "*";
                slots[j]--;
            }else
                ball[j] = " ";                  
            System.out.print(ball[j]);
        }
        System.out.println();    
    } 
    for (int j =1; j<= numberOfSlots; j++) {
        System.out.print(j);
    }
}
}