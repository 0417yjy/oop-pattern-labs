package Customer;

public class MedVolCustomer extends Customer {
	public MedVolCustomer(String name) {
		super(name);
	}

	private boolean wouldBeRemoved = false;

	@Override
	public Customer clone() {
		MedVolCustomer clone = new MedVolCustomer(this.name);
		clone.cost = this.cost;
		return clone;
	}

	@Override
	public double computeDeductedValue() {
		if(cost < 30) {
			wouldBeRemoved = true;
		}
		return cost;
	}
	
	public boolean getWouldBeRemoved() {
		return wouldBeRemoved;
	}

}
