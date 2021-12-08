/**
   This program shows an array being created.
*/

import java.util.Scanner;
public class ArrayClassLab
{
   public static void main(String[] args)
   {
      //declaration and initialization
      final int SIZE = 5; 
      Scanner KB = new Scanner(System.in);
      int[] nums = new int[SIZE];
      int Total = 0, Average = 0;
      int[] nums2 = {3, 5, 8, 9, 6};
      int GTotal = 0;
      
      int Largest = nums2[0];
      for (int k = 0; k < SIZE; k++)
      {
        if(nums2[k] > Largest)
        {
        Largest = nums2[k];
        }
      }
      System.out.println("The largest number in the array is: " + Largest);

      for (int k = 0; k < SIZE; k++)
      {
        Total = Total + nums2[k];
      }
      
      Average = Total/SIZE;
      System.out.println("The average of the array elements is: " + Average);
      
      
      //populate the array
      /*for (int i = 0; i < SIZE; i++)
      {
        System.out.println("Enter a number for array element " + i);
        nums[i] = KB.nextInt();
        while(nums[i] < -50 || nums[i] > 100)
        {
        System.out.println("Renter a number between -50 and 100");
        nums[i] = KB.nextInt();
        }
      }
      
      //to find the sum of the elements in the array
      for (int k = 0; k < SIZE; k++)
      {
        GTotal = GTotal + nums[k];
      }
      
      //display sum of the elements in the array
      System.out.println("The sum of the array elements = " + GTotal);

      //display the array elements
      System.out.println("The array elements are: ");
      for (int i = 0; i < SIZE; i++)
      {
        System.out.printf("%15d", nums[i]);
        System.out.printf("\n");
      }
      
      /*display the array elements in reverse order
      System.out.println("The array elements in reverse order are:");
      for (int i = SIZE -1; SIZE>= 0; i--)
      {
        System.out.printf("%15d", nums[i]);
        System.out.printf("\n");
      }
      
      //display the negative array elements
      System.out.println("The negative array elements are: ");
      for (int i = SIZE - 1; SIZE >= 0; i--)
      {
        if(nums[i] < 0)
        {
        System.out.printf("%15d", nums[i]);
        System.out.printf("\n");
        }
      }
      
      //display the even numbers
      System.out.println("The negative array elements are: ");
      for (int i = SIZE -1; SIZE>= 0; i--)
      {
        if(nums[i]%2== 0)
        {
        System.out.printf("%15d", nums[i]);
        System.out.printf("\n");
        }
      }*/
   }
}
