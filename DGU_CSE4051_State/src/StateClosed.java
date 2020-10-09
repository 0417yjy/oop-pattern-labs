
public class StateClosed extends State {
	
	@Override
	public void click(Door_1 d) {
		// do operation
		d.setState(new StateOpening());
	}
}
