/*
date: Oct 6, 2020
author: Asumi
purpose: This program is to write and implement the following recursive methods.
*/

import java.util.Scanner;
public class recursive3 {
    static boolean isDuplicate(String s){     
        //base case
        if(s.charAt(0) == s.charAt(s.length()/2))
            return isDuplicate(s.substring(0,s.length()/2)+s.substring(s.length()/2+1));
        return false;
    } 
    
    static int evalAS1(String e) {
        //base case
        int r = e.charAt(0)-'0'; //first number copied to r before the loop begins
        if(e.length()==1)
            return r;
        else if (e.charAt(1) == '+')
                r += e.charAt(2)-'0'; //now we know first number is always in r
            else 
                r -= e.charAt(2)-'0';
        return r + evalAS1(e.substring(0,e.length()-1));    
    }

    static int indexOf(String s1, String s2){
        //base case
        if(s1.length()< s2.length())
            return -1;
        if(s1.substring(0,s1.length()).equals(s2)){
            return s2.charAt(0);
        }
        return indexOf(s1.substring(1), s2);
    }
    
    public static void main(String[] args) {
        
        System.out.println(isDuplicate("abcabc"));
        System.out.println(isDuplicate("abcdef"));
        System.out.println(evalAS1("5+6-3"));
	System.out.println(indexOf("java", "av"));
    }   
}