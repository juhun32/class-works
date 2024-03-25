package work;

/* Requirements Analysis (English Description)
Create a modular program that allows a user to
find the quotient of two numbers.  The program should
ask the user for numerator.  Then the program should
ask the user for the denominator.  If the user enters 0
for the denominator, they should be given an error message
and asked to enter the denominator again.  The program should
keep asking the user for the denominator as long as they keep
entering 0.  Once the user enters a value other than 0 for 
the denominator, the program will calculate the quotient
and print the numerator,denominator, and quotient to the screen.  
This program shouldallow decimal values for numerator, denominator, 
and quotient.This method should be built using the following modules/methods:

getNumerator

getDenominator: should check if denominator is not equal to 0

calculateQuotient

print: numerator, denominator, quotient */

import java.util.Scanner;

public class DivisionProgram {
   public static Scanner sc = new Scanner(System.in);
   
   public static void main(String [] args) {
      double numerator = getNum();
      double denominator = getDenominator();
      double result = calculateQuotient(numerator, denominator);
      printNumber(result, numerator, denominator);
   }    
      
   public static double getNum() {
      System.out.print("enter a number: ");
      double num = sc.nextDouble();
      return num;
   }
   
   public static double getDenominator() {
      while (true) {
         double denominator = getNum();
         if (denominator == 0) {
            System.out.println("error, enter number again");
         } else {
            return denominator;
         }
      }
      
   }
   
   public static double calculateQuotient(double num1, double num2) {
      return num1/num2;
   }
   
   public static void printNumber(double result, double numerator, double denominator) {
      System.out.println("numerator: " + numerator);
      System.out.println("denominator: " + denominator);
      System.out.println("result: " + result);
   }
}