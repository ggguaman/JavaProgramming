// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 4/28/2021
// What does the program do: add, multiply, divide, subtract, input validation, quotient
//(methods implementation)

import java.util.Scanner;
public class ArithmeticOperations
{
   public static void main(String[] args)
   {
     double Num1, Num2, Total = 0, Difference = 0, Product = 0, Quotient = 0;
     int Option;
     char Repeat;
     Scanner KB = new Scanner(System.in);
     Greetings();
     Num1 = Input();
     Num2 = Input();
     Total = Sum_Method(Num1, Num2);
     Difference = Subtraction_Method(Num1, Num2);
     Product = Multiplication_Method(Num1, Num2);
     Quotient = Quotient_Method(Num1, Num2);
     
     System.out.println("To select from the menu enter Y or y.");
     Repeat = KB.next().charAt(0);
     
     do
     {
      Switch_Method(Num1, Num2, Total, Difference, Product, Quotient);
      System.out.println("\nTo reselect from the menu enter Y or y. To exit hit any other key.");
      Repeat = KB.next().charAt(0);
     } while(Repeat == 'Y' || Repeat == 'y');
   }
   
   //Greetings method (receives nothing & returns nothing)
   public static void Greetings()
   {
      System.out.println("Welcome to methods class.");
   }
   
   //Input method (receives nothing & returns something)
   public static double Input()
   {
      double Value;
      Scanner KB = new Scanner(System.in);
      System.out.println("Enter a number.");
      Value = KB.nextDouble();
      if(Value < 0)
      {
         Value = InputValidation();
      }
      return Value;
   }
   
   //Input validation method (receives nothing & returns something)
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
   
   //switch statement method
   public static void Switch_Method(double Num1, double Num2, double Total, double Difference, double Product, double Quotient)
   {
      int Option;
      Scanner KB = new Scanner(System.in);
      System.out.println("\nEnter 1 to display the numbers sum.");
      System.out.println("Enter 2 to display the numbers difference.");
      System.out.println("Enter 3 to display the numbers product.");
      System.out.println("Enter 4 to display the numbers quotient.");
      System.out.println("Enter 5 to display the numbers and their sum, product, and quotient.");
      Option = KB.nextInt();
     
      switch(Option)
      {
         case 1: SumOutput_Method(Num1, Num2, Total);
            break;
         case 2: Subtraction_Output(Num1, Num2, Difference);
            break;
         case 3: Multiplication_Output(Num1, Num2, Product);
            break;
         case 4: Quotient_Output(Num1, Num2, Quotient);
            break;
         case 5: Output_Method(Num1, Num2, Total, Difference, Product, Quotient);
            break;
         default: System.out.println("Invalid choice.");
      }
   }
   
   //Sum method (receives something & returns something)
   public static double Sum_Method(double First, double Second)
   {
      return(First + Second);
   }
   
   //SumOutput method (receives something & returns nothing)
   public static void SumOutput_Method(double Num_One, double Num_Two, double Answer)
   {
      System.out.println("\nThe sum of the numbers = " + Answer);
   }
   
   //Subtraction method (receives something & returns something)
   public static double Subtraction_Method(double Firsts, double Seconds)
   {
      return(Firsts - Seconds);
   }
   
   //subtraction output method
   public static void Subtraction_Output(double Num_One, double Num_Two, double Difference)
   {
      System.out.println("\nThe difference of the numbers = " + Difference);
   }
   
   //Multiplication method (receives something & returns something)
   public static double Multiplication_Method(double Firstx, double Secondx)
   {
      return(Firstx * Secondx);
   }
   
   //Multiplication output method
   public static void Multiplication_Output(double First1, double Second1, double Prd)
   {
      System.out.println("\nThe product of the numbers = " + Prd);
   }
   
   //Quotient method (receives something & returns something)
   public static double Quotient_Method(double Firstq, double Secondq)
   {
      return(Firstq / Secondq);
   }
    
    //Quotient output method
    public static void Quotient_Output(double First, double Second, double Quotient)
    {
      System.out.println("\nThe quotient of the numbers = " + Quotient);
    }
    
   //Output method
   public static void Output_Method(double Num_One, double Num_Two, double Sum, double Difference, double Product, double Quotient)
   {
      System.out.println("\nFirst number = " + Num_One);
      System.out.println("Second number = " + Num_Two);
      System.out.println("The sum of the numbers = " + Sum);
      System.out.println("The difference of the numbers = " + Difference);
      System.out.println("The product of the numbers = " + Product);
      System.out.println("The quotient of the numbers = " + Quotient);
   }
   
}