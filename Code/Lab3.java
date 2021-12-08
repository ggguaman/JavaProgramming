// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 2/3/2021

import java.util.Scanner;
public class Lab3
{
   public static void main(String[] args)
   {
    int First_Number;
    int Second_Number;
    int Total = 0;
    Scanner KB = new Scanner(System.in);
    
    System.out.println("Please enter the First Number");
    First_Number = KB.nextInt();
    System.out.println("Please enter the Second Number");
    Second_Number = KB.nextInt();
    
    System.out.println("First Number = " + First_Number);
    System.out.println("Second Number = " + Second_Number);
    Total = First_Number + Second_Number;
    System.out.println("Total = " + Total);
    System.out.println("\nThank you have a great day");
    
   }
   
 }