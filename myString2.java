/*
date: April 2, 2020
author: Asumi
purpose:  Complete the file attached to declare and implement a class named MyString. 
This class will have a string data member s and the following methods:
 */
import java.util.Scanner;
class MyString {
    String s;
    
    MyString() {
        s = ""; //set to null string
    }

    void setMyString(String s1) {
        s = s1;
    } 
    
    String getMyString() {
        return s;
    }
    
    //return the word in s that repeats the most times.
    String getMode() {
    int p1 = 0;
    int p2 = 0;
    String w = " ";
    String output= " ";
    int maxcount = 0;
    
    for(int i = 0; i<(s.length()); i++){
        if (s.charAt(i) == ' '){
            p2 = i;
            w = s.substring(p1, p2);
            p1 = p2+1;
            int count = countWord(s,w);
            if(count < maxcount){
                count = maxcount;
                output = w;
            }
        }
    }
        return w;
    
    }
    
    int countWord(String s, String w){
        int maxcount = 0;
        int s1 = 0;
        int s2 = 0;
        int tempCount = 0;
        String t = " ";
        for (int k = 0; k < s.length(); k++){    
            if (s.charAt(k) == ' '){
                s2 = k;
                t = s.substring(s1, s2);
                s1 = s2+1;
            }
            if(w.length() == t.length()){
                for(int j= 0; j< w.length();j++) {
                    if(w.charAt(j) == t.charAt(j))
                        tempCount++;
                    if(tempCount == w.length())
                        maxcount++;
                }  
                t = " ";
            }   
            else
                t = " ";
        }    
        return maxcount;
    }
}
    
public class myString2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyString myS = new MyString();
        
        System.out.print("Enter a string: ");
        String s = in.nextLine().toLowerCase();
        
        myS.setMyString(s);
        
        System.out.println("The mode in "+myS.getMyString()+" is "+myS.getMode()+".");
    } 
}