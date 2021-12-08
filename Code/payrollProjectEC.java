//Giselle Guaman
//Prof. Aljamal
//Java Programmimng
//May 10, 2021

//****The Java Student Files were used as a Refrence for this project***
/*****This program is will calculate the tax, gross, and net of 10 employees The results will be written in a file.****/

import java.util.Scanner; //for the Scanner class
import java.io.*;         //for the File class

public class payrollProjectEC
{
   public static void main (String []args) throws IOException 
   {
      
      //array declarations
      final int size = 10;                        //setting 10 as a final
      String [] firstName = new String [size];   //array for first name
      String [] midInitial = new String [size];  //array for middle initial
      String [] lastName = new String [size];    //array for last name
         int []  idNumber = new int [size];      //array for id numbers
      double [] hoursWorked = new double [size]; //array for Hours worked
      double [] ratePerHour = new double [size]; //array for Rate per hour
      double [] salesTax = new double [size];    //array for sales tax
      double [] fedTax = new double [size];      //array for federal tax
      double [] grossPay = new double [size];    //array for gross pay
      double [] netPay = new double [size];      //array for net pay
      double grossTotal = 0; 
      double grossAvg = 0;                        //container for accumulator and average 
      
      //Creating a new Scanner
      Scanner keyboard = new Scanner(System.in);
      
      InputMethod(firstName, midInitial, lastName, idNumber, hoursWorked, ratePerHour, salesTax, fedTax, grossPay, netPay, grossTotal, size);
      
      for (int i = 0; i < size; i++)
      {
         if (hoursWorked [i] >=0 && hoursWorked [i] <= 40)
         {
            grossPay [i] = GrossPayMethod(hoursWorked [i], ratePerHour [i]);
         }
         //calculating overtime if hours worked are greater than 40
         else if (hoursWorked [i] > 40)
         {
            grossPay [i] = OvertimePayMethod(hoursWorked [i], ratePerHour [i]);
         }
         
         salesTax [i] = SalesTaxMethod(grossPay [i], size);
         fedTax [i] = FedTaxMethod(grossPay [i], size);
         netPay [i] = NetPayMethod(grossPay [i], salesTax [i], fedTax [i], size);
            
         //accumulating the totalGross
         grossTotal += grossPay[i];
      }
      
      //calculating the gross average of all employees
      grossAvg = GrossAvgMethod(grossTotal, size);
      
      //displaying the output options to the user
      int choice = 0;
      choice = OutputMenu(choice);
       
      switch (choice)
       {
        //sending the output to the screen
         case 1: CaseOneMethod(firstName, midInitial, lastName, idNumber, hoursWorked, ratePerHour, salesTax, fedTax, grossPay, netPay, grossTotal, grossAvg, size);         
            break;
         //sending the output to a file
         case 2 : CaseTwoMethod(firstName, midInitial, lastName, idNumber, hoursWorked, ratePerHour, salesTax, fedTax, grossPay, netPay, grossTotal, grossAvg, size);  
            break;
       //sending the output to both screen and file
         case 3: CaseThreeMethod(firstName, midInitial, lastName, idNumber, hoursWorked, ratePerHour, salesTax, fedTax, grossPay, netPay, grossTotal, grossAvg, size);  
            break;
         default: System.out.println("Invalid choice.");
       } 
   }  
   
