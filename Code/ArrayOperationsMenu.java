// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 4/12/2021
// What does the program do: This program demonstrates using array
// operations with a switch statement

import java.util.Scanner;
public class ArrayOperationsMenu
{
   public static void main(String[] args)
   {
      //declaration and initialization
      final int SIZE = 20; 
      Scanner KB = new Scanner(System.in);
      int[] nums = new int[SIZE];
      int GTotal = 0;
      int GTotal2 = 0;
      int CountPositive = 0;
      int CountNegative = 0;
      int Counter;
      int Number;
      char Repeat;
      
      System.out.println("To start the program enter 'Y' or 'y'. To exit hit any other key.");
      Repeat = KB.next().charAt(0);
      
      //while loop
      while(Repeat == 'Y' || Repeat == 'y')
      {
         //populate the array
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
         
         //for loop
         for (Counter = 9; Counter >= 0; Counter--)
         {
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
            
            //switch statement
            switch(Number)
            {
              case 1: System.out.println("You chose 1: sum of the positive array elements.");
                  for (int k = 0; k < SIZE; k++)
                  {
                     if(nums[k] > 0)
                     {
                        GTotal = GTotal + nums[k];
                     }
                  }
                  System.out.println("The sum of the positive array elements = " + GTotal);
                  break;
              case 2: System.out.println("You chose 2: sum of the negative array elements.");
                  for (int k = 0; k < SIZE; k++)
                  {
                     if(nums[k] < 0)
                     {
                        GTotal2 = GTotal2 + nums[k];
                     }
                  }
                  System.out.println("The sum of the negative array elements = " + GTotal2);
                  break;
              case 3: System.out.println("You chose 3: positive odd array elements.");
                  System.out.println("The positive odd array elements are: ");
                  for (int i = 0; i < SIZE; i++)
                  {
                     if(nums[i] > 0 && nums[i]%2== 1)
                     {
                        System.out.printf("%15d", nums[i]);
                        System.out.printf("\n");
                     }
                  }
                  break;
              case 4: System.out.println("You chose 4: negative even array elements.");
                  System.out.println("The negative even array elements are: ");
                  for (int i = 0; i < SIZE; i++)
                  {
                     if(nums[i] < 0 && nums[i]%2 == 0)
                     {
                        System.out.printf("%15d", nums[i]);
                        System.out.printf("\n");
                     }
                  }
                  break;
              case 5: System.out.println("You chose 5: positive array elements in reverse order.");
                  System.out.println("The positive array elements in reverse order are:");
                  for (int i = SIZE -1; i >= 0; i--)
                  {
                     if(nums[i] > 0)
                     {
                        System.out.printf("%15d", nums[i]);
                        System.out.printf("\n");
                     }
                  }
                  break;
              case 6: System.out.println("You chose 6: the negative array elements.");
                  System.out.println("The negative array elements are: ");
                  for (int i = 0; i < SIZE; i++)
                  {
                     if(nums[i] < 0)
                     {
                        System.out.printf("%15d", nums[i]);
                        System.out.printf("\n");
                     }
                  }
                  break;
              case 7: System.out.println("You chose 7: array elements.");
                  System.out.println("The array elements are: ");
                  for(int i=0; i < SIZE; i++)
                  {
                     System.out.printf("%15d", nums[i]);
                     System.out.printf("\n");
                  }
                  break;
              case 8: System.out.println("You chose 8: number of negative array elements.");
                  for (int i = 0; i < SIZE; i++)
                  {
                     if(nums[i] < 0)
                     {
                        CountNegative++;
                     }
                  }
                  System.out.println("The number of negative array elements is: " + CountNegative);
                  break;
              case 9: System.out.println("You chose 9: number of positive array elements.");
                  for (int i = 0; i < SIZE; i++)
                  {
                     if(nums[i] > 0)
                     {
                        CountPositive++;
                     }
                  }
                  System.out.println("The number of positive array elements is: " + CountPositive);
                  break;
              default: System.out.println("Invalid choice.");
            }
           System.out.println("To reselect from the menu enter 'Y' or 'y'. To exit hit any other key.");
           Repeat = KB.next().charAt(0);
         }
         
      }
      
   }
}