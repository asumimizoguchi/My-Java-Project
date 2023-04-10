/*
date: 1/17/2020
author: Asumi
purpose: This program reads three points representing a triangle and
calculates the area of the triangle twice, using the Heron’s method and vector method.
*/

import java.util.Scanner;
class calcArea {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        double p1x, p1y, p2x, p2y, p3x, p3y; //input variables
        double area; //output variable
        double d12, d23, d13, s; //temporary variables for Heron's method
        double v12x, v12y, v13x, v13y; //temporary variables for vector method
     
        System.out.print("Enter p1x:");
        p1x = in.nextDouble();
        System.out.print("Enter p1y:");
        p1y = in.nextDouble();
        System.out.print("Enter p2x:");
        p2x = in.nextDouble();
        System.out.print("Enter p2y:");
        p2y = in.nextDouble();
        System.out.print("Enter p3x:");
        p3x = in.nextDouble();
        System.out.print("Enter p3y:");
        p3y = in.nextDouble();

        //steps for calculating area using the Heron's method
        d12 = Math.sqrt((p2x-p1x)*(p2x-p1x)+(p2y-p1y)*(p2y-p1y));
        d23 = Math.sqrt((p3x-p2x)*(p3x-p2x)+(p3y-p2y)*(p3y-p2y));
        d13 = Math.sqrt((p3x-p1x)*(p3x-p1x)+(p3y-p1y)*(p3y-p1y));
        s=(d12+d23+d13)/2;
        area=Math.sqrt(s*(s-d12)*(s-d23)*(s-d13));
        
        System.out.println("area using Heron's = " + area);

        //steps for calculating area using the vector method
        //(p1x,p1y), (p2x,p2y),(p3x,p3y)
        //(p1x-p1x,p1y-p1y), (p2x-p1x, p2y-p1y), (p2x-p1x, p3y-p1y)
        //                   (v12x,    v12y)   , (v13x,    v13y)
        System.out.println("area using vectors = " + area); 
        v12x =(p2x-p1x);
        v12y =(p2y-p1y);
        v13x =(p3x-p1x);
        v13y =(p3y-p1y);
        area =1.0/2.0*Math.abs((v12x*v13y)-(v13x*v12y));
        
        //test with several different triangles
        //(3,4), (6,0), (2,7) = 2,49999999
        //(1,1), (2,2), (3,3) =0
        //(-2,5), (0,-5), (7,2) = 41.99999999
    }
}