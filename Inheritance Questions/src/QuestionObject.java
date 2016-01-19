 import java.util.ArrayList;
public class QuestionObject
	{
		private String Question;
		private String Answer;
		static ArrayList<QuestionObject>Quizzer=new ArrayList<QuestionObject>();
		public QuestionObject(String Q,String A)
			{
				Question=Q;
				Answer=A;
			}
		public static void Questions()
			{
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
				Quizzer.add(new QuestionObject("",""));
			}
		public String getQuestion()
			{
				return Question;
			}
		public void setQuestion(String question)
			{
				Question = question;
			}
		public String getAnswer()
			{
				return Answer;
			}
		public void setAnswer(String answer)
			{
				Answer = answer;
			}
		public static ArrayList<QuestionObject> getQuizzer()
			{
				return Quizzer;
			}
		public static void setQuizzer(ArrayList<QuestionObject> quizzer)
			{
				Quizzer = quizzer;
			}
		
	}
