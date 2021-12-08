// Name: Giselle Guaman
// Prof. Aljamal
// CSC-117-02 Java Programming
// Due Date: 4/12/2021
// What does the program do: This program demonstrates using array
// operations

import java.util.Scanner;
public class ArrayOperations
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
      
      //populate the array
      for (int i = 0; i < SIZE; i++)
      {
        System.out.println("Enter a number for array element " + i);
        nums[i] = KB.nextInt();
        while(nums[i] < -100 || nums[i] > 100)
        {
        System.out.println("Renter a number between -100 and 100");
        nums[i] = KB.nextInt();
        }
      }
      
      //find and display the sum of the positive elements in the array
      for (int k = 0; k < SIZE; k++)
      {
        if(nums[k] > 0)
        {
        GTotal = GTotal + nums[k];
        }
      }
      System.out.println("The sum of the positive array elements = " + GTotal);
      
      //find and display the sum of the negative elements in the array
      for (int k = 0; k < SIZE; k++)
      {
        if(nums[k] < 0)
        {
        GTotal2 = GTotal2 + nums[k];
        }
      }
      System.out.println("The sum of the negative array elements = " + GTotal2);
      
      //display the positive odd array elements
      System.out.println("The positive odd array elements are: ");
      for (int i = 0; i < SIZE; i++)
      {
        if(nums[i] > 0 && nums[i]%2== 1)
        {
        System.out.printf("%15d", nums[i]);
        System.out.printf("\n");
        }
      }
      
      //display the negative even array elements
      System.out.println("The negative even array elements are: ");
      for (int i = 0; i < SIZE; i++)
      {
        if(nums[i] < 0 && nums[i]%2 == 0)
        {
        System.out.printf("%15d", nums[i]);
        System.out.printf("\n");
        }
      }
      
      //display the positive array elements in reverse order
      System.out.println("The positive array elements in reverse order are:");
      for (int i = SIZE -1; i >= 0; i--)
      {
        if(nums[i] > 0)
        {
        System.out.printf("%15d", nums[i]);
        System.out.printf("\n");
        }
      }
      
      //display the negative array elements
      System.out.println("The negative array elements are: ");
      for (int i = 0; i < SIZE; i++)
      {
        if(nums[i] < 0)
        {
        System.out.printf("%15d", nums[i]);
        System.out.printf("\n");
        }
      }
      
      //display the array elements
      System.out.println("The array elements are: ");
      for(int i=0; i < SIZE; i++)
      {
         System.out.printf("%15d", nums[i]);
         System.out.printf("\n");
      }
      
      //display the count for negative array elements
      for (int i = 0; i < SIZE; i++)
      {
         if(nums[i] < 0)
         {
         CountNegative++;
         }
      }
      System.out.println("The number of negative array elements is: " + CountNegative);
      
      //display the count for positive array elements
      for (int i = 0; i < SIZE; i++)
      {
         if(nums[i] > 0)
         {
         CountPositive++;
         }
      }
      System.out.println("The number of positive array elements is: " + CountPositive);

   }
}