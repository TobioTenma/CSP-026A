public class DriverExam
{
       
	// String array of the correct answers
	private static String[] correctAnswers = 
	                                 {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", 
	                                  "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
	
	// String array for the user's answers
	private static String[] userAnswers = new String[20];
	
	// int for correct answers
	private static int correct;
	
	// Constructor
	public DriverExam(String[] userAnswers) 
	{
		this.userAnswers = userAnswers;
	}
	
	public static boolean passed() 
	{
		for(int count = 0; count < correctAnswers.length; count++)
		{
			if (correctAnswers[count].equals(userAnswers[count])) 
			{
				correct ++;
			}
		}
		
		//the student has to get at least 15 correct
		if (correct >= 15) 
		{
			return true;
		}
		return false;
	}
	
	public static int totalCorrect() 
	{
		return correct;
	}
	
	public static int totalIncorrect() 
	{
		return 20 - correct;
	}
	
	public static int[] questionsMissed()
	{


 	 for (int i = 0; i < 20; i++)
 		 {
  	 if (correctAnswers[i] != userAnswers[i])//comapres answers
   		{
        int[i] missed = {};//initlizeses missed and grabs the number it is comparing it to.
  	if (missed < 1)//if it's not the right answer it will be considered a missed
	return missed;	//return the number that it missed.
   		}
 		 }	
	}
}

