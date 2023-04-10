/*
date: April 9, 2020
author: Asumi
purpose: This program is to calculate binary number.
 */
import java.util.Scanner;

class Binary {
    //increase the value of binary string b by 1.
    String incB(String b) {
        String t = " ";
        for (int i = b.length()-1; i >= 0; i--) {     
            if (b.charAt(i) == '0'){
                t = '1'+t;
            }else 
                if(b.charAt(i) == '1')
                t = '0'+t;                         
        }      
        for (int j = t.length()-1; j >= 0; j--){
            if(t.charAt(t.length()-j) == '0')
                t = '1'+t;
        }
        return t;
}    
    
    //decrease the value of binary string b by 1. (Assume b > "0".)
    String decB(String b) {
        for (int i = b.length()-1; i >= 0; i--) {

 

}
        return b;
    }
}

public class binaryCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Binary myB = new Binary();
        
        System.out.print("Enter a binary string: ");
        String b = in.next();
        
        System.out.println(b+" + 1 = "+myB.incB(b));
        System.out.println(b+" - 1 = "+myB.decB(b));
    }
}