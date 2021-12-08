// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 3/8/2021
// What does the program do: This program demonstrates using a switch
// statement to calculate the area of a shape and the for loop

import java.util.Scanner;
public class ShapeSwitch3
{
   public static void main(String[] args)
   {
   //initializing variables
   int Number;
   int Counter;
   double Side;
   double Length;
   double Width;
   double Base;
   double Height;
   double Radius;
   double Area = 0;
   final double Pi = 3.15;
   Scanner KB = new Scanner(System.in);
   
   System.out.println("This program is to calculate the area of a shape.");
   //loop statement
   for (Counter = 4; Counter >= 0; Counter--)
      {
       System.out.println("\nPlease select one of the choices:");
       System.out.println("Enter 1 for square.");
       System.out.println("Enter 2 for rectangle.");
       System.out.println("Enter 3 for triangle.");
       System.out.println("Enter 4 for circle.");
       Number = KB.nextInt();
       switch(Number)
         {
         case 1: System.out.println("You chose 1: square");
            System.out.println("\nPlease enter the side length:");
            Side = KB.nextDouble();
            if (Side > 0)
            {
               Area = Side * Side;
               System.out.println("The area of the square is: " + Area);
               System.out.println("Count: " + Counter);
            }
            else
            {
               System.out.println("Side length cannot be 0 or less.");
            }
            break;
         case 2: System.out.println("You chose 2: rectangle");
            System.out.println("\nPlease enter the length:");
            Length = KB.nextDouble();
            if (Length > 0)
            {
               System.out.println("Please enter the width:");
               Width = KB.nextDouble();
               Area = Length * Width;
               System.out.println("The area of the rectangle is: " + Area);
               System.out.println("Count: " + Counter);
            }
            else
            {
               System.out.println("Length cannot be 0 or less.");
            }
            break;
         case 3: System.out.println("You chose 3: triangle");
            System.out.println("\nPlease enter the base length:");
            Base = KB.nextDouble();
            if (Base > 0)
            {
               System.out.println("Please enter the height:");
               Height = KB.nextDouble();
               Area = Base * Height * 0.5;
               System.out.println("The area of the triangle is: " + Area);
               System.out.println("Count: " + Counter);
            }
            else
            {
               System.out.println("The base length cannot be 0 or less.");
            }
            break;
         case 4: System.out.println("You chose 4: circle");
            System.out.println("\nPlease enter the radius length:");
            Radius = KB.nextDouble();
            if (Radius > 0)
            {
               Area = Pi * Radius * Radius;
               System.out.println("The area of the circle is: " + Area);
               System.out.println("Count: " + Counter);
            }
            else
            {
               System.out.println("Radius length cannot be 0 or less.");
            }
            break;
         default: System.out.println("Invalid choice.");
         }
      }
   }
}