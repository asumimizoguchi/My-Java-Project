/*
date: Nov 11, 2020
author: Asumi Mizoguchi
purpose: Create a GUI application that will keep a movie inventory for the user. 

*/

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

class Movie{
    String name;
    String media;
    int year;

    public Movie(String n, String m, int y){
        name = n;
        media = m;
        year = y;
    }
}

public class movieInventoryGUI extends JFrame 
{
    // JPanel for user inputs
    private JPanel inputMovieJPanel;
   
    // JLabel and JTextField 
    private JLabel MovieNameJLabel;
    private JTextField MovieNameJTextField;
   
    // JLabel and JTextField 
    private JLabel MediaJLabel;
    private JTextField MediaJTextField;

    // JLabel and JTextField 
    private JLabel ReleaseYearJLabel;
    private JTextField ReleaseYearJTextField;

    private JButton AddMovieJButton, ShowMovieJButton;

    // JLabel and JTextArea
    private JLabel displayJLabel;
    private JTextArea displayJTextArea;

    LinkedList<Movie> list = new LinkedList<Movie>();

    public movieInventoryGUI()
    {
        createUserInterface();
    }

    private void createUserInterface()
    {
        // get content pane for attaching GUI components
        Container contentPane = getContentPane();

        // enable explicit positioning of GUI components 
        contentPane.setLayout( null );

        inputMovieJPanel = new JPanel();
        inputMovieJPanel.setBounds( 16, 16, 208, 218 );
        inputMovieJPanel.setBorder(
            new TitledBorder( "Input Movie" ) );
        inputMovieJPanel.setLayout( null );
        contentPane.add( inputMovieJPanel );
      
        MovieNameJLabel = new JLabel();
        MovieNameJLabel.setBounds( 8, 32, 90, 23 );
        MovieNameJLabel.setText( "Movie Name:" );
        inputMovieJPanel.add( MovieNameJLabel );

        MovieNameJTextField = new JTextField();
        MovieNameJTextField.setBounds( 104, 32, 88, 21 );
        MovieNameJTextField.setHorizontalAlignment(
            JTextField.RIGHT );
        inputMovieJPanel.add( MovieNameJTextField );
  
        MediaJLabel = new JLabel();
        MediaJLabel.setBounds( 8, 56, 60, 23 );
        MediaJLabel.setText( "Media:" );
        inputMovieJPanel.add( MediaJLabel );

        MediaJTextField = new JTextField();
        MediaJTextField.setBounds( 104, 56, 88, 21 );
        MediaJTextField.setHorizontalAlignment( JTextField.RIGHT );
        inputMovieJPanel.add( MediaJTextField );

        ReleaseYearJLabel = new JLabel();
        ReleaseYearJLabel.setBounds( 8, 80, 90, 23 );
        ReleaseYearJLabel.setText( "Release Year:" );
        inputMovieJPanel.add( ReleaseYearJLabel );

        ReleaseYearJTextField = new JTextField();
        ReleaseYearJTextField.setBounds( 104, 80, 56, 21 );
        ReleaseYearJTextField.setHorizontalAlignment( JTextField.RIGHT );
        inputMovieJPanel.add( ReleaseYearJTextField );

        AddMovieJButton = new JButton();
        AddMovieJButton.setBounds( 72, 182, 120, 24 );
        AddMovieJButton.setText( "Add Movie" );
        inputMovieJPanel.add( AddMovieJButton );
        AddMovieJButton.addActionListener(
          
        new ActionListener(){ 
            public void actionPerformed(ActionEvent event){
                AddMovieActionPerformed(event);
            }
        } 
        );

        // set up displayJLabel
        displayJLabel = new JLabel();
        displayJLabel.setBounds( 240, 16, 150, 23 );
        displayJLabel.setText( "Movies:" );
        contentPane.add( displayJLabel );
      
        // set up displayJTextArea
        displayJTextArea = new JTextArea();
        displayJTextArea.setBounds( 240, 48, 402, 184 );
        displayJTextArea.setEditable( false );
        contentPane.add( displayJTextArea );
      
        ShowMovieJButton = new JButton();
        ShowMovieJButton.setBounds( 490, 244, 120, 23 );
        ShowMovieJButton.setText( "Show Movie" );
        contentPane.add( ShowMovieJButton );

        ShowMovieJButton.addActionListener(
          
        new ActionListener(){ 
            public void actionPerformed(ActionEvent event){
                ShowMovieActionPerformed(event);
            }
        } 
        );

        setTitle( "Movie Class" ); // set title bar string
        setSize( 670, 308 );          // set window size
        setVisible( true );           // display window

    } // end method createUserInterface

    private void AddMovieActionPerformed(
        ActionEvent event )
    {   
        // get user input
        String nameOfMovie = MovieNameJTextField.getText();
        String Media = MediaJTextField.getText();
        int year = Integer.parseInt(ReleaseYearJTextField.getText());
        
        /*list.add(nameOfMovie);
        list.add(Media);
        list.add(year);*/ //I do not know how to add use inout to list

        for(Movie m: list){
            m.year = year;
            m.media = Media;
            m.name = nameOfMovie;
            displayJTextArea.append(m.year+" "+m.media+" "+m.name+" ");  
        }     
        
        //clear text boxes for new data
        MovieNameJTextField.setText("");
        MediaJTextField.setText("");
        ReleaseYearJTextField.setText("");
    } 
    
    private void ShowMovieActionPerformed(
        ActionEvent event )
    {
        displayJTextArea.append("Year\tMedia\tTitle\n");
        String s="";
       
        for(Movie m: list){
            s += (m.year+" "+m.media+" "+m.name+" ");
        }  
            displayJTextArea.append(s);
           
    } 
  
    // main method
    public static void main( String[] args ) 
    {
        movieInventoryGUI application = new movieInventoryGUI();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
    } 
} 


