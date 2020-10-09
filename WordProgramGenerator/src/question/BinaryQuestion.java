package question;
import op.BinaryOperations;
import template.BinaryQuestionTemplate;
import template.QuestionTemplateFactory;
import wpg.Student;

public abstract class BinaryQuestion<OperandType, AnswerType> extends Question<AnswerType> {
	protected OperandType op1;
	protected OperandType op2;
	protected BinaryOperations calculator;

	public BinaryQuestion(Student s, OperandType op1, OperandType op2, BinaryOperations c) {
		this.op1 = op1;
		this.op2 = op2;
		this.calculator = c;
		
		questionTemplate = QuestionTemplateFactory.createQuestionTemplate(this, s);
		((BinaryQuestionTemplate) questionTemplate).replaceOperands(op1, op2);
	}
}
