package question;
import op.BinaryOperations;
import wpg.Student;

public class MultiplyQuestion<OperandType, AnswerType> extends BinaryQuestion<OperandType, AnswerType> {

	public MultiplyQuestion(Student s, OperandType op1, OperandType op2, BinaryOperations<OperandType, AnswerType> calculator) {
		super(s, op1, op2, calculator);
	}

	@Override
	public boolean isCorrect(String answer) {
		if(answer.equals(calculator.multiply(op1, op2).toString())) {
			return true;
		} else {
			return false;
		}
	}

}
