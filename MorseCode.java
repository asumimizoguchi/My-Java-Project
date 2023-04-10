/*
date: April 30, 2020
author: Asumi
purpose: This is a program to convert a string into morse code. 

*/
import java.util.Scanner;
class MorseCode {
    final String MTABLE[]  = {".-",   "-...", "-.-.", "-..",  ".",    "..-.",
                              "--.",  "....", "..",   ".---", "-.-",  ".-..",
                              "--",   "-.",   "---",  ".--.", "--.-", ".-.",
                              "...",  "-",    "..-",  "...-", ".--",  "-..-",
                              "-.--", "--.."};
    
    String alphabet[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                         "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", 
                         "y", "z"};

    String encode(String w) {
        w = w.toLowerCase();
        String t = "";
        String getMorseChar;
        String m = "";
        
            for(int i = 0; i < w.length(); i++){ 
                t += w.charAt(i);
                for(int j = 0; j< MTABLE.length; j++){ 
                    if(t == MTABLE[j]){ 
                        m += MTABLE[j] + " "; 
                    }  
                }
            }
        return m;
    }
}
    
    

public class MorseCode {
    public static void main(String[] args) {
        MorseCode mc = new MorseCode();
        System.out.println(mc.encode("ABCDEFG"));
    }
}