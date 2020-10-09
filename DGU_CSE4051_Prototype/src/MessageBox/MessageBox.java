package MessageBox;
import java.util.Scanner;

public class MessageBox implements Product {
	private char boundChar;
	
	public MessageBox(char c) {
		boundChar = c;
	}
	
	public void setBoundChar(char c) {
		this.boundChar = c;
	}

	@Override
	public void use() {
		Scanner s = new Scanner(System.in);
		System.out.println("Input text: ");
		String input = s.next();
		
		System.out.println(boundChar + input + boundChar);
		
		s.close();
	}

	@Override
	public Product createClone() {
		MessageBox clone = new MessageBox(boundChar);
		return (Product) clone;
	}
	
	

}
