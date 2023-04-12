/*
date: Apr 7, 2021
author: Asumi Mizoguchi
purpose: Create a Tic Tac Toe that uses a JFrame GUI interface.
*/

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ticTocToeGUI extends JPanel{
    JLabel ansLabel;
    JButton buttons[] = new JButton[9]; 
    int turn = 0;
    JFrame window = new JFrame("Tic-Tac-Toe");
    
    public ticTocToeGUI(){
        
      setLayout(new GridLayout(3,3));
      initializebuttons(); 
    }
    
    public void initializebuttons(){
        for(int i = 0; i <= 8; i++){
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].addActionListener(new buttonListener());
            
            add(buttons[i]);                                    
        }
    }
    
    public void resetButtons(){
        for(int i = 0; i <= 8; i++){
            buttons[i].setText("");
        }
    }
    
    private class buttonListener implements ActionListener{      
        public void actionPerformed(ActionEvent e){
            
            JButton buttonClicked = (JButton)e.getSource(); 
            if(turn%2 == 0)
                buttonClicked.setText("X");
            else
                buttonClicked.setText("O");
            
            if(checkForWin() == true){
                if(turn%2 == 0){
                    JOptionPane.showConfirmDialog(null, "Winner is Player (O). Conguraturations!!"," CONFIRMATION",JOptionPane.INFORMATION_MESSAGE);
                    int option = JOptionPane.showConfirmDialog(null, "Do you want to play the game again?"," OPTION ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (option == JOptionPane.YES_OPTION){
                    resetButtons();
                    }else if (option == JOptionPane.NO_OPTION){
                        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }

                }else if(turn%2 != 0) {
                    JOptionPane.showConfirmDialog(null, "Winner is Player (X). Conguraturations!!"," CONFIRMATION",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
                    int option = JOptionPane.showConfirmDialog(null, "Do you want to play the game again?", "OPTION ", 
                                                                                               JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (option == JOptionPane.YES_OPTION){
                        resetButtons();
                    }else if (option == JOptionPane.NO_OPTION){
                        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                }else{
                    JOptionPane.showConfirmDialog(null, "The Game was Drawn."," CONFIRMATION ",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
                        int option = JOptionPane.showConfirmDialog(null, "Do you want to play the game again?"," OPTION ", 
                                                                                                     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (option == JOptionPane.YES_OPTION){
                            resetButtons();
                        }else if (option == JOptionPane.NO_OPTION){
                            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        }
                }                
            }               
            turn++;           
        }
        
        public boolean checkForWin(){
            if( checkWin(0,1) & checkWin(1,2) ) 
                return true;
            else if( checkWin(3,4) && checkWin(4,5) )
                return true;
            else if ( checkWin(6,7) && checkWin(7,8))
                return true;
            
            else if ( checkWin(0,3) && checkWin(3,6))
                return true;  
            else if ( checkWin(1,4) && checkWin(4,7))
                return true;
            else if ( checkWin(2,5) && checkWin(5,8))
                return true;
            
            else if ( checkWin(0,4) && checkWin(4,8))
                return true;  
            else if ( checkWin(2,4) && checkWin(4,6))
                return true;
            else 
                return false;       
        }
        
        public boolean checkWin(int a, int b){
            if ( buttons[a].getText().equals(buttons[b].getText()) && !buttons[a].getText().equals("") )
                return true;
            else
                return false;
        }        
    }
    
    public static void main(String[] args) {
        JFrame window = new JFrame("Tic-Tac-Toe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new ticTocToeGUI());
        window.setBounds(300,200,300,300);
        window.setVisible(true);
    }
}

