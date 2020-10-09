
public class StateStayOpen extends State {

	@Override
	public void click(Door_1 d) {
		// do operation
		d.setState(new StateClosing());
	}
	
	private Firework getRecommended() {
		return getAdvisor().recommend();
	}
}