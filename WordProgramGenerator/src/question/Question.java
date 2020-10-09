package question;
import answerable.AnswerableWithImage;
import template.QuestionTemplate;

public abstract class Question<AnswerType> implements AnswerableWithImage {
	protected String questionString;
	private String imageFilePath;
	protected QuestionTemplate questionTemplate;

	@Override
	public String getString() {
		return questionTemplate.assemble();
	}
	
	public void setImageFilePath(String s) {
		this.imageFilePath = s;
	}
	
	public boolean isQuestionStringReady() {
		
		return questionTemplate.isStringComplete();
	}
	
	public abstract boolean isCorrect(String answer);
}
