//date: 1/23/2020
//author: Asumi
//purpose: This is a Java program that reads a memory size in bytes and converts it to (GBs, MBs, KBs, Bytes).
 

import java.util.Scanner;
public class byteConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bytes; //input variable
        int gbs, mbs, kbs, bs; //output variables  
        System.out.print("Enter a memory size in bytes: ");            
        bytes = in.nextInt();
        //steps for calculating gbs, mbs, kbs, bs
        //bytes         
        //1234567890              initial values
        //1205632       722       step 1
        //1177          384       step 2 
        //1             153       step 3
        //0             1         step 4
        bs = bytes%1024; // bs= 722
        kbs = (bytes/1024)%1024; // kbs = 384
        mbs = (bytes/1024/1024)%1024; // mbs = 153
        gbs = (bytes/1024/1024/1024)%1024; // gb = 1
       
        System.out.println(bytes+" bytes = ("+gbs+" GBs, "+mbs+" MBs, "+kbs+" KBs, "+bs+" bytes)");
        
        /* //better answer
        
        kbs = bytes/1024;

        bs = bytes%1024;

        mbs = kbs/1024;

        kbs = kbs%1024;

        gbs = mbs/1024;

        mbs = mbs%1024;
 
        */
    }  
}
