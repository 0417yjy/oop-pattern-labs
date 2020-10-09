package template;

public class AddQuestionTemplate1 extends BinaryQuestionTemplate {
	private String favoredObject;
	private String favoredPerson;


	public AddQuestionTemplate1(String name, String favoredObject, String favoredPerson) {
		super(name);
		this.name = name;
		this.favoredObject = favoredObject;
		this.favoredPerson = favoredPerson;
	}

	@Override
	public String assemble() {
		return name + "은(는) " + favoredObject + "을(를) " + op1 + "개 가지고 있습니다. " + favoredPerson + "은(는) " + favoredObject
				+ "을(를) " + op2 + "개 가지고 있습니다. 그들이 가지고 있는 " + favoredObject + "은(는) 모두 몇 개입니까?";
	}

}
