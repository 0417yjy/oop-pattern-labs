package template;

public class SubtractQuestionTemplate1 extends BinaryQuestionTemplate {
	private String favoredObject;
	private String favoredPerson;

	public SubtractQuestionTemplate1(String name, String favoredObject, String favoredPerson) {
		super(name);
		this.name = name;
		this.favoredObject = favoredObject;
		this.favoredPerson = favoredPerson;
	}

	@Override
	public String assemble() {
		return name + "은(는) " + favoredObject + "을(를) " + op1 + "개 가지고 있습니다. " + name + "은(는) " + favoredPerson + "에게 " + favoredObject
				 + op2 + " 개를 주었습니다. " + name + "에게 몇 개의 " + favoredObject + "이/가 남았습니까?";
	}

}
