
public class StateOpening extends State {

	@Override
	public void click(Door_1 d) {
		// do operation
		d.setState(new StateClosing());
	}
	
	@Override
	public void complete(Door_1 d) {
		// do operation
		d.setState(new StateOpen());
	}
}
