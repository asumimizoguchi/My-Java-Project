/*
date: Sep 16, 2020
author: Asumi
purpose: This program is to write a java program which will test weather a randomly generated 2D array has 
         four consecutive numbers of hte same value.  
*/

import java.util.Scanner;
public class 2DArray {
    static boolean checkVer(int[][] a){
        for (int i =0; i<a.length-3; i++){ //a.length-3 because we need to check at 4 numbers
            for(int j=0; j<a[i].length; j++){
                if (a[i][j] == a[i+1][j] && 
                    a[i+1][j] == a[i+2][j] &&
                    a[i+2][j] == a[i+3][j]){
                        return true;
                }
            }
        }
        return false;
    }
    
    static boolean checkHori(int[][] a){
        for (int i =0; i<a.length; i++){
            for(int j=0; j<a[i].length-3; j++){ //a.length-3 because we need to check at 4 numbers
                if(a[i][j] == a[i][j+1] && 
                   a[i][j+1] == a[i][j+2] && 
                   a[i][j+2] == a[i][j+3]){
                        return true;
                }
            }
        }
        return false;
    }
    
    static boolean checkDiago(int[][] a){
    //go down and right    
    for(int i=3; i < a.length; i++) {
        for(int j=0; j < a[i].length - 3; j++) {
            if (a[j][i] == a[j+1][i-1] &&
                a[j][i] == a[j+2][i-2] &&
                a[j][i] == a[j+3][i-3]){
                    return true;
            }
        }
    }
    //go up and left
    for (int i=0; i < a.length- 3; i++) {
        for(int j=0; j < a[i].length- 3; j++) {
            if(a[j][i] == a[j+1][i+1] &&
               a[j][i] == a[j+2][i+2] &&
               a[j][i] == a[j+3][i+3]){
                    return true;
            }
        }
    }
    return false;
    }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = input.nextInt();
        //generate random numbers in array
        int[][] a = new int[row][col];
            for (int r = 0; r < row; r++){
                for (int c = 0; c < col; c++) {
                    a[r][c] = (int)(Math.random()*10);
                    
                        System.out.print(a[r][c] + " ");
                }
            System.out.println();       
            }
            
        if(checkVer(a)){
            System.out.println("This array has 4 consecutive numbers in vertically.");
        }
        else if(checkHori(a)){
            System.out.println("This array has 4 consecutive numbers in horizontaliy.");
        }
        else if(checkDiago(a)){
            System.out.println("This array has 4 consecutive numbers in diagonally.");
        }
        else{
            System.out.println("No 4 consecutive numbers in this array.");
        }
}
}