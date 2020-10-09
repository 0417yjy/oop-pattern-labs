package renderer;

import java.util.ArrayList;

import answerable.Answerable;

public interface Renderable {
	public int promptInt(Answerable prompt);
	public double promptDouble(Answerable prompt);
	public char promptChar(Answerable prompt);
	public String promptString(Answerable prompt);
	public String promptString(String pre, Answerable prompt);
	public void showString(String str);
	public ArrayList<String> getArray(Answerable prompt, String breakCmd);
	public boolean promptYesOrNo(Answerable prompt);
}