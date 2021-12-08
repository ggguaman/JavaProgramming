// work around the extra Space example

import java.util.Scanner;
class odd_even_number
{
   public static void main(String[] args)
   {
      
      int Number ;
      
      
      Scanner Keyboard = new Scanner(System.in);
      
      
      System.out.println("Please enter a number and I will tell you if it is odd or even");        
      Number = Keyboard.nextInt();
      
                  
      if(Number % 2 == 0)
         System.out.println("The number is even");
                 
           
      else
         {
           System.out.println("The number is odd");
           System.out.println("The number you entered is "+ Number);
         }
         
         }
         
}