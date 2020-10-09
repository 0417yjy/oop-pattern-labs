public class Adventure { // Originator
	StateSnapshot state;
	
	public static class Memento { // has Memento class as inner class
		private StateSnapshot state;
		
		public Memento(StateSnapshot state) {
			this.state = state;
		}
		
		public void setState(StateSnapshot state) {
			this.state = state;
		}
		
		public StateSnapshot getState() {
			return state;
		}
	}
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void setMemento(Memento memento) {
		this.state = memento.getState();
	}
}