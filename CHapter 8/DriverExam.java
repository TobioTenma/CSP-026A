public class DriverExam
{
       
	// String array of the correct answers
	private  static char[] correctAnswers = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
                        'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A' };
                        
	// String array for the user's answers
	private  static char[] userAnswers = new char[20];
	
	// int for correct answers
	private static int correct;
	
	// Constructor
	public DriverExam(char[] userAnswers) 
	{
		this.userAnswers = userAnswers;
	}
	
	public static boolean passed() 
	{
		for(int count = 0; count < correctAnswers.length; count++)
		{
			if ((correctAnswers[count])==userAnswers[count])
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
	//Get's total correct
	public static int totalCorrect() 
	{
		return correct;
	}
	//Get's total incorrect
	public static int totalIncorrect() 
	{
		return 20 - correct;
	}
	//Get's the missed questions
	public static int[] questionsMissed()
 {

  int errors = 20 - totalCorrect();

  int[] missed = {};
  if (errors < 1)
  return missed;
  else
  missed = new int [errors];

  int x = 0;
  for (int i = 0; i < 20; i++)
  {
   if (correctAnswers [i] != userAnswers[i])
   {
    missed[x] = (i + 1);
    x = x + 1;
   }
  }
  return missed;

 }
}
