/*
date: April 10, 2020
author: Asumi
purpose: 
 */
import java.util.Scanner;
class Factor {
    //factorize a given integer n.
    //If n = 600, it prints 600 = 2*2*2*3*5*5

    String factorize1(int n) {
        String r = "";
        int p = 2;
        while (n > 1)
            if (n%p != 0)
                p++;
            else {
                r += (p+"*");
                n /= p;
            }
    return r.substring(0, r.length()-1);
    }

    // When n = 600, this method should print 600 = 2^3*3*5^2.

    String factorize2(int n) {
        String r = "";
        String t = "";
        int p = 2;
        int count = 0;
        while (n > 1){
            if (n%p != 0)
                p++;
            else{
                t += (p+"*");
                n /= p;
            }        
        }  
            char curNum = t.charAt(0);
            for (int i = 0; i < t.length(); i++) {
                if (curNum == t.charAt(i)){
                count++;
                }else if(t.charAt(i) != '*'){   

                if (count > 1) {                 
                    r += (curNum+"^"+count+"*");                     
                }else{
                    r += (curNum+"*");
                }
                curNum = t.charAt(i);
                count = 1;
            }
            }       
        if (count > 1) {                 
            r += (curNum+"^"+count);                     
        }else{ 
            r += (curNum);
        }        
        return r;   
    }  
}
    


public class factorize {  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        Factor myF = new Factor();
        int n;
        System.out.print("Enter n: ");
        n = in.nextInt();
      
        System.out.println(n+" = "+myF.factorize1(n));
        System.out.println(n+" = "+myF.factorize2(n));
      
   }
}
 