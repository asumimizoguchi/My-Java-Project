/*
date: Jan. 24, 2020
author: Asumi
purpose: This project reads two times t1 = (h1, m1, s1) and 
t2 = (h2, m2, s2) and then prints the sum(t1 + t2) and 
the difference(t1 - t2) of t1 and t2.
 */

import java.util.Scanner;
public class calcdiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int h1, m1, s1, h2, m2, s2; //input variables 
        int hAdd, mAdd, sAdd, hSub, mSub, sSub; //output variables
        int seconds1, seconds2, secondAdd, secondSub; //temp variable 
        
        System.out.print("Enter hour of t1: ");
        h1 = in.nextInt();
        System.out.print("Enter minute of t1: ");
        m1 = in.nextInt();
        System.out.print("Enter second of t1: ");
        s1 = in.nextInt();
        System.out.print("Enter hour of t2: ");
        h2 = in.nextInt();
        System.out.print("Enter minute of t2: ");
        m2 = in.nextInt();
        System.out.print("Enter second of t2: ");
        s2 = in.nextInt();
        
        //t1 = (20, 30, 20) and t2 = (10, 30, 50)
        //then t1+t2 = (31, 1, 10) and t1-t2 = (9, 59, 30)
        
        seconds1 = h1*3600+m1*60+s1; //s1 =73820
        seconds2 = h2*3600+m2*60+s2; //s2 =37850
        secondAdd = seconds1+seconds2;
        hAdd =secondAdd/3600; // s1+s2 = 111670, hAdd=31
        mAdd =(secondAdd%3600)/60; // mAdd = 1
        sAdd = (secondAdd%3600)%60; // sAdd = 10
        
        System.out.println("t1+t2 = ("+hAdd+", "+mAdd+", "+sAdd+")");
        
        seconds1 = h1*3600+m1*60+s1; //s1 =73820
        seconds2 = h2*3600+m2*60+s2; //s2 =37850
        secondSub = seconds1-seconds2;
        hSub =secondSub/3600; // s1-s2 = 35970, 
        mSub =(secondSub%3600)/60; // 
        sSub = (secondSub%3600)%60; // 
       
        System.out.println("t1-t2 = ("+hSub+", "+mSub+", "+sSub+")");   
    }    
}
