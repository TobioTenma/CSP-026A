import java.util.Scanner;
import java.util.Arrays;

public class GetAnswers
{

     public static void main(String[] args)
     {
      // accept keyboard input
       Scanner scanner = new Scanner(System.in);
       
       //Defines variable for user input
       char user;
       //Defines variable to keep up with current questions
       int current = 1;


      System.out.println("Answer the questions.");

      char[] answers = new char[20];

      //Loop so that questions can be asked.
      for(int i = 0; i < 20; i++)
      {

            do
            {
                 //Informas user what happens if they enter an invalid input.
                  System.out.println("If you see the same number you entered an invalid input");
                  
                  //The current question number.
                   System.out.print(current + ". ");

                  /**
                  .toUpperCase makes the input into an upper case
                  Gets input from user
                  **/
                  user = Character.toUpperCase(scanner.next().charAt(0));
            }
            while(user < 'A' || user >'D');

            //Keeps answer from user into an array
            answers[i] = user;
            
            //Adds so the 
            current ++;
      }

      //Get's information from other program.
      DriverExam student = new DriverExam(answers) {};
     //Checks if student passed.
      if (student.passed())
      {
     System.out.println("You passed. Congratulations!");
      } 
      else 
      { 
     System.out.println("You failed. Do better next time.");
      }
      System.out.println("");
      System.out.println("Correct: " + student.totalCorrect());
      System.out.println("");
      System.out.println("Incorrect: " + student.totalIncorrect());
      System.out.println("");
      System.out.println(Arrays.toString(student.questionsMissed()));

  }
}
