/*
date: April 1, 2021
author: Asumi Mizoguchi
purpose: Create a Calculator class that setups a GUI window for a calculator.
*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.BorderLayout;

public class calculator extends JFrame {
    
    private JButton buttons[][];
    int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {0, 00, 000}};
    private JButton plusJButton, minusJButton, productJButton, quotientJButton, equalJButton, dotJButton, cancelJButton, calJButton, offJButton;
    private JPanel calJPanel, operateJPanel, numberJPanel, pl;
    JTextField displayField;
    private JTextField result = new JTextField("");
    
    // no-argument constructor
    public calculator(){
        createUserInterface();
    }
    
    //create and position GUI components
    private void createUserInterface(){
        Container contentPane = getContentPane();
        //contentPane.setBackground(Color.CYAN);
        contentPane.setLayout(null);
       
        // null for layout means we are using absolute positioning
        // research the API for other layout manager options
        
        //setup numberJPanel
        numberJPanel = new JPanel();
        numberJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED ));
        numberJPanel.setLayout(null);
        numberJPanel.setBorder(new TitledBorder(""));
        numberJPanel.setBounds(20,90,166, 208);  //(x,y,width,height)
        //numberJPanel.setBackground(Color.lightGray);
        contentPane.add(numberJPanel);
        
        buttons = new JButton[4][3];
        
        BorderLayout bl = new BorderLayout();
        numberJPanel.setLayout(bl);

        //Create button array
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = new JButton(String.valueOf(nums[i][j]));
                buttons[i][j].setFont(new Font("SansSerif", Font.PLAIN, 24));
            }
        }
        
        displayField = new JTextField(30);
        displayField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        displayField.setEditable(false);
        numberJPanel.add("Center", displayField);


        //Create the panel with the GridLayout that will contain 16 buttons -
        pl = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        pl.setLayout(gl);

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                pl.add(buttons[i][j]);
            }
        }

        //Add the panel pl to the center area of the window
        numberJPanel.add("Center", pl);

        // setup operateJPanel
        operateJPanel = new JPanel();
        operateJPanel.setLayout(null);
        operateJPanel.setBorder(new TitledBorder(""));
        operateJPanel.setBounds(206, 70, 184, 248);
        //operateJPanel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(operateJPanel);
        
        //+
        plusJButton = new JButton();
        plusJButton.setBounds(20,20,62,136);
        plusJButton.setText("+");
        plusJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //plusJButton.setBackground(Color.cyan);
        operateJPanel.add(plusJButton);
        
        //.
        dotJButton = new JButton();
        dotJButton.setBounds(20,166,62,62);
        dotJButton.setText(".");
        dotJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //dotJButton.setBackground(Color.cyan);
        operateJPanel.add(dotJButton);
        
        //-
        minusJButton = new JButton();
        minusJButton.setBounds(102,20,62,52);
        minusJButton.setText("-");
        minusJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //minusJButton.setBackground(Color.cyan);
        operateJPanel.add(minusJButton);
        
        //*
        productJButton = new JButton();
        productJButton.setBounds(102,72,62,52);
        productJButton.setText("*");
        productJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //productJButton.setBackground(Color.cyan);
        operateJPanel.add(productJButton);
        
        ///
        quotientJButton = new JButton();
        quotientJButton.setBounds(102,124,62,52);
        quotientJButton.setText("/");
        quotientJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //quotientJButton.setBackground(Color.cyan);
        operateJPanel.add(quotientJButton);
        
        //=
        equalJButton = new JButton();
        equalJButton.setBounds(102,176,62,52);
        equalJButton.setText("=");
        equalJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //equalJButton.setBackground(Color.cyan);
        operateJPanel.add(equalJButton);
        
        // setup calculateJPanel
        calJPanel = new JPanel();
        calJPanel.setLayout(null);
        calJPanel.setBorder(new TitledBorder(""));
        calJPanel.setBounds(410, 70, 122, 154);
        //calJPanel.setBackground(Color.LIGHT_GRAY);
        contentPane.add(calJPanel);
        
        // setup cancelJButton
        cancelJButton = new JButton();
        cancelJButton.setBounds(20,20,82,52);
        cancelJButton.setText("C");
        cancelJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //cancelJButton.setBackground(Color.cyan);
        calJPanel.add(cancelJButton);
        
        // setup calJButton
        calJButton = new JButton();
        calJButton.setBounds(20,82,82,52);
        calJButton.setText("C/A");
        calJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //calJButton.setBackground(Color.cyan);
        calJPanel.add(calJButton);
        
        offJButton = new JButton();
        offJButton.setBorder(new BevelBorder(BevelBorder.LOWERED ));
        offJButton.setLayout(null);
        offJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        offJButton.setText("OFF");
        offJButton.setHorizontalAlignment(JLabel.CENTER);
        offJButton.setBounds(410,254,124, 62);  
        //offJButton.setBackground(Color.lightGray);
        contentPane.add(offJButton);
        
        
        result.setBounds(20, 20, 510, 30);
        result.setBackground(Color.white);
        result.setText("0");
        result.setHorizontalAlignment(SwingConstants.RIGHT);
	result.setFont(new Font("SansSerif", Font.PLAIN, 24));
        result.setEditable(false);
        contentPane.add(result);
        
        //set properties for application window
        setTitle("Caluculator"); //set title bar text
        setSize(560,370);  // set window size
        setVisible(true); // display window
        
    }
    
    public static void main(String[] args) {
        calculator2 application = new calculator2();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
}

