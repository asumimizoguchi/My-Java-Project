/*
date: Feb 20, 2020
author: Asumi
purpose: This project reads a line and a line segment and then determines
whether they intersect or not. When they overlap completely, consider that as intersecting.
 */

import java.util.Scanner;
public class checkAngle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double lp1x, lp1y, lp2x, lp2y, sp1x, sp1y, sp2x, sp2y;
        
        System.out.println("Enter lp1x:");
        lp1x = in.nextDouble();
        System.out.println("Enter lp1y:");
        lp1y = in.nextDouble();
        System.out.println("Enter lp2x:");
        lp2x = in.nextDouble();
        System.out.println("Enter lp2y:");
        lp2y = in.nextDouble();
        System.out.println("Enter sp1x:");
        sp1x = in.nextDouble();
        System.out.println("Enter sp1y:");
        sp1y = in.nextDouble();
        System.out.println("Enter sp2x:");
        sp2x = in.nextDouble();
        System.out.println("Enter sp2y:");
        sp2y = in.nextDouble();
        
        /*if (lp1x == lp2x && sp1x == sp2x)
                System.out.println("non-intersecting");
        else {
            double l1 = (lp2x-lp1x)*(sp1y-lp1y)-(lp2y-lp1y)*(sp1x-lp1x);
            double l2 = (lp2x-lp1x)*(sp2y-lp1y)-(lp2y-lp1y)*(sp2x-lp1x);
            if (lp1x == lp2x && sp1x != sp2x)
                if (l1 >= 0 && l2 <= 0)
                    System.out.println("intersecting");
                else if (l1 <= 0 && l2 >= 0)
                    System.out.println("intersecting");
                else
                    System.out.println("non-intersecting");
        else 
            if (sp1x == sp2x && lp1x != lp2x)
                    System.out.println("intersecting");
        else 
            if ((lp2y - lp1y)*(sp2x - sp1x) == (lp2x - lp1x)*(sp2y - sp1y))
                if(l1 == l2)
                System.out.println("intersecting");
                else
                System.out.println("non-intersecting");
            else if ((lp2y - lp1y)*(sp2x - sp1x) != (lp2x - lp1x)*(sp2y - sp1y))
                if (l1 >= 0 && l2 <= 0)
                    System.out.println("intersecting");
                else if (l1 <= 0 && l2 >= 0)
                    System.out.println("intersecting");
                else
                    System.out.println("non-intersecting");
        }   */
        
        //correct to this  
        if (lp1x == lp2x)
            if (sp1x == sp2x)
                if (lp1x == sp1x)
                    System.out.println("intersecting");
                else
                    System.out.println("non-intersecting");
            else
                if (lp1x >= Math.max(sp1x, sp2x)&& lp1x <=Math.min(sp1x, sp2x))
                    System.out.println("intersecting");
                else
                    System.out.println("non-intersecting");
        else 
            if (sp1x == sp2x)
                if (sp1y >= Math.min(lp1y, lp2y)&& sp2y <=Math.max(lp1y, lp2y))
                    System.out.println("intersecting");
                else
                    System.out.println("non-intersecting");
        else 
            if ((lp2y - lp1y)/(lp2x-lp1x) == (sp2y-sp1y)/(sp2x-sp1x))
                if (lp1y == sp1y || lp1y == sp2y || lp2y == sp1y || lp2y == sp2y)
                System.out.println("intersecting");
                else 
                System.out.println("non-intersecting");
            else 
                if(Math.max(lp1y, lp2y) <= Math.max(sp1y, sp2y)&& Math.max(lp1y, lp2y) >= Math.min(sp1y, sp2y)&& Math.min(lp1y, lp2y) <= Math.max(sp1y, sp2y)&&  Math.min(lp1y, lp2y) >= Math.min(sp1y, sp2y))
                    System.out.println("intersecting");
                else
                    System.out.println("non-intersecting");  
    }   
}
