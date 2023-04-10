/*
date: April 24, 2020
author: Asumi
purpose: 

*/
import java.util.Scanner;
class SieveOfEratosthenes {
    final int MAXSIZE = 100;
    boolean p[];
    int n;
    
    SieveOfEratosthenes() {
        p = new boolean[MAXSIZE];
        n = 0;
    }
    
    void setP(int nn) {
        n = nn;
        
        for (int i = 2; i <= n; i++) //p[0], p[1] not used
            p[i] = true;             //all the numbers from 2 to n are assumed true initially
    }
    
    //change all p[i]s to false if i is not prime.
    //For n = 15,
    //     0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15
    //p =  ?  ?  t  t  t  t  t  t  t  t  t  t  t  t  t  t   all true initially
    //to
    //     0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15
    //p =  ?  ?  t  t  f  t  f  t  f  f  f  t  f  t  f  f   all composites changed to false
    void sieve() {
        //boolean p[] = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    p[i] = false;
                }
                p[i] = true;
               
                }  
            }
    }
   
    void printp() {
        for(int i = 2; i <= n; i++){
            if(p[i] == true)
                System.out.print( i + ":t ");
            else
                System.out.print( i + ":f ");      
        }              
    } 
} 

public class eratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SieveOfEratosthenes mc = new SieveOfEratosthenes();
        System.out.print("Enter an integer.;");
        int n = in.nextInt();
            mc.setP(n);
            mc.sieve();
            mc.printp();
    } 
}


