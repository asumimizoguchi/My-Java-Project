/*
date: Oct 25, 2020
author: Asumi Mizoguchi
purpose: This program is to write a program that will contain the following methods:
removeDup, intersection, union, difference – print all substrings of S using recursion. 
*/

import java.util.Scanner;
class Recursion{
    private String a;

    public Recursion(String array){
        a = array;
    }

    public String getA(){
	return a;
    }

    public void setA(String array){
	a = array;
    }
    
    public String removeDup(String s){
        if(s.length() == 0)
            return "";
        if(s.substring(0,s.length()-1).indexOf(s.charAt(s.length()-1))==-1)
            return removeDup(s.substring(0,s.length()-1))+s.charAt(s.length()-1);
        return removeDup(s.substring(0,s.length()-1));           
    }

    public String intersection(String s1, String s2){
        if(s1.length()==0 || s2.length()==0)
            return "";
        if(s1.charAt(s1.length()-1)== s2.charAt(s2.length()-1))                  
            return intersection(s1.substring(0,s1.length()-1),s2.substring(0,s2.length()-1))+s1.charAt(s1.length()-1);
        return intersection(s1.substring(0,s1.length()-1),s2);    
    }
    
    //I am sorry I could not get correct answer for union. For the other methods, I got correct input.
    public String union(String s1, String s2){
        if(s1.length()==0 || s2.length()==0)
            return "";
        if(s1.indexOf(s2.charAt(s2.length()-1))==-1)
            return s1.substring(0)+union(s1,s2.substring(0,s1.length()-1))+s2.charAt(s2.length()-1);
        return union(s1,s2.substring(0,s2.length()-1));       
    }

    public String difference(String s1, String s2){
        if(s1.length()==0 ||s2.length()==0)
            return "";
        if(s2.indexOf(s1.charAt(s1.length()-1))==-1)                  
            return difference(s1.substring(0,s1.length()-1),s2)+s1.charAt(s1.length()-1);
        return difference(s1.substring(0,s1.length()-1),s2);     
    }
}

public class recursion2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "abcd";
        Recursion r = new Recursion(a);
        System.out.println(r.removeDup("pineapples"));
        System.out.println();

        System.out.println(r.intersection("pineapples", "apples"));
        System.out.println();
        
        System.out.println(r.union("pineapples", "apples"));
        System.out.println();
        
        System.out.println(r.difference("pineapples", "apples"));   
        System.out.println();
       
        System.out.print("Select methods which you want to do.: ");
        String s = "";
        Recursion r1 = new Recursion(s);

        int res;
        do { 
            System.out.println();
            System.out.println("1. removeDup method;");
            System.out.println("2. intersection method;");
            System.out.println("3. union method;");
            System.out.println("4. difference method;");
            System.out.println("0. quit.");
            
            System.out.println("select: ");
            res = in.nextInt();
            in.nextLine();
            if (res == 1) {
                System.out.println("Enter the String.:");
                s = in.nextLine();
                System.out.println(r1.removeDup(s));
            }else if (res == 2) {
                System.out.println("Enter the String 1.:");
                String s1 = in.nextLine();
                System.out.println("Enter the String 2.:");
                String s2 = in.nextLine();
                System.out.println(r1.intersection(s1, s2));
                System.out.println();
            }else if(res == 3){
                System.out.println("Enter the String 1.:");
                String s1 = in.nextLine();
                System.out.println("Enter the String 2.:");
                String s2 = in.nextLine();
                System.out.println(r1.union(s1, s2));
                System.out.println();
            }else if(res == 4){
                System.out.println("Enter the String 1.:");
                String s1 = in.nextLine();
                System.out.println("Enter the String 2.:");
                String s2 = in.nextLine();
                System.out.println(r1.difference(s1, s2));
                System.out.println();
            }
        }while (res !=0); 
        System.out.println("Good Bye!");
        
    }
}
