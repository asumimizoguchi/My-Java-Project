/*
date: Jan. 31, 2020
author: Asumi
purpose: This program reads a sentence consisting of four words and
prints all of the 4! permutations of hte four words in order.
 */

import java.util.Scanner;
public class permutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String sentence;//input
        String word1, word2, word3, word4; //output
        int p, p1, p2;
        
        System.out.println("Enter a sentence with exactly 4 words: ");
        sentence = in.nextLine();
        
        p = sentence.indexOf(" ");
        p1 = sentence.indexOf(" ", p+1);
        p2 = sentence.indexOf(" ", p1+1);
        
        word1 = sentence.substring(0, p);
        word2 = sentence.substring(p+1, p1);
        word3 = sentence.substring(p1+1,p2);
        word4 = sentence.substring(p2+1);
        
        System.out.println(sentence+" changed to \""+(word1+" "+word2+" "+word3+" "+word4)+"\"");
        System.out.println(sentence+" changed to \""+(word1+" "+word3+" "+word2+" "+word4)+"\"");
        System.out.println(sentence+" changed to \""+(word1+" "+word3+" "+word4+" "+word2)+"\"");
        System.out.println(sentence+" changed to \""+(word1+" "+word4+" "+word2+" "+word3)+"\"");
        System.out.println(sentence+" changed to \""+(word1+" "+word4+" "+word3+" "+word2)+"\"");
        System.out.println(sentence+" changed to \""+(word2+" "+word1+" "+word3+" "+word4)+"\"");
        System.out.println(sentence+" changed to \""+(word2+" "+word1+" "+word4+" "+word3)+"\"");
        System.out.println(sentence+" changed to \""+(word2+" "+word3+" "+word1+" "+word4)+"\"");
        System.out.println(sentence+" changed to \""+(word2+" "+word3+" "+word4+" "+word1)+"\"");
        System.out.println(sentence+" changed to \""+(word2+" "+word4+" "+word1+" "+word3)+"\"");
        System.out.println(sentence+" changed to \""+(word2+" "+word4+" "+word3+" "+word1)+"\"");
        System.out.println(sentence+" changed to \""+(word3+" "+word1+" "+word2+" "+word4)+"\"");
        System.out.println(sentence+" changed to \""+(word3+" "+word1+" "+word4+" "+word2)+"\"");
        System.out.println(sentence+" changed to \""+(word3+" "+word2+" "+word1+" "+word4)+"\"");
        System.out.println(sentence+" changed to \""+(word3+" "+word2+" "+word4+" "+word1)+"\"");
        System.out.println(sentence+" changed to \""+(word3+" "+word4+" "+word1+" "+word2)+"\"");
        System.out.println(sentence+" changed to \""+(word3+" "+word4+" "+word2+" "+word1)+"\"");
        System.out.println(sentence+" changed to \""+(word4+" "+word1+" "+word2+" "+word3)+"\"");
        System.out.println(sentence+" changed to \""+(word4+" "+word1+" "+word3+" "+word2)+"\"");
        System.out.println(sentence+" changed to \""+(word4+" "+word2+" "+word1+" "+word3)+"\"");
        System.out.println(sentence+" changed to \""+(word4+" "+word2+" "+word3+" "+word1)+"\"");
        System.out.println(sentence+" changed to \""+(word4+" "+word3+" "+word1+" "+word2)+"\"");
        System.out.println(sentence+" changed to \""+(word4+" "+word3+" "+word2+" "+word1)+"\"");
    }
}
