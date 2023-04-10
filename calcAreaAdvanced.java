/*
Date: Mar 6, 2020
Author: Asumi
Program purpose:Implement the 5 classes given below along with a main class and test every method in each class.
*/

import java.util.Scanner;
class Triangle {
    double p1x, p1y, p2x, p2y, p3x, p3y;  
    
    //constructer - a special method to create an object and initialize class variables at the same time
    Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        p1x = x1;
        p1y = y1;
        p2x = x2;
        p2y = y2;
        p3x = x3;
        p3y = y3;       
    }    

    void setTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        p1x = x1;
        p1y = y1;
        p2x = x2;
        p2y = y2;
        p3x = x3;
        p3y = y3;       
    }
            
    //Heron's formula for area of triangle
    double getArea() {
        double d12, d23, d13;
        d12 = Math.sqrt((p1x-p2x)*(p1x-p2x)+(p1y-p2y)*(p1y-p2y));
        d13 = Math.sqrt((p1x-p3x)*(p1x-p3x)+(p1y-p3y)*(p1y-p3y));
        d23 = Math.sqrt((p2x-p3x)*(p2x-p3x)+(p2y-p3y)*(p2y-p3y));
        
        double s = (d12+d13+d23)/2;
        
        return Math.sqrt(s*(s-d12)*(s-d13)*(s-d23));
    }
    
    double getPerimeter() {
        double d12, d23, d13;
        
        d12 = Math.sqrt((p1x-p2x)*(p1x-p2x)+(p1y-p2y)*(p1y-p2y));
        d13 = Math.sqrt((p1x-p3x)*(p1x-p3x)+(p1y-p3y)*(p1y-p3y));
        d23 = Math.sqrt((p2x-p3x)*(p2x-p3x)+(p2y-p3y)*(p2y-p3y));
        
        return d12+d13+d23;
    }
}

class Sphere {
    double radius;  
    
    //constructor, setSphere, getVolume, getSurfaceArea
    Sphere(double r) {
        radius = r;
    }
    
    void setSphere (double r) {
        radius = r;
    }
    
    double getVolume() {             
        return Math.PI*Math.pow(radius, 3)*(4/3);
    } 
    
    double getSurfaceArea() {       
        return Math.PI*4*Math.pow(radius, 2);
    } 
}    

class Cylinder {
    double radius, height;
    
    //constructor, setCylinder, getVolume, getSurfaceArea
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    
    void setCylinder(double r, double h) {
        radius = r;
        height = h;
    }
    
    double getVolume() {
        return Math.PI*Math.pow(radius, radius)*height;
    }
    
    double getSurfaceArea() {
        return 2*Math.PI*radius*(height+radius);
    }
}

class RectangularCuboid {
    double length, depth, height;
    
    //constructor, setRectangularCuboid, getVolume, getSurfaceArea
    RectangularCuboid(double l, double d, double h) {
        length = l;
        depth = d;
        height = h;
    }
    
    void setRectangularCuboid(double l, double d, double h) {
        length = l;
        depth = d;
        height = h;
    }
    
    double getVolume() {
        return length*depth*height;
    }
    
    double getSurfaceArea() {
        return 2*(length*depth+depth*height+height*length);
    }
}

class RegularTetrahedron {
    double edgeLength;
    //constructor, setRegularTetrahedron, getVolume, getSurfaceArea
    RegularTetrahedron(double e) {
        edgeLength = e;
    }
    
    void setRegularTetrahedron(double e) {
        edgeLength = e;
    }
    
    double getVolume() {
        return Math.pow(edgeLength, 3)/(6*Math.sqrt(2));
    }
    
    double getSurfaceArea() {
        return Math.sqrt(3)*Math.pow(edgeLength, 2);
    }
}

public class calcAreaAdvanced { 
    public static void main(String[] args) {        
        Triangle t1 = new Triangle(0,0,1,0,0,1);
        System.out.println("area of t1 ="+t1.getArea());
        System.out.println("Perimeter of t1 ="+t1.getPerimeter());
        System.out.println();
        t1.setTriangle(0,0,2,0,0,2);
        System.out.println("area of t1 ="+t1.getArea());
        System.out.println("Perimeter of t1 ="+t1.getPerimeter());
        System.out.println();
        
        Sphere s1 = new Sphere(2);       
        System.out.println("Volume of s1 ="+s1.getVolume());
        System.out.println("surfaceArea of s1 ="+s1.getSurfaceArea());
        System.out.println();
        s1.setSphere(1);
        System.out.println("Volume of s1 ="+s1.getVolume());
        System.out.println("surfaceArea of s1 ="+s1.getSurfaceArea());
        System.out.println();
        
        Cylinder c1 = new Cylinder(2,2);       
        System.out.println("Volume of c1 ="+c1.getVolume());
        System.out.println("surfaceArea of c1 ="+c1.getSurfaceArea());
        System.out.println();
        c1.setCylinder(3, 3);
        System.out.println("Volume of c1 ="+c1.getVolume());
        System.out.println("surfaceArea of c1 ="+c1.getSurfaceArea());
        System.out.println();
        
        RectangularCuboid r1 = new RectangularCuboid(2,2, 2);        
        System.out.println("Volume of r1 ="+r1.getVolume());
        System.out.println("surfaceArea of r1 ="+r1.getSurfaceArea());
        System.out.println();
        r1.setRectangularCuboid(1, 1, 1);
        System.out.println("Volume of r1 ="+r1.getVolume());
        System.out.println("surfaceArea of r1 ="+r1.getSurfaceArea());
        System.out.println();
        
        RegularTetrahedron rt1 = new RegularTetrahedron(2);     
        System.out.println("Volume of rt1 ="+rt1.getVolume());
        System.out.println("surfaceArea of rt1 ="+rt1.getSurfaceArea());
        System.out.println();
        rt1.setRegularTetrahedron(5);
        System.out.println("Volume of rt1 ="+rt1.getVolume());
        System.out.println("urfaceArea of rt1 ="+rt1.getSurfaceArea());
    }
}