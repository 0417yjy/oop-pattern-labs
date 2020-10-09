package Customer;

public class LoVolCustomer extends Customer {

	public LoVolCustomer(String name) {
		super(name);
	}

	@Override
	public Customer clone() {
		LoVolCustomer clone = new LoVolCustomer(this.name);
		clone.cost = this.cost;
		return clone;
	}

	@Override
	public double computeDeductedValue() {
		return cost + 10;
	}

}
