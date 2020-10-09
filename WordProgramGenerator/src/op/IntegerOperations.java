package op;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntegerOperations implements BinaryOperations<Integer, Double> {

	@Override
	public Integer add(Integer op1, Integer op2) {
		return op1 + op2;
	}

	@Override
	public Integer subtract(Integer op1, Integer op2) {
		return op1 - op2;
	}

	@Override
	public Integer multiply(Integer op1, Integer op2) {
		return op1 * op2;
	}

	@Override
	public Double divide(Integer op1, Integer op2) {
		// calculate and make precision of calculated value into 2
		return BigDecimal.valueOf(new Double(op1.doubleValue() / op2.doubleValue())).setScale(2, RoundingMode.HALF_UP)
				.doubleValue();
	}

	@Override
	public boolean isBigger(Integer op1, Integer op2) {
		return op1 > op2;
	}

}
