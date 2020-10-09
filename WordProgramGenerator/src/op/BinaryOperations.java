package op;

public interface BinaryOperations<T, T2> {
	public T add(T op1, T op2);
	public T subtract(T op1, T op2);
	public T multiply(T op1, T op2);
	public T2 divide(T op1, T op2);
	public boolean isBigger(T op1, T op2);
}
