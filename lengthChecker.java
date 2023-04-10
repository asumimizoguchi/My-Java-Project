/*
date: Feb 9, 2020
author: Asumi
purpose: This project takes the lengths of four sides, s1, s2, s3, and s4, 
and decides if the sides of the given lengths can form a quadrilateral.  
If they can, further determine if the quadrilateral can be a rectangle.  
Again, determine if the rectangle can be a square.
 */

 import java.util.Scanner;
 public class lengthChecker {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
         double sx1,sy1, sx2, sy2, sx3, sy3, sx4, sy4;
         
         
         System.out.println("Enter sx1:");
         sx1 = in.nextDouble();
         System.out.println("Enter sy1:");
         sy1 = in.nextDouble();
         System.out.println("Enter sx2:");
         sx2 = in.nextDouble();
         System.out.println("Enter sy2:");
         sy2 = in.nextDouble();
         System.out.println("Enter sx3:");
         sx3 = in.nextDouble();
         System.out.println("Enter sy3:");
         sy3 = in.nextDouble();
         System.out.println("Enter sx4:");
         sx4 = in.nextDouble();
         System.out.println("Enter sy4:");
         sy4 = in.nextDouble();
         
         double m1 = (sy1-sy2) / (sx1-sx2);
         double m2 = (sy4-sy2) / (sx4-sx2);
         double m3 = (sy3-sy4) / (sx3-sx4);
         double m4 = (sy3-sy1) / (sx3-sx1);
 
         if (m1 == m2)
             System.out.println("cannot form a quadrilateral.");
         else if (m2 == m3)
             System.out.println("cannot form a quadrilateral.");
         else if (m3 == m4)
             System.out.println("cannot form a quadrilateral.");
         else if (m1 == m4)
             System.out.println("cannot form a quadrilateral.");
         else
             System.out.println("can form a quadrilateral.");
         
         double s1 = Math.sqrt((sx1-sx2)*(sx1-sx2) + (sy1-sy2)*(sy1-sy2));
         double s2 = Math.sqrt((sx4-sx2)*(sx4-sx2) + (sy4-sy2)*(sy4-sy2));
         double s3 = Math.sqrt((sx3-sx4)*(sx3-sx4) + (sy3-sy4)*(sy3-sy4));
         double s4 = Math.sqrt((sx3-sx1)*(sx3-sx1) + (sy3-sy1)*(sy3-sy1));
         
         if (m1 == m3 && m2 == m4)
             if (s1 == s3 && s2 == s4 && s1 != s2)
             System.out.println("can form a rectangle.");
         else
             System.out.println("cannot form a rectangle.");    
         
         if (m1 == m3 && m2 == m4)
             if (s1 == s2 && s3 == s4)
             System.out.println("can form a squre.");
         else
             System.out.println("cannot form a squre.");  
     }
 }
 