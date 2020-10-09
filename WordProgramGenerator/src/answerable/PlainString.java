package answerable;

public class PlainString implements Answerable {
	private String content;
	
	public PlainString(String content) {
		this.content = content;
	}

	@Override
	public String getString() {
		return content;
	}

}
