/*
date: Oct 22, 2020
author: Asumi Mizoguchi
purpose: A look at our search algorithms using recursion!
*/

import java.util.Scanner;
class Polynomial{
    final int MAX= 20;
    private int[] p;
    int n;
    
    //constructor
    public Polynomial(int[] array){
        p = new int [MAX];
        this.n = -1;
    }

    //get and set methods for data members
    public int[] getP(){
	return p;
    }

    public void setP(int[] array){
	p = array;
    }
    
    public int getN(){
	return n;
    }

    public void setN(int n){
	this.n = n;
    }

    public void readP(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter degree.");
        n = in.nextInt();
        
        for(int i=n; i>=0; i--){
            System.out.print("Enter cofficient.");
            p[i] = in.nextInt();
        }
        System.out.println();
    }
    
    public void printP(int n){
        if(p[0]<0)
            System.out.print(" - ");

        for (int i=n; i>=0; i--){
            if(p[i]!=0){
                if(p[i]>1){
                    if(i>=2)
                        System.out.print(p[i] + "x^" + i);
                    if(i==1)
                        System.out.print(p[i]+ "x");
                    if(i==0)
                        System.out.print(p[i]);
                }
                else if(p[i]==1){
                    if(i>=2)
                        System.out.print("x^" + i);
                    if(i==1)
                        System.out.print("x");
                    if(i==0)
                        System.out.print(p[i]);
                }
                if(p[i] < -1){
                    if(i>=2)
                        System.out.print(p[i]*-1 + "x^" + i);
                    if(i==1)
                        System.out.print(p[i]*-1+ "x");
                    if(i==0)
                        System.out.print(p[i]*-1);
                }else if(p[i]==-1){
                    if(i>=2)
                        System.out.print("x^" + i);
                    if(i==1)
                        System.out.print("x");
                    if(i==0)
                        System.out.print(p[i]);
                }if(p[i]<=0){
                    System.out.print(" - ");
                }else
                    System.out.print(" + "); 
            }
        }   
        if(p[n]>0)
            System.out.print(p[n]);
        else
            System.out.print(p[n] * -1);
        System.out.println();  
    }
    
    public double evalP(double x){
        int total = 0;    
        for (int i=n; i>0; i--)
            total += (p[i]*(Math.pow(x, i)));
        total+=p[n];
        System.out.println();
        return total;
    }
    
    public void addP(Polynomial p1){
        for(int i=0; i<n; i++)
            p[i] += p1.p[i];
    }

    public void multiplyP(Polynomial p1){
        for(int i=0; i<n; i++)
            p[i] += p[i]*p1.p[i];
    }
}//close class

public class searchAlgorithm {
  
    public static void main(String[] args) {

        int[] a = {2,1,3};
        Polynomial poly = new Polynomial(a);
        Polynomial p1 = new Polynomial(a);
        
        poly.readP();
        poly.printP(3);
        System.out.println(poly.evalP(3));
        poly.addP(p1);
        poly.multiplyP(p1);
    }
    
}