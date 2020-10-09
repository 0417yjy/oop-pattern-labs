package state;

import answerable.PlainString;
import wpg.WPG;

public class StateMainMenu extends WPGState {
	private static StateMainMenu singleton = new StateMainMenu();

	@Override
	public boolean run(WPG w) {
		// show menu
		renderer.showString("****** 메인 메뉴 ******");
		int select = renderer.promptInt(
				new PlainString("메뉴를 선택하세요. \n1. 학생 정보 입력\n2. 문제 매개변수 설정\n3. 문제풀기\n4. 점수 보기\n5. 프로그램 종료\n명령어 입력: "));
		renderer.showString("********************");
		
		// switch by user input selection
		switch (select) {
		case 1:
			changeState(w, StateInsertInfoForStudent.getInstance());
			return true;
		case 2:
			changeState(w, StateSetQuestions.getInstance());
			return true;
		case 3:
			changeState(w, StateSolveQuestions.getInstance());
			return true;
		case 4:
			changeState(w, StateShowGrade.getInstance());
			return true;
		case 5:
			renderer.showString("프로그램을 종료합니다...");
			return false;
		default:
			return this.invalidInput();
		}
	}

	public static WPGState getInstance() {
		return singleton;
	}

	private StateMainMenu() {

	}
}
