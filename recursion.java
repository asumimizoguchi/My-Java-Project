/*
date: Oct 18, 2020
author: Asumi Mizoguchi
purpose: This program is to write a program that will contain the following methods:
printSub1, printSub2, printSub3, printSub4 – print all substrings of S using recursion. 
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
    
    public void printSub1(String s){
        if(s.length()!=0){
            for(int j=0; j<=s.length(); j++){
                System.out.print(s.substring(0,j));
            }
        printSub1(s.substring(1));
        }
    }

    public void printSub2(String s){
        if(s.length()!=0){
            for(int j=s.length(); j>=0; j--){
                System.out.print(s.substring(j,s.length()));
            }
        printSub2(s.substring(0,s.length()-1));
        }
    }
    
    public void printSub3(String s){
        printSub3(s, 1);
    }
  
    private void printSub3(String s, int i){
        if(i<=s.length()){
            for(int j=0; j+i<=s.length(); j++){
                System.out.print(s.substring(j,j+i));
            }
        printSub3(s,i+1);
        }
    }
    
    public void printSub4(String s){
        printSub4(s,s.length()-1);    
    }
  
    private void printSub4(String s, int i){
        if(i>=0){
            for(int j=0; j<s.length()-i; j++){
                System.out.print(s.substring(s.length()-i-j-1,s.length()-j));
            }
        printSub4(s,i-1);         
        }
    }
}

public class recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "abcd";
        Recursion r = new Recursion(a);
        r.printSub1("abcd");
        System.out.println();
        r.printSub2("abcd");
        System.out.println();
        r.printSub3("abcd");
        System.out.println();
        r.printSub4("abcd");    
        System.out.println();
       
        System.out.print("Enter the String which you want to separate: ");
        String s = in.nextLine();
        Recursion r1 = new Recursion(s);

        int res;
        do { 
            System.out.println();
            System.out.println("1. PrintSub1 method;");
            System.out.println("2. PrintSub2 method;");
            System.out.println("3. PrintSub3 method;");
            System.out.println("4. PrintSub4 method;");
            System.out.println("0. quit.");
            
            System.out.println("select: ");
            res = in.nextInt();
            if(res == 1){
                r1.printSub1(s);
                System.out.println();
            }else if(res == 2){
                r1.printSub2(s);
                System.out.println();
            }else if(res == 3){
                r1.printSub3(s);
                System.out.println();
            }else if(res == 4)
                r1.printSub4(s);     
                System.out.println();
        }while (res !=0); 
        System.out.println("Good Bye!");
    }
}