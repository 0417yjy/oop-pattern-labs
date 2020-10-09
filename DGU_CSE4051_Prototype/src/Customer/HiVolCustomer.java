package Customer;

public class HiVolCustomer extends Customer {

	public HiVolCustomer(String name) {
		super(name);
	}

	@Override
	public Customer clone() {
		HiVolCustomer clone = new HiVolCustomer(this.name);
		clone.cost = this.cost;
		return clone;
	}

	@Override
	public double computeDeductedValue() {
		double res = cost;
		if(cost > 2000) {
			res *= 0.95; // if cost exceeds $2000, it gets extra 5% discount 
		}
		else if(cost < 50) {
			res *= 1.05; // if cost doesn't reach $50, it gets extra 5% cost
		}
		return res;
	}

}
