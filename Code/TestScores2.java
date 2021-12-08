// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 2/12/2021
// What does the program do: This program demonstrates how to calculate 
// the average of three test scores using dialog box

import javax.swing.JOptionPane;
public class TestScores2
{
   public static void main(String[] args)
   {
    // initializing variables
    String inputString;
    String First_Name; 
    char Middle_Initial; 
    String Last_Name;
    double First_Score;
    double Second_Score;
    double Third_Score;
    double Average = 0;
    final double Average_calc = 3;
    
    //asking user for first name
    First_Name = JOptionPane.showInputDialog("What is your first name?");
    
    // asking user for middle inital
    Middle_Initial = JOptionPane.showInputDialog("What is your middle inital?").charAt(0);
    
    // asking user for last name
    Last_Name = JOptionPane.showInputDialog("What is your last name?");
    
    // asking user for test score 1
    inputString = JOptionPane.showInputDialog("What is your first test score?");
    First_Score = Double.parseDouble(inputString);
    
    // asking user for test score 2
    inputString = JOptionPane.showInputDialog("What is your second test score?");
    Second_Score = Double.parseDouble(inputString);
    
    // asking user for test score 3
    inputString = JOptionPane.showInputDialog("What is your third test score?");
    Third_Score = Double.parseDouble(inputString);
    
    // calculate average
    Average = (First_Score + Second_Score + Third_Score)/Average_calc;
    
    // display average
    JOptionPane.showMessageDialog(null, "Your average is " +
                    Average);
    
    System.exit(0);
   }
   
}