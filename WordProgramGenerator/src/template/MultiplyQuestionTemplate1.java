package template;

public class MultiplyQuestionTemplate1 extends BinaryQuestionTemplate {
	private String favoredObject;
	private String favoredPerson;

	public MultiplyQuestionTemplate1(String name, String favoredObject, String favoredPerson) {
		super(name);
		this.name = name;
		this.favoredObject = favoredObject;
		this.favoredPerson = favoredPerson;
	}

	@Override
	public String assemble() {
		return name + "은(는) " + op1 + "개의 " + favoredObject + "을(를) " + op2 + "묶음 가지고 있습니다. " + name + "은(는) 전부 "
				+ favoredObject + "이/가 몇 개입니까?";
	}

}
