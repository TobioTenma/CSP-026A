public class DriverExam
{
       
// this should be static since it can be shared between all instances of the test
private static String[] correctAnswers = 
                                 {"B", "D", "A", "A", "C", "A", 
                                  "B", "A", "C", "D", 
                                  "B", "C", "D", "A", 
                                  "D", "C", "C", "B", "D", "A"};

// lets leave initializing to the constructor, and 
// let's store the values so we only calculate them once
// Also, make sure they are private to restrict access
private boolean[] missed;
private int correct;
private int incorrect;
private String[] userAnswers; 

//Process the user's answers
public DriverExam (String[] answers)
{
    missed = new boolean[answers.length];
    userAnswers = new String[answers.length];
    correct = 0;
    incorrect = 0; 

    for (int i = 0; i < answers.length; i++)
    {
        userAnswers[i] = answers[i]; 
        missed[i] = userAnswers[i].equalsIgnoreCase(correctAnswers[i]);
        if (!missed[i]) {
            correct++;
        } else {
            incorrect++;
        }
    }
}

//Returns a boolean value if correct answers > 15 
   public boolean passed()
   {
    return correct >= 15; // don't use if/else when you are using a boolean expression
   }

/*
 * Let's use the values we calculated to make the methods 
 * very simple and easy to read. In addition, we only calculate things once
 * which makes our code more efficient
 */

   public int totalCorrect()
   {
    return correct;
   }

   public int totalIncorrect()
   {
    return incorrect;
   }

   public boolean[] questionsMissed()
   {
    return missed;
   }
}

