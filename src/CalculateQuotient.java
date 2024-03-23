/* Requirements Analysis (English Description)
Create program that allows a user to calculate the
quotient of two numbers.  The program should ask the 
user for the numerator.  Then the program should ask the
user for the denoinator.  If denominator is equal to 0, give
the user an error message and ask the user for the denominator
again.  The program should continue to ask the user for the 
denominator as long as the user keeps entering the value of 0
for the denominator.  Once the user enters a value other than 0,
the program will calculate the quotient by dividing the numerator
by the denominator.  This program should allow for decimal values
for both numerator and denominator.  

Design (Algorithm)

*/

import java.util.Scanner;

public class CalculateQuotient{
   public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("numerator: ");
      double nume = sc.nextDouble();
      double deno;
      
      do {
         System.out.print("denominator: ");
         deno = sc.nextDouble();
         
         if (deno == 0) {
            System.out.print("Error");
            deno = sc.nextDouble();
         }
         
         
      } while (deno == 0);
      
      double result = nume / deno;
      System.out.println("result: " + result);
      
      sc.close();
   }
}