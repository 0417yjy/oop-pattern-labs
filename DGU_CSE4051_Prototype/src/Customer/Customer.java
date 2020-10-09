package Customer;

public abstract class Customer {
	protected double cost = 0;
	protected String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public abstract Customer clone();
	public abstract double computeDeductedValue();
}
