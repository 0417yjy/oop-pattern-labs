package question;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import op.BinaryOperations;
import op.IntegerOperations;
import op.OperationType;
import wpg.Student;

public class QuestionFactory {

	public static <OperandType> Question<?> createQuestion(QuestionType qt, OperationType ot, Student s,
			OperandType minOperand, OperandType maxOperand) {

		switch (qt) {
		case INTEGER:
			return IntegerQuestionFactory.createConcreteQuestion(ot, s, (Integer) minOperand,
					(Integer) maxOperand);
			
		default:
			break;

		}

		return null;

	}

	private static class IntegerQuestionFactory {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static <AnswerType>Question<AnswerType> createConcreteQuestion(OperationType ot, Student s, Integer minOperand,
				Integer maxOperand) {
			BinaryOperations<Integer, Double> operations = new IntegerOperations();
			int op1 = ThreadLocalRandom.current().nextInt(maxOperand - minOperand) + minOperand;
			int op2 = ThreadLocalRandom.current().nextInt(maxOperand - minOperand) + minOperand;

			switch (ot) {
			case ADD:
				return new AddQuestion(s, op1, op2, operations);
			case DIVIDE:
				return new DivideQuestion(s, op1, op2, operations);
			case MULTIPLY:
				return new MultiplyQuestion(s, op1, op2, operations);
			case SUBTRACT:
				// if the op2 is bigger than op1, swap it
				if(op2 > op1) {
					int tmp = op1;
					op1 = op2;
					op2 = tmp;
				}
				return new SubtractQuestion(s, op1, op2, operations);
			default:
				break;
			}
			return null;
		}
	}

}
