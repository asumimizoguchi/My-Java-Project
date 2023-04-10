/*
date: May 1, 2020
author: Asumi
purpose: 
 */
import java.util.Scanner;
public class sentinel {
    static void josephus(int n, int skip) {
        int g[] = new int[n]; //array to hold n people, 1,2,3,...,n.
        int k = 0;
        for(int i = 1; i < n; i++){
            g[i-1] = i;
            for(int j = 1; j <= n; j++){    
                if(j == skip)
                    g[j] = 0;                    
                k += j;
                j = 1; 
            }
            System.out.println("The number chosen is " + k); 
        }           
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //We can still pick a sentinel in the case of multiple input items
        System.out.print("Enter a group size(-1 to stop): ");
        int n = in.nextInt();
        while (n > 0) {
            System.out.print("Enter a skip: ");
            int k = in.nextInt();
            
            josephus(n, k);
            
            System.out.print("Enter a group size(-1 to stop): ");
            n = in.nextInt();
        }
        System.out.println("Good luck!");
    } 
}