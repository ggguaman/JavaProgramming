// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 2/12/2021
// What does the program do: This program demonstrates how to calculate 
// the average of three test scores using input scanner

import java.util.Scanner;
public class TestScores1
{
   public static void main(String[] args)
   {
   // initializing variables
    String First_Name;
    char Middle_Initial;
    String Last_Name;
    double First_Score;
    double Second_Score;
    double Third_Score;
    double Average = 0;
    final double Average_calc = 3;
    
    // creating input scanner
    Scanner KB = new Scanner(System.in);
    
    // asking user for first name
    System.out.println("Please enter First Name");
    First_Name = KB.next();
    
    // asking user for middle inital
    System.out.println("Please enter Middle Initial");
    Middle_Initial = KB.next().charAt(0);
    
    // asking user for last name
    System.out.println("Please enter Last Name");
    Last_Name = KB.next();
    
    // asking user for test score 1
    System.out.println("Please enter First Test Score");
    First_Score = KB.nextDouble();
    
    // asking user for test score 2
    System.out.println("Please enter Second Test Score");
    Second_Score = KB.nextDouble();
    
    // asking user for test score 3
    System.out.println("Please enter Third Test Score");
    Third_Score = KB.nextDouble();
    
    // display first name
    System.out.println("\nFirst Name: " + First_Name);
    
    // display middle initial
    System.out.println("Middle Initial: " + Middle_Initial);
    
    //display last name
    System.out.println("Last Name: " + Last_Name);
    
    // calculate average
    Average = (First_Score + Second_Score + Third_Score)/Average_calc;
    
    // display average
    System.out.println("Average: " + Average);
   }
   
}