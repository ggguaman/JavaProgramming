// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 2/8/2021

import java.util.Scanner;
public class Homework1
{
   public static void main(String[] args)
   {
    int Length;
    int Width;
    int Area = 0;
    Scanner KB = new Scanner(System.in);
    
    System.out.println("Please enter the Length");
    Length = KB.nextInt();
    System.out.println("Please enter the Width");
    Width = KB.nextInt();
    
    System.out.println("Length = " + Length);
    System.out.println("Width = " + Width);
    Area = Length * Width;
    System.out.println("Area = " + Area);
   }
   
}