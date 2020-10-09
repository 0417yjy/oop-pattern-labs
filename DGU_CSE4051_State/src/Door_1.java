import java.util.Observable;

public class Door_1 extends Observable {
	private State state;

	public String status() {
		if(state instanceof StateOpening) {
			return "Opening";
		}
		else if(state instanceof StateOpen) {
			return "Open";
		}
		else if(state instanceof StateClosing) {
			return "Closing";
		}
		else if(state instanceof StateStayOpen) {
			return "StayOpen";
		}
		else if(state instanceof StateClosed) {
			return "Closed";
		}
		return null;
	}

	public void click() {
		state.click(this);
	}
	
	public void complete() {
		state.complete(this);
	}
	
	public void timeout() {
		state.timeout(this);
	}

	@SuppressWarnings("deprecation")
	public void setState(State state) {
		this.state = state;
		setChanged();
		notifyObservers();
	}
}
