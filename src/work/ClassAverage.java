package work;

/* Requirements Analysis (English Description)

Create a program that allows a user to enter the
first names and the scores of the students who took
a final exam.  The program will ask the user for the
first name of each student and the student that student
received on the final exam.  If the score entered by the
user is not between 0 and 100 then an error message will 
be given to the user.  If the score is between 0 and 100
then that score will be added to the total score for the 
class.  When the user is done entering the scores of the students
they should enter the word "done" for the name of the next student.
After all scores have been entered the class average should be
calculated and displayed to the screen.

Design (Algorithm)


*/

import java.util.Scanner;

public class ClassAverage{
   public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      double resultSum = 0;
      int studentNum = 0;
      
      System.out.print("first name of the student?: ");
      String firstName = sc.nextLine();
      
      while (! firstName.equals("done")) {
         System.out.print("final exam score?: ");
         double score = sc.nextDouble();
         
         if (score >= 0 && score <= 100) {
            resultSum += score;
            studentNum ++;
            
            System.out.print("first name of the student?: ");
            firstName = sc.next();
         }
         else {
            System.out.println("error");
            break;
         }
      }
      double averCalc = resultSum / studentNum;
      System.out.println("class average score: " + averCalc);
      sc.close();
   }
}