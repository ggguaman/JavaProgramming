// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 5/3/2021
// What does the program do: find the circumference of several shapes using methods class

import java.util.Scanner;
public class ShapesCircumference
{
   public static void main(String[] args)
   {
     char Repeat;
     Scanner KB = new Scanner(System.in);

     System.out.println("This program is to calculate the circumference of a shape.");
     System.out.println("To select from the menu enter Y or y.");
     Repeat = KB.next().charAt(0);
     
     do
     {
      Switch_Method();
      System.out.println("\nTo reselect from the menu enter Y or y. To exit hit any other key.");
      Repeat = KB.next().charAt(0);
     } while(Repeat == 'Y' || Repeat == 'y');
   }
   
   //switch statement (receives nothing & returns nothing)
   public static void Switch_Method()
   {
      double Side1 = 0, Side2 = 0, Side3 = 0, Length = 0, Width = 0, SideX = 0, TriangleCircumference = 0, RectangleCircumference = 0, SquareCircumference = 0;
      int Option;
      Scanner KB = new Scanner(System.in);
      
      System.out.println("\nFor triangle enter 1.");
      System.out.println("For rectangle enter 2.");
      System.out.println("For square enter 3.");
      Option = KB.nextInt();
      
      switch(Option)
      {
         case 1: System.out.println("You chose 1: triangle.");
                 Side1 = TriangleInput(); 
                 Side2 = TriangleInput();
                 Side3 = TriangleInput();
                 TriangleCircumference = Triangle_Method(Side1, Side2, Side3);
                 TriangleOutput_Method(Side1, Side2, Side3, TriangleCircumference);
            break;
         case 2: System.out.println("You chose 2: rectangle.");
                 Length = RectangleInputLength();
                 Width = RectangleInputWidth();
                 RectangleCircumference = Rectangle_Method(Length, Width);
                 RectangleOutput_Method(Length, Width, RectangleCircumference);
            break;
         case 3: System.out.println("You chose 3: square.");
                 SideX = SquareInput();
                 SquareCircumference = Square_Method(SideX);
                 SquareOutput_Method(SideX, SquareCircumference);
            break;
         default: System.out.println("Invalid choice.");
      }
   }
   
   //input validation (recives nothing & returns something)
   public static double InputValidation()
   {
      double Number;
      Scanner KB = new Scanner(System.in);
      
      System.out.println("Please enter a positive value.");
      Number = KB.nextDouble();
      
      while(Number < 0)
      {
         System.out.println("Please enter a positive value.");
         Number = KB.nextDouble();
      }
      return Number;
   }
   
   //triangle input method(receives nothing & returns something)
   public static double TriangleInput()
   {
      double Side = 0;
      Scanner KB = new Scanner(System.in);
      
      System.out.println("\nEnter side length.");
      Side = KB.nextDouble();
      
      if(Side < 0)
      {
        Side = InputValidation();
      }
      return Side;
   }
   
   //triangle circumference method (receives something & returns nothing)
   public static double Triangle_Method(double Side1, double Side2, double Side3)
   {
      return(Side1 + Side2 + Side3);
   }
   
   //TriangleOutput Method (receives something & returns nothing)
   public static void TriangleOutput_Method(double Side1, double Side2, double Side3, double TriangleCircumference)
   {
      System.out.println("\nSide 1 = " + Side1 + " Side 2 = " + Side2 + " Side 3 = " + Side3); 
      System.out.println("Circumference = " + TriangleCircumference);
   }
   
   //rectangle input length (receives nothing & returns something)
   public static double RectangleInputLength()
   {
      double Length;
      Scanner KB = new Scanner(System.in);
      
      System.out.println("\nEnter length.");
      Length = KB.nextDouble();
      
      if(Length < 0)
      {
         Length = InputValidation();
      }
      return Length;
   }
   
   //rectangle input width (receives nothing & returns something)
   public static double RectangleInputWidth()
   {
      double Width;
      Scanner KB = new Scanner(System.in);
      
      System.out.println("Enter width.");
      Width = KB.nextDouble();
      
      if(Width < 0)
      {
         Width = InputValidation();
      }
      return Width;
   }
   
   //Rectangle Method (receives something & returns something)
   public static double Rectangle_Method(double Length, double Width)
   {
      return((Length * 2) + (Width * 2));
   }
   
   //RectangleOutput Method (receives something & returns nothing)
   public static void RectangleOutput_Method(double Length, double Width, double RectangleCircumference)
   {
      System.out.println("\nLength = " + Length + " Width = " + Width);
      System.out.println("Circumference = " + RectangleCircumference);
   }
   
   //square input (receives nothing & returns something)
   public static double SquareInput()
   {
      double SideX;
      Scanner KB = new Scanner(System.in);
      System.out.println("\nEnter side length.");
      SideX = KB.nextDouble();
      if(SideX < 0)
      {
         SideX = InputValidation();
      }
      return SideX;
   }
   
   //Square Method (receives something & returns something)
   public static double Square_Method(double SideX)
   {
      return(SideX * 4);
   }
   
   //square output (receives something & returns nothing)
   public static void SquareOutput_Method(double SideX, double SquareCircumference)
   {
      System.out.println("\nSide = " + SideX);
      System.out.println("Circumference = " + SquareCircumference);
   }
}