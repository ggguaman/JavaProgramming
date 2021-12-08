// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 3/10/2021
// What does the program do: This program demonstrates using a while
// loop to calculate the average of test scores from a class

import java.util.Scanner;
public class AvgTestScores_while
{
   public static void main(String[] args)
   {
    // initializing variables
    String First_Name;
    char Middle_Initial;
    String Last_Name;
    double First_Score = 0;
    double Second_Score = 0;
    double Third_Score = 0;
    double Average = 0;
    final double Average_calc = 3;
    double Class_Average = 0;
    int Students = 0;
    char Repeat;
    double Sum = 0;
    double Count = 0;
    
    // creating input scanner
    Scanner KB = new Scanner(System.in);
    
    // asking user if they want to start program
    System.out.println("To start program enter 'Y' or 'y'. To exit hit any other key.");
    Repeat = KB.next().charAt(0);
    
    // while loop
    while(Repeat == 'Y' || Repeat == 'y')
    {
    // asking for number of students
    System.out.println("How many students are in your class?");
    Students = KB.nextInt();
    
    while(Students > 0)
    {
    // asking for students first name
    System.out.println("Please enter First Name");
    First_Name = KB.next();
    
    // asking for students middle intitial
    System.out.println("Please enter Middle Initial");
    Middle_Initial = KB.next().charAt(0);
    
    // asking for students last name
    System.out.println("Please enter Last Name");
    Last_Name = KB.next();
    
    // asking for test score 1
    System.out.println("Please enter Test Score 1");
    First_Score = KB.nextDouble();
      while(First_Score <= 0)
      {
         System.out.println("Test Score 1 must be greater than 0. Please reenter the score.");
         First_Score = KB.nextDouble();
      }
    
    // asking for test score 2
    System.out.println("Please enter Test Score 2");
    Second_Score = KB.nextDouble();
      while(Second_Score <= 0)
      {
         System.out.println("Test Score 2 must be greater than 0. Please reenter the score.");
         Second_Score = KB.nextDouble();
      }
    
    // asking for test score 3
    System.out.println("Please enter Test Score 3");
    Third_Score = KB.nextDouble();
      while(Third_Score <= 0)
      {
         System.out.println("Test Score 3 must be greater than 0. Please reenter the score.");
         Third_Score = KB.nextDouble();
      }
    
    // display first name
    System.out.println("\nFirst Name: " + First_Name);
    
    // display middle initial
    System.out.println("Middle Initial: " + Middle_Initial);
    
    // display last name
    System.out.println("Last Name: " + Last_Name);
    
    // calculate average
    Average = (First_Score + Second_Score + Third_Score)/Average_calc;
    
    // accumulator
    Sum += Average;
    
    // display average
    System.out.println("Average: " + Average);
    
    // increment
    Count++;
    Students--;
    
    // display count
    System.out.println("Count: " + Count);
    }
    // calculate class average
    Class_Average = Sum/Count;
    
    // display class average
    System.out.println("Class Average: " + Class_Average);
    
    // repeat program option
    System.out.println("To restart program enter 'Y' or 'y'. To exit hit any other key.");
    Repeat = KB.next().charAt(0);
    }

   }
}