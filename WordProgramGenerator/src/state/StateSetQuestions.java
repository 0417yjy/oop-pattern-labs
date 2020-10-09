package state;

import java.util.ArrayList;

import answerable.PlainString;
import op.OperationType;
import question.QuestionType;
import wpg.WPG;

public class StateSetQuestions extends WPGState {
	private static StateSetQuestions singleton = new StateSetQuestions();

	private static int[] eachOperationsNum = new int[WPG.OPERATION_TYPES];
	private int qNum;
	private int minOperand;
	private int maxOperand;

	@Override
	public boolean run(WPG w) {
		// initialize operation number array
		initialize();

		// set operations
		ArrayList<String> opList = renderer.getArray(new PlainString("연산의 종류를 입력하세요. 입력을 멈추려면 q를 입력합니다."), "q");
		for (int i = 0; i < opList.size(); i++) {
			switch (opList.get(i)) {
			case "+":
			case "더하기":
			case "Add":
			case "Addition":
				renderer.showString("더하기 연산 추가");
				eachOperationsNum[OperationType.ADD.ordinal()]++;
				break;
			case "-":
			case "빼기":
			case "Subtract":
			case "Subtraction":
				renderer.showString("빼기 연산 추가");
				eachOperationsNum[OperationType.SUBTRACT.ordinal()]++;
				break;
			case "*":
			case "곱하기":
			case "Multiply":
			case "Multiplication":
				renderer.showString("곱하기 연산 추가");
				eachOperationsNum[OperationType.MULTIPLY.ordinal()]++;
				break;
			case "/":
			case "나누기":
			case "Divide":
			case "Division":
				renderer.showString("나누기 연산 추가");
				eachOperationsNum[OperationType.DIVIDE.ordinal()]++;
				break;
			default:
				renderer.showString("알 수 없는 입력: 연산 추가 실패!");
			}
		}

		// set each question's amount
		qNum = renderer.promptInt(new PlainString("생성할 문제 수를 입력하세요."));

		// set the range of operands
		minOperand = renderer.promptInt(new PlainString("최소 피연산자 값을 입력하세요 (정수)"));
		maxOperand = renderer.promptInt(new PlainString("최대 피연산자 값을 입력하세요 (정수)"));

		// make questions from specification
		for (int i = 0; i < eachOperationsNum.length; i++) {
			for(int j=0;j<eachOperationsNum[i];j++) {
				w.makeQuestions(QuestionType.INTEGER, OperationType.values()[i], qNum, minOperand, maxOperand);				
			}
		}

		// print a message and go to main menu
		renderer.showString("설정을 마쳤습니다!\n메인 메뉴로 돌아갑니다..");
		this.changeState(w, StateMainMenu.getInstance());
		return true;
	}

	private void initialize() {
		for (int i = 0; i < eachOperationsNum.length; i++) {
			eachOperationsNum[i] = 0;
		}
		qNum = 0;
		maxOperand = 0;
		minOperand = 0;
	}

	public static WPGState getInstance() {
		return singleton;
	}

	private StateSetQuestions() {

	}
}
