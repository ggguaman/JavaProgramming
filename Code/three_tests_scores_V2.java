// work around the extra Space example

import java.util.Scanner;
class three_tests_scores_V2
{
   public static void main(String[] args)
   {
      
      // Scores 
      String First_name ;
      char Middle_name ;
      String Last_name ;
      double Score_1 ;
      double Score_2 ; 
      double Score_3 ; 
      double Average = 0 ;
      
      // Create an instance of the scanner
      Scanner Keyboard = new Scanner(System.in);
      
      // Prompt the user to enter the score of each test 
      System.out.println("Please Enter Score_1");        
      Score_1 = Keyboard.nextDouble();
      
      System.out.println("Please Enter Score_2");        
      Score_2 = Keyboard.nextDouble();
      System.out.println("Please Enter Score_3");        
      Score_3 = Keyboard.nextDouble();
            
      System.out.println("First_name?");
       First_name=Keyboard.next();
            
       System.out.println("Middle_name?");
      
      Middle_name=Keyboard.next().charAt(0);
   
      System.out.println("Last_name?");
     Last_name=Keyboard.next();
         
           
      // Process 
      Average = (Score_1 + Score_2 + Score_3 ) / 3.0 ;
      
      // Output
      System.out.println("Score_1 = " + Score_1);        
      System.out.println("Score_2 = " + Score_2);
      System.out.println("Score_3 = " + Score_3);
      System.out.println("Average = " + Average);
      System.out.println("First Name: " + First_name);
      System.out.println("Middle Initial: " + Middle_name);
      System.out.println("Last Name : " + Last_name);


      
      
      
      
      
      
      
         }
}