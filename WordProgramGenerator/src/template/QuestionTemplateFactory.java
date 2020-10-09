package template;
import java.util.Random;

import question.AddQuestion;
import question.DivideQuestion;
import question.MultiplyQuestion;
import question.Question;
import question.SubtractQuestion;
import wpg.Student;

public class QuestionTemplateFactory {
	private static Random generator = new Random();
	private final int knownTemplates[] = { 1, 1, 1, 1 }; // Each means # of Add, Subtract, Multiply, Divide operation's
															// templates

	public static QuestionTemplate createQuestionTemplate(@SuppressWarnings("rawtypes") Question q, Student s) {
		int personIdx = generator.nextInt(s.getPeopleSize());
		int objectIdx = generator.nextInt(s.getObjectsSize());
		
		if (q instanceof AddQuestion) {	
			return new AddQuestionTemplate1(s.getName(), s.getFavoredObject(objectIdx), s.getFavoredPerson(personIdx));
		} else if (q instanceof SubtractQuestion) {
			return new SubtractQuestionTemplate1(s.getName(), s.getFavoredObject(objectIdx), s.getFavoredPerson(personIdx));
		} else if (q instanceof MultiplyQuestion) {
			return new MultiplyQuestionTemplate1(s.getName(), s.getFavoredObject(objectIdx), s.getFavoredPerson(personIdx));
		} else if (q instanceof DivideQuestion) {
			return new DivideQuestionTemplate1(s.getName(), s.getFavoredObject(objectIdx));
		}
		
		return null;
	}
}
