
public class StateClosing extends State {

	@Override
	public void click(Door_1 d) {
		// do operation
		d.setState(new StateOpening());
	}
	
	@Override
	public void complete(Door_1 d) {
		// do operation
		d.setState(new StateClosed());
	}
}
