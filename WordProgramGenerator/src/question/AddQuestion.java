package question;
import op.BinaryOperations;
import wpg.Student;

public class AddQuestion<OperandType, AnswerType> extends BinaryQuestion<OperandType, AnswerType> {

	public AddQuestion(Student s, OperandType op1, OperandType op2, BinaryOperations<OperandType, OperandType> calculator) {
		super(s, op1, op2, calculator);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean isCorrect(String answer) {
		if(answer.equals(calculator.add(op1, op2).toString())) {
			return true;
		} else {
			return false;
		}
	}

}
