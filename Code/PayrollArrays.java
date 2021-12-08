// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 4/26/2021
// What does the program do: This program demonstrates using array
// operations and files to calculate the payroll of 10 employees

import java.util.Scanner;
import java.io.*;
public class PayrollArrays  
{
   public static void main(String[] args) throws IOException 
   {
    //declaration and initialization
    final int SIZE = 10;
    String[] First_Name = new String[SIZE];
    char[] Middle_Initial = new char[SIZE];
    String[] Last_Name = new String[SIZE];
    int[] ID = new int[SIZE];
    double[] Hours_Worked = new double[SIZE];
    double[] RPH = new double[SIZE];
    double[] Gross = new double[SIZE];
    double Total_Gross = 0;
    double Gross_Average;
    double[] State_Tax = new double[SIZE]; 
    double[] Fed_Tax = new double[SIZE];
    double[] Net = new double[SIZE];
    double Sum = 0;
    final double State_per = 0.07;
    final double Fed_per = 0.15;
    int Counter;
    int Number;
    String File_Name;
    
    //creating scanner
    Scanner KB = new Scanner(System.in);
    
    for(int k = 0; k < SIZE; k++)
    {
      //asking user for first name
      System.out.println("Please enter First Name");
      First_Name[k] = KB.next();
      
      //asking user for middle inital
      System.out.println("Please enter Middle Initial");
      Middle_Initial[k] = KB.next().charAt(0);
    
      //asking user for last name
      System.out.println("Please enter Last Name");
      Last_Name[k] = KB.next();
    
      //asking user for ID
      System.out.println("Please enter ID");
      ID[k] = KB.nextInt();
      
      //asking user for hours worked
      System.out.println("Please enter hours worked");
      Hours_Worked[k] = KB.nextDouble();
      while(Hours_Worked[k] < 0 || Hours_Worked[k] > 60)
      {
         System.out.println("Hours worked cannot be less than 0 or more than 60. Please reenter.");
         Hours_Worked[k] = KB.nextDouble();
      }
    
      //asking user for rate per hour
      System.out.println("Please enter rate per hour");
      RPH[k] = KB.nextDouble();
      while(RPH[k] < 15 || RPH[k] > 35)
      {
         System.out.println("Rate per hour cannot be less than $15 or more than $35. Please reenter.");
         RPH[k] = KB.nextDouble();
      }
      
      //calculting gross pay
      if(Hours_Worked[k] >= 0 && Hours_Worked[k] <=40)
      {
         Gross[k] = Hours_Worked[k] * RPH[k];
      }
      else if(Hours_Worked[k] > 40 && Hours_Worked[k] < 60)
      {
         Gross[k] = 40 * RPH[k] + (Hours_Worked[k] - 40) * (RPH[k] * 1.5);
      }
      
      //calculating state tax
      State_Tax[k] = Gross[k] * State_per;
      
      //calculating federal tax
      Fed_Tax[k] = Gross[k] * Fed_per;
      
      //calculating net pay
      Net[k] = Gross[k] - (State_Tax[k] + Fed_Tax[k]);
      
      //accumulator
      Total_Gross+= Gross[k];
    }
    //calculating average
    Gross_Average = Total_Gross/SIZE;
    
    for(Counter = 3; Counter >= 1; Counter--)
    {
      System.out.println("\nPlease select one of the choices:");
      System.out.println("Enter 1 to display output on screen.");
      System.out.println("Enter 2 to write output on a file.");
      System.out.println("Enter 3 to display output on screen and write on a file.");
      Number = KB.nextInt();
    
      //switch statement
      switch(Number)
      {
         case 1: System.out.println("You chose 1: display output on screen.");
            //displaying labels for table
            System.out.printf("\n%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Last Name:", "First Name:", "ID:", "Middle Initial:", "Rate per Hour:", "Hours Worked:", "State Tax:", "Federal Tax:", "Gross:", "Net:");
            for(int i = 0; i < SIZE; i++)
            {
               System.out.printf("%-15s %-15s %-15d %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f\n", Last_Name[i], First_Name[i], ID[i], Middle_Initial[i], RPH[i], Hours_Worked[i], State_Tax[i], Fed_Tax[i], Gross[i], Net[i]);
            }
            //displaying total gross
            System.out.println("\nTotal Gross: $" + Total_Gross);
            
            //display average gross
            System.out.println("Average Gross: $" + Gross_Average);
         break;
         case 2: System.out.println("You chose 2: write output on file.");
            //asking user for file name
            System.out.print("Enter the file name: ");
            File_Name = KB.next();
         
            //opening file
            PrintWriter outputFile = new PrintWriter(File_Name);
            
            //writting labels into file
            outputFile.printf("\n%-15s %-15s %-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Last Name:", "First Name:", "ID:", "Middle Initial:", "Rate per Hour:", "Hours Worked:", "State Tax:", "Federal Tax:", "Gross:", "Net:");
            
            //writing data input into file
            for(int i = 0; i < SIZE; i++)
            {
               outputFile.printf("%-15s %-15s %-10d %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f\n", Last_Name[i], First_Name[i], ID[i], Middle_Initial[i], RPH[i], Hours_Worked[i], State_Tax[i], Fed_Tax[i], Gross[i], Net[i]);
            }
            outputFile.println("\nTotal Gross: $" + Total_Gross);
            outputFile.println("Average Gross: $" + Gross_Average);
         
            //close the file
            outputFile.close();
            System.out.println("Data written to the file.");
         break;
         case 3: System.out.println("You chose 3: display output on screen and write on file.");
            //displaying labels for table
            System.out.printf("\n%-15s %-15s %-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Last Name:", "First Name:", "ID:", "Middle Initial:", "Rate per Hour:", "Hours Worked:", "State Tax:", "Federal Tax:", "Gross:", "Net:");
            for(int i = 0; i < SIZE; i++)
            {
               System.out.printf("%-15s %-15s %-10d %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f\n", Last_Name[i], First_Name[i], ID[i], Middle_Initial[i], RPH[i], Hours_Worked[i], State_Tax[i], Fed_Tax[i], Gross[i], Net[i]);
            }
            //displaying total gross
            System.out.println("\nTotal Gross: $" + Total_Gross);
            
            //displaying average gross
            System.out.println("Average Gross: $" + Gross_Average);
            
            //asking user for file name
            System.out.print("Enter the file name: ");
            File_Name = KB.next();
            
            //opening file
            PrintWriter OutputFile = new PrintWriter(File_Name);
            
            //writting labels into file
            OutputFile.printf("\n%-15s %-15s %-10s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Last Name:", "First Name:", "ID:", "Middle Initial:", "Rate per Hour:", "Hours Worked:", "State Tax:", "Federal Tax:", "Gross:", "Net:");
            
            //writing data input into file
            for(int i = 0; i < SIZE; i++)
            {
               OutputFile.printf("%-15s %-15s %-10d %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f\n", Last_Name[i], First_Name[i], ID[i], Middle_Initial[i], RPH[i], Hours_Worked[i], State_Tax[i], Fed_Tax[i], Gross[i], Net[i]);
            }
            OutputFile.println("\nTotal Gross: $" + Total_Gross);
            OutputFile.println("Average Gross: $" + Gross_Average);
            
            //close the file
            OutputFile.close();
            System.out.println("Data written to the file.");
         break;
         default: System.out.println("Invalid choice.");
      }
    }
    
   }
}