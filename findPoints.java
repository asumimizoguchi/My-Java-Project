/*
date: Jan. 30, 2020
author: Asumi
purpose: This project read three points that can form a triangle and 
then to find the smallest upright rectangle containing the triangle.  
Assume that an upright rectangle is represented by the two diagonal points – top-left and bottom-right corners.
 */

import java.util.Scanner;
public class findPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x1, x2, x3, y1, y2, y3; //input variables 
        int R, Ra, Rb, Rc, Rd; //output variables 
        
        System.out.print("Enter x1: ");
        x1 = in.nextInt();
        System.out.print("Enter y1: ");
        y1 = in.nextInt();
        System.out.print("Enter x2: ");
        x2 = in.nextInt();
        System.out.print("Enter y2: ");
        y2 = in.nextInt();
        System.out.print("Enter x3: ");
        x3 = in.nextInt();
        System.out.print("Enter y3: ");
        y3 = in.nextInt();
       
        //p1 = (0, 0), p2 = (4, 2) and p3 = (2, 3)
        //R = ((0, 3), (4, 0))
        
        Ra = Math.min(Math.min(x1, x2), x3);
        Rb = Math.max(Math.max(y1, y2), y3);
        Rc = Math.max(Math.max(x1, x2), x3);
        Rd = Math.min(Math.min(y1, y2), y3);
        
        System.out.println("R = ("+Ra+", "+Rb+"), ("+Rc+", "+Rd+")");
    }
}