   //input method
   public static void InputMethod(String[] firstName, String [] midInitial, String [] lastName, int []  idNumber, double [] hoursWorked, double [] ratePerHour, double [] salesTax, double [] fedTax, double [] grossPay, double [] netPay, double grossTotal, int size)
   {
      Scanner keyboard = new Scanner(System.in);
         
      for (int i = 0; i < size; i++)
      {
         System.out.println("Please enter the First Name for employee #" + (i+1) + ": ");
         firstName [i] = keyboard.nextLine();
      
         System.out.println("Please enter the Middle Initial for employee #" + (i+1) + ": ");
         midInitial [i] = keyboard.nextLine();
      
         System.out.println("Please enter the Last Name for employee #" + (i+1) + ": ");
         lastName [i] = keyboard.nextLine();
         
         System.out.println("Please enter the ID number for employee #" + (i+1) + ": ");
         idNumber [i] = keyboard.nextInt();
      
         System.out.println("Please enter the Hours Worked for employee #" + (i+1) + ": ");
         hoursWorked [i] = keyboard.nextDouble();
         //input validation hours worked cant be less than 0 or greater than 60
         if(hoursWorked [i] < 0 || hoursWorked [i] > 60)
         {
            hoursWorked [i] = HoursInputValidation(hoursWorked [i]);
         }
          
         System.out.println("Please enter The Rate per Hour for employee #" + (i+1) + ": ");
         ratePerHour [i] = keyboard.nextDouble();
         //input validation rate per hour must be between $15.00 and $35.00
         if(ratePerHour [i] < 15 || ratePerHour [i] > 35)
         {
            ratePerHour [i] = RateInputValidation(ratePerHour [i]);
         }
         
         //clearing buffer
         keyboard.nextLine();
      }
   }
   
   //hours worked input validation   
   public static double HoursInputValidation(double hoursWorked)
   {
      Scanner keyboard = new Scanner(System.in);
      while (hoursWorked < 0 || hoursWorked > 60 )
      {
         System.out.println("Please enter Valid Hours Worked for employee.");
         hoursWorked = keyboard.nextDouble();
      }
      return hoursWorked;
   }
   
   //rate per hour input validation   
   public static double RateInputValidation(double ratePerHour)
   {
      Scanner keyboard = new Scanner(System.in);
      while (ratePerHour < 15 || ratePerHour > 35)
      {
         System.out.println("Please enter a Valid Rate per Hour for employee.");
         ratePerHour = keyboard.nextDouble();
      }
      return ratePerHour;
   }
   
   //gross pay method
   public static double GrossPayMethod(double hoursWorked, double ratePerHour)
   {
      return(hoursWorked * ratePerHour);
   }
   
   //gross overtime pay method
   public static double OvertimePayMethod(double hoursWorked, double ratePerHour)
   {
      return(40 * ratePerHour + ((hoursWorked - 40)*ratePerHour*1.5));
   }
   
   //sales tax method
   public static double SalesTaxMethod(double grossPay, int size)
   {
      return(grossPay * 0.07);
   }
   
   //fed tax method
   public static double FedTaxMethod(double grossPay, int size)
   {
      return(grossPay * 0.15);
   }
   
   //net pay method
   public static double NetPayMethod(double grossPay, double salesTax, double fedTax, int size)
   {
      return(grossPay - salesTax - fedTax);
   }
   
   //gross average method        
   public static double GrossAvgMethod(double grossTotal, int size)
   {
      return(grossTotal/size);
   }
   
