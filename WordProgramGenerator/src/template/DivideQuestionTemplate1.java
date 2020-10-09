package template;

public class DivideQuestionTemplate1 extends BinaryQuestionTemplate {
	private String favoredObject;

	public DivideQuestionTemplate1(String name, String favoredObject) {
		super(name);
		this.name = name;
		this.favoredObject = favoredObject;
	}

	@Override
	public String assemble() {
		return name + "은(는) " + favoredObject + "을(를) " + op1 + "개 가지고 있습니다. 그/그녀는 " + op2 + "명의 친구에게 똑같이 나누어 주고 싶습니다. 각각 " + favoredObject
				+ "을(를) 몇 개씩 가지게 되나요?";
	}

}
