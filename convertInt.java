/*
date: Jan. 31, 2020
author: Asumi
purpose: This program reads a 7-digit integer into n and convert it to another 
integer r by changing every digit in n except the first digit as follows.
 */

import java.util.Scanner;
public class convertInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a 7-digit integer n: ");
        int n, r;
        n = in.nextInt();
        
        //5892018 - 2202012
        r = (n%10)%3; //r = 2
        n = n/10;//n =589201
        r = ((n%10)%3)*10 + r;// r = 12
        n = n/10;//58920
        r = ((n%10)%3)*100 + r;
        n = n/10;
        r = ((n%10)%3)*1000 + r;
        n = n/10;       
        r = ((n%10)%3)*10000 + r;
        n = n/10;       
        r = ((n%10)%3)*100000 + r;
        n = n/10;
        r = ((n%10)%3)*1000000 + r;
        n = n/10;
        
        System.out.println(n+" changed to "+r);
    }
}
