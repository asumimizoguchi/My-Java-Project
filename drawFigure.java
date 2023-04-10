/*
date: March 27, 2020
author: Asumi
purpose: 
*/

import java.util.Scanner;
class Triangle {
    int n;
    
    void setTriangle(int nn) {
        n = nn;
    }

    void drawTri1() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    void drawTri1R90() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) 
                System.out.print("*");
            System.out.println();
            
        }
    }
    
    void drawTri1R180() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print(" ");
            for (int j = 1; j <= n-i+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    void drawTri1R270() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) 
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    void drawTri2() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }   
    }
    
    void drawTri2R90() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print("*");
            System.out.println();
        }
    }
    
    void drawTri2R180() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) 
                System.out.print("*");
            System.out.println();
        }
    }
    
    void drawTri2R270() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print(" ");
            for (int j = 1; j <= n-i+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
        
    void drawTri3() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2*i-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    void drawTri3R90() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
    void drawTri3R180() {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2*i-1; j++)
                System.out.print("*");
            System.out.println();
            
        }
    }
    
    void drawTri3R270() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) 
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print(" ");
            for (int j = 1; j <= n-i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

public class drawFigure {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int size;

        System.out.println("Enter a size: ");
        size = in.nextInt();

        Triangle T = new Triangle();
        T.setTriangle(size);
        System.out.println("Triangle 1");
        T.drawTri1();
        System.out.println("Triangle 1 at 90 degrees");
        T.drawTri1R90();
        System.out.println("Triangle 1 at 180 degrees");
        T.drawTri1R180();
        System.out.println("Triangle 1 at 270 degrees");
        T.drawTri1R270();
        System.out.println("Triangle 2");
        T.drawTri2();
        System.out.println("Triangle 2 at 90 degrees");
        T.drawTri2R90();
        System.out.println("Triangle 2 at 180 degrees");
        T.drawTri2R180();
        System.out.println("Triangle 2 at 270 degrees");
        T.drawTri2R270();
        System.out.println("Triangle 3");
        T.drawTri3();
        System.out.println("Triangle 3 at 90 degrees");
        T.drawTri3R90();
        System.out.println("Triangle 3 at 180 degrees");
        T.drawTri3R180();
        System.out.println("Triangle 3 at 270 degrees");
        T.drawTri3R270();
    }
}
