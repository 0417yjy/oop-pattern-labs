
public class State {

	public void click(Door_1 d) {}
	public void complete(Door_1 d) {}
	public void timeout(Door_1 d) {}
	protected void setState(Door_1 d, State s) {
		d.setState(s);
	}
}
