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
  int size = 20 - totalCorrect();

  int[] missed = {};
  if (size < 1)
  return missed;
  else
  missed = new int [size];

  int pos = 0;
  for (int i = 0; i < 20; i++)
  {
   if (correctAnswers [i] != userAnswers[i])
   {
    missed[pos] = (i + 1);
    pos = pos + 1;
   }
  }
  return missed;
}

