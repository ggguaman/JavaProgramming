// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 3/23/2021
// What does the program do: This program demonstrates using a switch
// statement to calculate the area of a shape using a while, for loop, and printf

import java.util.Scanner;
public class ShapeSwitch2_printf
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
   char Repeat;
   Scanner KB = new Scanner(System.in);
   
   System.out.println("This program is to calculate the area of a shape.");
   System.out.println("To start program enter 'Y' or 'y'. To exit hit any other key.");
   Repeat = KB.next().charAt(0);   
   
   //while loop
   while(Repeat == 'Y' || Repeat == 'y')
   {
   //for loop 
   for (Counter = 1; Counter <=4; Counter++)
      {
       System.out.println("\nPlease select one of the choices:");
       System.out.println("Enter 1 for square.");
       System.out.println("Enter 2 for rectangle.");
       System.out.println("Enter 3 for triangle.");
       System.out.println("Enter 4 for circle.");
       Number = KB.nextInt();
       //switch statement
       switch(Number)
         {
         case 1: System.out.println("You chose 1: square");
            System.out.println("\nPlease enter the side length:");
            Side = KB.nextDouble();
            while(Side <= 0)
            {
               System.out.println("The side length cannot be 0 or less. Please reenter the side.");
               Side = KB.nextDouble();
            }
            Area = Side * Side;
            System.out.printf("The area of the square is: %s.\n", Area);
            System.out.printf("Count: %s.\n", Counter);
            break;
         case 2: System.out.println("You chose 2: rectangle");
            System.out.println("\nPlease enter the length:");
            Length = KB.nextDouble();
            while(Length <= 0)
            {
               System.out.println("The length cannot be 0 or less. Please reenter the length.");
               Length = KB.nextDouble();
            }
            System.out.println("Please enter the width:");
            Width = KB.nextDouble();
            while(Width <= 0)
            {
               System.out.println("The width cannot be 0 or less. Please reenter the width.");   
               Width = KB.nextDouble();
            }
            Area = Length * Width;
            System.out.printf("The area of the rectangle is: %s.\n", Area);
            System.out.printf("Count: %s.\n", Counter);
            break;
         case 3: System.out.println("You chose 3: triangle");
            System.out.println("\nPlease enter the base length:");
            Base = KB.nextDouble();
            while(Base <= 0)
            {
               System.out.println("The base length cannot be 0 or less. Please reenter the base.");
               Base = KB.nextDouble();
            }
            System.out.println("Please enter the height:");
            Height = KB.nextDouble();
            while(Height <= 0)
            {
               System.out.println("The height cannot be 0 or less. Please reenter the height.");
               Height = KB.nextDouble();
            }
            Area = Base * Height * 0.5;
            System.out.printf("The area of the triangle is: %s.\n", Area);
            System.out.printf("Count: %s.\n", Counter);
            break;
         case 4: System.out.println("You chose 4: circle");
            System.out.println("\nPlease enter the radius length:");
            Radius = KB.nextDouble();
            while(Radius <= 0)
            {
               System.out.println("The radius cannot be 0 or less. Please reenter the radius.");
               Radius = KB.nextDouble();
            }
            Area = Pi * Radius * Radius;
            System.out.printf("The area of the circle is: %s.\n", Area);
            System.out.printf("Count: %s.\n", Counter);
            break;
         default: System.out.println("Invalid choice.");
         }
       }
     }
     
   }
}