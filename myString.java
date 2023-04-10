/*
date: Mar 25, 2020
author: Asumi
purpose: Declare and implement a class named MyString. 
This class will have a string data member s and the following methods:
 */

import java.util.Scanner;
    class MyString {
        String s;
    
        MyString() {
            s = ""; 
        }

        void setMyString(String s1) {
            s = s1;
        } 
    
        String getMyString() {
            return s;            
        }
    
    //return the word in s that repeats the most times.
        static void getMode(String s) {
        String r = "";
        int count = 0;
        for(int i = 0; i< s.length(); i++){   
            for (int j = 0; j < s.length(); j++) { 
                if(s.charAt(i) == s.charAt(j))
                    count++;
            }  
        System.out.println(s.charAt(i) + " appears " + count + " in "+ s);
        count = 0;
        }
        }
    }
    

public class myString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        MyString myS = new MyString();

        System.out.print(" Enter the string: ");
        String s = in.nextLine().toLowerCase();
        
        myS.setMyString(s);
       
        myS.getMode(s);
                      
        } 
    }



