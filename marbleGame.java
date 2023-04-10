/*
date: April 23, 2020
author: Asumi
purpose: This program is a game using marble. 
*Rules*
1. You fight with computer. You must take one but at most half of the marbles.
2. The one who take the last marble is the loser.
*/
import java.util.Scanner;
import java.util.Random;

class NimGame {
        final int MAXSIZE = 100; 
        int MarbleNum;

    NimGame() {      
        Random rand = new Random();
        MarbleNum = rand.nextInt(10+(int)(Math.random()*(91))); 
    }
    
    void playGame() {
    Scanner in = new Scanner(System.in);
        int t;
        boolean win = false;
        System.out.println("You must take one but at most half of the marbles.");
        System.out.println("The one who take the last marble is the loser.");
        System.out.println("The number of marbles are"+MarbleNum);
        
        Random R = new Random();
            int a = R.nextInt(2);
            if (a == 0) 
                System.out.println("You take the First turn.");
            else 
                System.out.println("You take the Second turn.");
        
        do{  
            if (a == 0){
                System.out.print("Type the numer of marbles which You want to take between 1-"+MarbleNum/2+".");
                t = in.nextInt();
                
            MarbleNum -= t;  
            System.out.println("There are" + MarbleNum + " marbles.");
                a = 1;
            }else{  
                int p = 1;
                while (p <= MarbleNum/2) 
                    p *=2;
            t = MarbleNum- (p-1);
            if (t == 0)
                t = 1;
            MarbleNum -= t;
            System.out.println("Computer take"+ t+"marbles. There are"+ MarbleNum +"marbles.");
                a= 0;
            }
        }while (MarbleNum >= 1);
            if (MarbleNum == 0) {
                win = false;
                System.out.println("Sorry, You lost.");
            }else
                System.out.println("Congratulations, you won the game!");      
    }
}
                               
public class marbleGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NimGame myGame = new NimGame();
        String res;
        do {
            myGame.playGame();
            
            System.out.print("Play again(y or n): ");
            res = in.next();
        } while (res.toLowerCase().charAt(0) == 'y');
        System.out.println("Thanks for playing, bye!");
    } 
}