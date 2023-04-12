/*
date: Apr 8, 2021
author: Asumi Mizoguchi
purpose: Create a Calculator class that setups a GUI window for a calculator.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener{
    
    private JButton buttons[][];
    int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {0, 0,0}};
    private JButton plusJButton, minusJButton, productJButton, quotientJButton, equalJButton, dotJButton, cancelJButton, calJButton, offJButton;
    private JPanel calJPanel, operateJPanel, numberJPanel, pl;
    JTextField displayField;
    private JTextField result = new JTextField("");
    double stackedValue = 0.0;
    boolean isStacked = false;
    boolean afterCalc = false; 
    String s0 = ""; 
    String s1 = ""; 
    String s2 = ""; 
    
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
        
        pl = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        pl.setFont(new Font("SansSerif", Font.PLAIN, 14));
        pl.setLayout(gl);

        //Add buttons to the panel pl.
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                pl.add(buttons[i][j]);
                buttons[i][j].addActionListener(this);
            }
        }

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
        plusJButton.addActionListener(this);
        plusJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //plusJButton.setBackground(Color.cyan);
        operateJPanel.add(plusJButton);
        
        //.
        dotJButton = new JButton();
        dotJButton.setBounds(20,166,62,62);
        dotJButton.setText(".");
        dotJButton.addActionListener(this);
        dotJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //dotJButton.setBackground(Color.cyan);
        operateJPanel.add(dotJButton);
        
        //-
        minusJButton = new JButton();
        minusJButton.setBounds(102,20,62,52);
        minusJButton.setText("-");
        minusJButton.addActionListener(this);
        minusJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //minusJButton.setBackground(Color.cyan);
        operateJPanel.add(minusJButton);
        
       //*
        productJButton = new JButton();
        productJButton.setBounds(102,72,62,52);
        productJButton.setText("*");
        productJButton.addActionListener(this);
        productJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //productJButton.setBackground(Color.cyan);
        operateJPanel.add(productJButton);
        
        ///
        quotientJButton = new JButton();
        quotientJButton.setBounds(102,124,62,52);
        quotientJButton.setText("/");
        quotientJButton.addActionListener(this);
        quotientJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //quotientJButton.setBackground(Color.cyan);
        operateJPanel.add(quotientJButton);
        
        //=
        equalJButton = new JButton();
        equalJButton.setBounds(102,176,62,52);
        equalJButton.setText("=");
        equalJButton.addActionListener(this);
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
        cancelJButton.addActionListener(this);
        cancelJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //cancelJButton.setBackground(Color.cyan);
        calJPanel.add(cancelJButton);  
        
        // setup calJButton
        calJButton = new JButton();
        calJButton.setBounds(20,82,82,52);
        calJButton.setText("C/A");
        calJButton.addActionListener(this);
        calJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        //calJButton.setBackground(Color.cyan);
        calJPanel.add(calJButton);
        
        offJButton = new JButton();
        offJButton.setBorder(new BevelBorder(BevelBorder.LOWERED ));
        offJButton.setLayout(null);
        offJButton.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        offJButton.setText("OFF");
        offJButton.addActionListener(this);
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

    public void actionPerformed(ActionEvent e){
        String input = (String) e.getActionCommand();
        String s = e.getActionCommand();
  
        if(input.equals(".")){
            if(!result.getText().contains(".")){
		if(isStacked){
                    result.setText("0.");
			isStacked=false;
		}else{
                    result.setText(result.getText()+".");
		}
            }
	}else if(input.equals("1")){
            result.setText("1");
            isStacked =true;
        }else if(input.equals("2")){
            result.setText("2");
            isStacked = true;
	}else if(input.equals("3")){
            result.setText("3");
            isStacked = true;
	}else if(input.equals("4")){
            result.setText("4");
            isStacked = true;
	}else if(input.equals("5")){
            result.setText("5");
            isStacked = true;
        }else if(input.equals("6")){
            result.setText("6");
            isStacked = true;
	}else if(input.equals("7")){
            result.setText("7");
            isStacked = true;
        }else if(input.equals("8")){
            result.setText("8");
            isStacked = true;
	}else if(input.equals("9")){
            result.setText("9");
            isStacked = true;
	}else if(input.equals("0")){
            result.setText("0");
            isStacked = true;
	}
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 += s;
            else
                s0 += s; 
            result.setText(s0 + s1 + s2);
        }else if(input.equals("C/A")){
            s0 = s1 = s2 = "";
            result.setText("0");
            isStacked = false;
        }else if(input.equals("OFF")){
            s0 = s1 = s2 = "";
            result.setText(" ");
            isStacked = false;
	}else if(input.equals("C")){
            if (!s1.equals("")){
                s2 = "";
                isStacked = true;
            }else{
                s0 = "";
                isStacked = false;
            }
            result.setText(s0+s1+s2);
            
        }
        else if (s.charAt(0) == '=') {
            double r;
  
            if (s1.equals("+"))
                r = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                r = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                r = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                r = (Double.parseDouble(s0) * Double.parseDouble(s2));
  
            result.setText(s0 + s1 + s2 + "=" + r);
  
            s0 = Double.toString(r);
  
            s1 = s2 = "";
        }
        else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double r;
                if (s1.equals("+"))
                    r = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    r = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    r = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    r = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(r);

                s1 = s;

                s2 = "";
            } 

            result.setText(s0 + s1 + s2);
        }
    }


    public static void main(String[] args) {
        calculator application = new calculator();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
}


        