   //output menu   
   public static int OutputMenu(int choice)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nOutput Options");
      System.out.println("1. Send output to the screen");
      System.out.println("2. Send output to the output file");
      System.out.println("3. Send output to both");
      choice = keyboard.nextInt();
      return choice;
   }
   
   //case one method   
   public static void CaseOneMethod(String[] firstName, String [] midInitial, String [] lastName, int []  idNumber, double [] hoursWorked, double [] ratePerHour, double [] salesTax, double [] fedTax, double [] grossPay, double [] netPay, double grossTotal, double grossAvg, int size)
   {
      System.out.printf("\n%-20s\t%15s\t%8s\t%5s\t%15s\t%15s\t%12s\t%10s\t%10s\t%10s","Employee last Name","First Name","Id","MI","Rate per Hour($)","hours Worked","StateTax($)","Fed Tax($)","Gross($)","Net($)");
          
      //for loop to display data of all employees
      for(int i = 0 ; i < size; i++)
      {
         System.out.printf("\n%-20s\t%15s\t%8d\t%5s\t%15.2f\t%15.2f\t%12.2f\t%10.2f\t%10.2f\t%10.2f",lastName[i],firstName[i],idNumber[i],midInitial[i],ratePerHour[i],hoursWorked[i],salesTax[i],fedTax[i],grossPay[i],netPay[i]);
      }
      //displaying the total gross of the employees
      System.out.printf("\nTotal gross = $%5.2f", grossTotal);
      //displaying the average gross of the employees
      System.out.printf("\nGross Average = $%5.3f", grossAvg);
   }
   
   //case two method
   public static void CaseTwoMethod(String[] firstName, String [] midInitial, String [] lastName, int []  idNumber, double [] hoursWorked, double [] ratePerHour, double [] salesTax, double [] fedTax, double [] grossPay, double [] netPay, double grossTotal, double grossAvg, int size) throws IOException
   {
      String outputfile;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nEnter the name of output file: ");
      outputfile = keyboard.next();
      //opening file
      PrintWriter kb = new PrintWriter(outputfile);
      kb.printf("%-20s\t%15s\t%8s\t%5s\t%15s\t%15s\t%12s\t%10s\t%10s\t%10s","Employee last Name","First Name","Id","MI","Rate per Hour($)","hours Worked","StateTax($)","Fed Tax($)","Gross($)","Net($)");
      kb.write("\n");
      kb.printf("--------------------------------------------------------------------------------------------------------------------------------------------------------");
      for(int i=0;i<size;i++)
      {
         kb.printf("\n%-20s\t%15s\t%8d\t%5s\t%15.2f\t%15.2f\t%12.2f\t%10.2f\t%10.2f\t%10.2f",lastName[i],firstName[i],idNumber[i],midInitial[i],ratePerHour[i],hoursWorked[i],salesTax[i],fedTax[i],grossPay[i],netPay[i]);
      }
      kb.printf("\nTotal gross = $%5.2f", grossTotal);
      kb.printf("\nGross Average = $%5.3f", grossAvg);
      //closing file
      kb.close();
      System.out.println("Data written to the file.");   
   }
   
   //case three method 
   public static void CaseThreeMethod(String[] firstName, String [] midInitial, String [] lastName, int []  idNumber, double [] hoursWorked, double [] ratePerHour, double [] salesTax, double [] fedTax, double [] grossPay, double [] netPay, double grossTotal, double grossAvg, int size) throws IOException
   {
      String outputfile;
      Scanner keyboard = new Scanner(System.in);
      //input the filename
      System.out.println("\nEnter the name of output file: ");
      outputfile = keyboard.next();
      //opening the file
      PrintWriter kib = new PrintWriter(outputfile);
      kib.printf("%-20s\t%15s\t%8s\t%5s\t%15s\t%15s\t%12s\t%10s\t%10s\t%10s","Employee last Name","First Name","Id","MI","Rate per Hour($)","hours Worked","StateTax($)","Fed Tax($)","Gross($)","Net($)");
      kib.write("\n");
      kib.printf("---------------------------------------------------------------------------------------------------------------------------------------------------------");
      System.out.printf("%-20s\t%15s\t%8s\t%5s\t%15s\t%15s\t%12s\t%10s\t%10s\t%10s","Employee last Name","First Name","Id","MI","Rate per Hour($)","hours Worked","StateTax($)","Fed Tax($)","Gross($)","Net($)");
      for(int i=0;i<size;i++)
      {
         kib.printf("\n%-20s\t%15s\t%8d\t%5s\t%15.2f\t%15.2f\t%12.2f\t%10.2f\t%10.2f\t%10.2f",lastName[i],firstName[i],idNumber[i],midInitial[i],ratePerHour[i],hoursWorked[i],salesTax[i],fedTax[i],grossPay[i],netPay[i]);
         System.out.printf("\n%-20s\t%15s\t%8d\t%5s\t%15.2f\t%15.2f\t%12.2f\t%10.2f\t%10.2f\t%10.2f",lastName[i],firstName[i],idNumber[i],midInitial[i],ratePerHour[i],hoursWorked[i],salesTax[i],fedTax[i],grossPay[i],netPay[i]);
      }
      kib.printf("\nTotal gross = $%5.2f", grossTotal);
      kib.printf("\nGross Average = $%5.3f", grossAvg);
      System.out.printf("\nTotal gross = $%5.2f", grossTotal);
      System.out.printf("\nGross Average = $%5.3f", grossAvg);
      //closing the file
      kib.close();
      System.out.println("\nData written to the file.");   
   }
      
}