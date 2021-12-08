// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 4/12/2021
// What does the program do: This program demonstrates using array
// operations with a switch statement

import java.util.Scanner;
public class ArrayOperationsMenuLab
{
   public static void main(String[] args)
   {
      //declaration and initialization
      final int SIZE = 10; 
      Scanner KB = new Scanner(System.in);
      int[] nums = new int[SIZE];
      int Counter;
      int Number;
      char Repeat = 'y';
      
      //populate the array
      InputMethod(nums, SIZE);
         
      //while loop
      while(Repeat == 'Y' || Repeat == 'y')
      {
         Number = MenuMethod();
            
         //switch statement
         switch(Number)
         {
            case 1: PositiveSumMethod(nums, SIZE);
                break;
            case 2: NegativeSumMethod(nums, SIZE);
                break;
            case 3: PositiveOddMethod(nums, SIZE);
                break;
            case 4: NegativeEvenMethod(nums, SIZE);
                break;
            case 5: PositiveReverseMethod(nums, SIZE);
                break;
            case 6: NegativeOutputMethod(nums, SIZE);
                break;
            case 7: OutputMethod(nums, SIZE);
                break;
            case 8: NegativeSizeMethod(nums, SIZE);
                break;
            case 9: PositiveOutputMethod(nums, SIZE);
                break;
            default: System.out.println("Invalid choice.");
         }
         System.out.println("To reselect from the menu enter 'Y' or 'y'. To exit hit any other key.");
         Repeat = KB.next().charAt(0);
      }
   }
      //my methods
      //inputmethod
      public static void InputMethod(int [] nums, int SIZE)
      {
         Scanner KB = new Scanner(System.in);
         for (int i = 0; i < SIZE; i++)
         {
            System.out.println("Enter a number for array element " + i);
            nums[i] = KB.nextInt();
            while(nums[i] < -100 || nums[i] > 100)
            {
               System.out.println("Reenter a number between -100 and 100");
               nums[i] = KB.nextInt();
            }
         }
      }
      
      //output method
      public static void OutputMethod(int [] nums, int SIZE)
      {
         System.out.println("You chose 7: array elements.");
         System.out.println("The array elements are: ");
         for(int i=0; i < SIZE; i++)
         {
            System.out.printf("%15d", nums[i]);
            System.out.printf("\n");
         }
      }
      
      //case 7: this method finds the sum of the positive elements in the array and displays it
      public static void PositiveSumMethod(int [] nums, int SIZE)
      {
         int GTotal = 0;
         System.out.println("You chose 1: sum of the positive array elements.");
         for (int k = 0; k < SIZE; k++)
         {
            if(nums[k] > 0)
            {
               GTotal = GTotal + nums[k];
            }
         }
         System.out.println("The sum of the positive array elements = " + GTotal);
      }
      
      //menu method
      public static int MenuMethod()
      {
         int Number;
         Scanner KB = new Scanner(System.in);
         System.out.println("\nPlease select one of the choices:");
         System.out.println("Enter 1 to calculate the sum of the positive array elements.");
         System.out.println("Enter 2 to calculate the sum of the negative array elements.");
         System.out.println("Enter 3 to display the positive odd array elements.");
         System.out.println("Enter 4 to display the negative even array elements.");
         System.out.println("Enter 5 to display the positive array elements in reverse order.");
         System.out.println("Enter 6 to display the negative array elements.");
         System.out.println("Enter 7 to display the array elements.");
         System.out.println("Enter 8 to find the number of negative array elements.");
         System.out.println("Enter 9 to find the number of positive array elements.");
         Number = KB.nextInt();
         return Number;
      }
      
      //case 2: negative sum method 
      public static void NegativeSumMethod(int [] nums, int SIZE)
      {
         int GTotal2 = 0;
         System.out.println("You chose 2: sum of the negative array elements.");
         for (int k = 0; k < SIZE; k++)
         {
            if(nums[k] < 0)
            {
               GTotal2 = GTotal2 + nums[k];
            }
         }
         System.out.println("The sum of the negative array elements = " + GTotal2);
      }
      
      //case 3: positive odd method
      public static void PositiveOddMethod(int [] nums, int SIZE)
      {
         System.out.println("You chose 3: positive odd array elements.");
         System.out.println("The positive odd array elements are: ");
         for (int i = 0; i < SIZE; i++)
         {
            if(nums[i] > 0 && nums[i]%2== 1)
            {
               System.out.printf("%15d", nums[i]);
               System.out.printf("\n");
            }
         }
      }
      
      //case 4: negative even method
      public static void NegativeEvenMethod(int [] nums, int SIZE)
      {
         System.out.println("You chose 4: negative even array elements.");
         System.out.println("The negative even array elements are: ");
         for (int i = 0; i < SIZE; i++)
         {
            if(nums[i] < 0 && nums[i]%2 == 0)
            {
               System.out.printf("%15d", nums[i]);
               System.out.printf("\n");
            }
         }
      }
      
      //case 5: positive reverse method
      public static void PositiveReverseMethod(int [] nums, int SIZE)
      {
         System.out.println("You chose 5: positive array elements in reverse order.");
         System.out.println("The positive array elements in reverse order are:");
         for (int i = SIZE -1; i >= 0; i--)
         {
            if(nums[i] > 0)
            {
               System.out.printf("%15d", nums[i]);
               System.out.printf("\n");
            }
         }
      }
      
      //case 6: negative output method
      public static void NegativeOutputMethod(int [] nums, int SIZE)
      {
         System.out.println("You chose 6: the negative array elements.");
         System.out.println("The negative array elements are: ");
         for (int i = 0; i < SIZE; i++)
         {
            if(nums[i] < 0)
            {
               System.out.printf("%15d", nums[i]);
               System.out.printf("\n");
            }
         }
      }
      
      //case 8: negative size method
      public static void NegativeSizeMethod(int [] nums, int SIZE)
      {
         int CountNegative = 0;
         System.out.println("You chose 8: number of negative array elements.");
         for (int i = 0; i < SIZE; i++)
         {
            if(nums[i] < 0)
            {
               CountNegative++;
            }
         }
         System.out.println("The number of negative array elements is: " + CountNegative);
      }
      
      //case 9: positive output method
      public static void PositiveOutputMethod(int [] nums, int SIZE)
      {
         int CountPositive = 0;
         System.out.println("You chose 9: number of positive array elements.");
         for (int i = 0; i < SIZE; i++)
         {
            if(nums[i] > 0)
            {
               CountPositive++;
            }
         }
         System.out.println("The number of positive array elements is: " + CountPositive);
      }
      
}  //class end