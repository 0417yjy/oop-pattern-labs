package renderer;

import java.util.ArrayList;
import java.util.Scanner;

import answerable.Answerable;

public class CommandLineInterfaceRenderer implements Renderable {
	private Scanner s = new Scanner(System.in);

	@Override
	public int promptInt(Answerable prompt) {
		if (prompt != null)
			System.out.println(prompt.getString());
		return s.nextInt();
	}

	@Override
	public double promptDouble(Answerable prompt) {
		if (prompt != null)
			System.out.println(prompt.getString());
		return s.nextDouble();
	}

	@Override
	public char promptChar(Answerable prompt) {
		if (prompt != null)
			System.out.println(prompt.getString());
		return s.next().charAt(0);
	}

	@Override
	public String promptString(Answerable prompt) {
		if (prompt != null)
			System.out.println(prompt.getString());
		return s.next();
	}
	
	public String promptString(String pre, Answerable prompt) {
		System.out.print(pre);
		if (prompt != null)
			System.out.println(prompt.getString());
		return s.next();
	}

	@Override
	public void showString(String str) {
		System.out.println(str);
	}

	@Override
	public ArrayList<String> getArray(Answerable prompt, String breakCmd) {
		int i = 0;
		ArrayList<String> resList = new ArrayList<String>();
		System.out.println(prompt.getString());
		String input = promptString(null);
		while(!input.equals(breakCmd)) {
			resList.add(input);
			input = promptString(null);
		}
		return resList;
	}

	@Override
	public boolean promptYesOrNo(Answerable prompt) {
		char input = promptChar(prompt);
		if(Character.toLowerCase(input) == 'y') {
			return true;
		} else {
			return false;
		}
	}
	
	

}
