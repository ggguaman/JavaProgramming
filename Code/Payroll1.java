// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 2/10/2021
// What does the program do: This program dmeonstrates  

import java.util.Scanner;
public class Payroll1
{
   public static void main(String[] args)
   {

    String First_Name;
    char Middle_Initial;
    String Last_Name;
    
    double Hours_Worked;
    double RPH;
    double Gross = 0;
    double Tax = 0; 
    double Net = 0;
    final double Tax_per = 0.17;
    Scanner KB = new Scanner(System.in);
    
    //asking user for first name
    System.out.println("Please enter First Name");
    First_Name = KB.next();
    
    //asking user for middle inital
    System.out.println("Please enter Middle Initial");
    Middle_Initial = KB.next().charAt(0);
    
    //asking user for last name
    System.out.println("Please enter Last Name");
    Last_Name = KB.next();
    
    //asking user for hours worked
    System.out.println("Please enter hours worked");
    Hours_Worked = KB.nextDouble();
    
    //asking user for rate per hour
    System.out.println("Please enter rate per hour");
    RPH = KB.nextDouble();
    
    System.out.println("\nFirst Name: " + First_Name);
    System.out.println("Middle Initial: " + Middle_Initial);
    System.out.println("Last Name: " + Last_Name);
    System.out.println("Hours Worked: " + Hours_Worked);
    System.out.println("Rate Per Hour: " + RPH);
    Gross = Hours_Worked * RPH;
    System.out.println("Gross: $" + Gross);
    Tax = Gross * Tax_per;
    System.out.println("Tax: $" + Tax);
    Net = Gross - Tax;
    System.out.println("Net: $" + Net);
   }
}