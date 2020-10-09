package template;

public abstract class BinaryQuestionTemplate extends QuestionTemplate {
	protected String op1 = "Operand 1";
	protected String op2 = "Operand 2";
	
	@Override
	public abstract String assemble();
	
	public BinaryQuestionTemplate(String name) {
		super(name);
	}

	public <OperandType> void replaceOperands(OperandType op1, OperandType op2) {
		this.op1 = op1.toString();
		this.op2 = op2.toString();
		this.stringComplete = true;
	}
}
