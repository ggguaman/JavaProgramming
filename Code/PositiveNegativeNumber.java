// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 2/22/2021
// What does the program do: This program demonstrates how to determine 
// if a number is positive, negative, or 0

import javax.swing.JOptionPane;
public class PositiveNegativeNumber
{
   public static void main(String[] args)
   {
    // initializing variables
    String inputString;
    double Number;
    
    // asking user for number 
    inputString = JOptionPane.showInputDialog("Please enter number");
    Number = Double.parseDouble(inputString);
    
    // initiating if else if statements
    if (Number == 0)
       JOptionPane.showMessageDialog(null, "The number entered is 0");
    else if (Number > 0)
      {
       JOptionPane.showMessageDialog(null, "The number entered is " + Number 
                  + " and it is positive");
      }
    else 
      {
       JOptionPane.showMessageDialog(null, "The number entered is " + Number
                  + " and it is negative");
      }
      
    System.exit(0);
    
   }
   
}