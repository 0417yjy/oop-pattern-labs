package template;

public abstract class QuestionTemplate {
	protected String name;
	protected boolean stringComplete = false;
	
	public QuestionTemplate(String name) {
		this.name = name;
	}
	
	public abstract String assemble();
	public boolean isStringComplete() {
		return stringComplete;
	}
}
