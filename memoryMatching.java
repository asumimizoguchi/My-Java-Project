/*
date: Sep 27, 2020
author: Asumi
purpose: This program is to write a memory mmatching game.

*/

import java.util.Scanner;
import java.util.Random;
class MemoryMatchGame{
    final private int MAXR = 14;
    final private int MAXC = 14;
    
    public int cards[][];
    public int nR, nC;  
    boolean upDown[][] = new boolean[MAXR][MAXC];
    static Scanner input = new Scanner(System.in);
    
    public MemoryMatchGame(){
        cards = new int[MAXR][MAXC];
        nR = 0;
        nC = 0;
    }
    
    public void setA(){      
        System.out.println("Enter the number of rows: ");
        nR = input.nextInt();
   
        while(nR>MAXR || nR<1){
            System.out.println("The rows must be between 1 and "+MAXR);
            System.out.println("Enter the number of rows: ");
            nR = input.nextInt();
        }
       
        System.out.println("Enter the number of columns: ");
        nC = input.nextInt();
        
        while(nC>MAXC || nC<1){
            System.out.println("The columns must be between 1 and "+MAXC);
            System.out.println("Enter the number of columns: ");
            nC = input.nextInt();
        }
        
        for (int r = 0; r < nR; r++) {
            for (int c = 0; c < nC; c++) {
            }
        }
    } 

    public int[][] getCards(){
	return cards;
    }

    public void setNR(int r){
	nR = r;
    }
   
    public int getNR(){
	return nR;
    }

    public void setNC(int c){
	nC = c;
    }
   
    public int getNC(){
	return nC;
    }

    public int getMAXR(){
	return MAXR;
    }
    
    public int getMAXC(){
	return MAXC;
    }
    
    public void setup() {
        for (int i = 0; i < nR; i++) {
            for (int a = 0; a < nC; a++) {
                upDown[i][a]=false;
            }
        }
        cards = randomizer();        
    }

    public void displayBoard(boolean[][] upDown, int[][] cards) {
    System.out.println(" ---------------");
        for (int i = 0; i < nR; i++) {  
            System.out.print(" " + (i + 1) + " | ");
            for (int j = 0; j < nC; j++) {                  
                if (upDown[i][j]) {
                    System.out.print(cards[i][j]);
                    System.out.print(" ");
                }
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int[][] randomizer() {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
        int cards[][] = new int[nR][nC];
        Random random = new Random();
        int temp, t;
        for (int j = 0; j <= 20; j++){
            for (int x = 0; x < nR*nC; x++){ 
                t = random.nextInt(1000) % 15;
                temp = num[x];
                num[x] = num[t];
                num[t] = temp;
            }
            t = 0;
            for (int r = 0; r < nR; r++){
                for (int s = 0; s < nC; s++){
                    cards[r][s] = num[t];
                    t = t + 1;
                }
            }
        }
        return cards;
        }

    public void game(boolean[][] upDown, int[][] cards) {
        int noDownCards = nR*nC;
        while (noDownCards>0) {
            displayBoard(upDown, cards);
            System.out.println("Enter co-oridinate 1 (Ex. If you want to choose 1-1, put 11) ");
            String g1 = input.next();
            int g1x = Integer.valueOf(g1.substring(0, 1))-1;
            int g1y = Integer.valueOf(g1.substring(1, 2))-1;
            System.out.println(cards[g1x][g1y]);

            System.out.println("Enter co-oridinate 2 (Ex. If you want to choose 1-2, put 12)");
            String g2 = input.next();
            int g2x = Integer.valueOf(g2.substring(0, 1))-1;
            int g2y = Integer.valueOf(g2.substring(1, 2))-1;
            System.out.println(cards[g2x][g2y]);
            if (cards[g1x][g1y] == cards[g2x][g2y]) {
                System.out.println("You found a match!");
                upDown[g1x][g1y] = true;
                upDown[g2x][g2y] = true;
                noDownCards -= 2;
            }
            System.out.println("You did not find a match...");
        }
        displayBoard(upDown, cards);
        System.out.println("You win");
    }

    public int[][] shuffle() {
        int start[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};
        int cards[][] = new int[nR][nC];
        Random ran = new Random();
        int tmp, i;
        for (int s = 0; s <= 20; s++) {
            for (int x = 0; x < nR*nC; x++){
                i = ran.nextInt(100000) % 15;
                tmp = start[x];
                start[x] = start[i];
                start[i] = tmp;
            }
        }
        i = 0;
        for (int r = 0; r < nR; r++){
            for (int c = 0; c < nC; c++) {
                cards[r][c] = start[i];
                i = i + 1;
            }
        }
        return cards;
    }
}

public class memoryMatching {
    public static void main(String[] args) {
        System.out.println("This is a memory matching game.");
        System.out.println("Please choose the size of borad. (MAX is 14)");
        System.out.println("After that, you can start the game!");
 	MemoryMatchGame mm = new MemoryMatchGame();
 
        boolean upDown [][] = new boolean[4][4];
        int cards[][] ={{1,2,3,4},
                        {1,2,3,4},
                        {1,2,3,4},
                        {1,2,3,4}
                        };
        mm.setA();
        mm.displayBoard(upDown, cards);
        mm.setup();       
        mm.game(upDown, cards);     
    }
}
