// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 3/1/2021
// What does the program do: This program demonstrates using a nested if
// statement to determine if a student is accepted or rejected into college

import java.util.Scanner;
public class NestedIf
{
   public static void main(String[] args)
   {
    // initializing variables
    double GPA;
    double Income;
    char Resident;
    Scanner KB = new Scanner(System.in);
    
    //asking user to input GPA
    System.out.println("What is your GPA?");
    GPA = KB.nextDouble();
    
    //asking user to input family income  
    System.out.println("What is your family income?");
    Income = KB.nextDouble();
    
    //asking user if new jersey resident
    System.out.println("Are you a New Jersey resident?");
    Resident = KB.next().charAt(0);
   
    //nested if-else statement
    if (GPA < 3.75)
      {
         System.out.println("You are not accepted.");
      }
      else
      {
         if (Income < 60000)
         {
            System.out.println("You are not accepted.");
         }
         else
         {
            if (Resident == 'n')
            {
               System.out.println("You are not accepted.");
            }
            else
            {
               System.out.println("You are accepted.");
            }
         }
       }

   }
}