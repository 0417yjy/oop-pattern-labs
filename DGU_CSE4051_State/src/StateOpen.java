
public class StateOpen extends State {

	@Override
	public void click(Door_1 d) {
		// do operation
		d.setState(new StateStayOpen());
	}
	
	@Override
	public void timeout(Door_1 d) {
		// do operation
		d.setState(new StateClosing());
	}
}
