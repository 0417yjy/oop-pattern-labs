package wpg;
import java.util.ArrayList;

import op.OperationType;
import question.Question;
import question.QuestionFactory;
import question.QuestionType;
import state.StateGetStudentName;
import state.WPGState;

public class WPG {
	private Student student;
	private ArrayList<Question> questionList;
	private WPGState state;
	private boolean questionsAreMade;
	private int score;
	
	public static final int OPERATION_TYPES = OperationType.values().length;
	
	WPG() {
		questionList = new ArrayList<Question>();
		state = StateGetStudentName.getInstance(); // set initial state
	}
	
	public void run() {
		while(state.run(this)); // loop until run method returns false
	}
	
	public void setState(WPGState state) {
		this.state = state;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		// set to a new student
		this.student = student;
		
		// initialize variables
		questionList.clear();
		questionsAreMade = false;
		score = -1;
	}
	
	public boolean IsQuestionsAreMade() {
		return questionsAreMade;
	}
	
	public <OperandType>void makeQuestions(QuestionType qt, OperationType ot, int amount, OperandType min, OperandType max) {
		for(int i=0;i<amount;i++) {
			questionList.add(QuestionFactory.createQuestion(qt, ot, student, min, max));
		}
		questionsAreMade = true;
	}
	
	public int questionsAmount() {
		return questionList.size();
	}
	
	public Question getQuestion(int idx) {
		return questionList.get(idx);
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
