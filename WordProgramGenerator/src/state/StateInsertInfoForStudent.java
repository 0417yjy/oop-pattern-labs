package state;

import answerable.PlainString;
import wpg.WPG;

public class StateInsertInfoForStudent extends WPGState {
	private static StateInsertInfoForStudent singleton = new StateInsertInfoForStudent();

	@Override
	public boolean run(WPG w) {
		// show submenu
		renderer.showString("**** 학생 정보 입력 ****");
		int select = renderer.promptInt(
				new PlainString("메뉴를 선택하세요. \n1. 새 학생으로 덮어쓰기\n2. 중요한 사람 추가\n3. 관심있는 항목 추가\n4. 메인 메뉴로 돌아가기\n명령어 입력: "));
		renderer.showString("********************");

		// switch by user input selection
		switch (select) {
		case 1:
			changeState(w, StateInsertInfoForStudent.getInstance());
			renderer.showString("새 학생으로 덮어씁니다...");
			return true;
		case 2:
			// add favored people
			w.getStudent().addFavoredPeople(StateGetStudentName.getFavoredPeople());
			renderer.showString("추가 동작을 마쳤습니다. ");
			// ask if user wants to go to the main menu
			this.wouldGoMainMenu(w);
			return true;
		case 3:
			// add favored objects
			w.getStudent().addFavoredPeople(StateGetStudentName.getFavoredObjects());
			renderer.showString("추가 동작을 마쳤습니다. ");
			// ask if user wants to go to the main menu
			this.wouldGoMainMenu(w);
			return true;
		case 4:
			// go back to main menu
			changeState(w, StateMainMenu.getInstance());
			renderer.showString("메인 메뉴로 돌아갑니다...");
			return true;
		default:
			return this.invalidInput();
		}
	}

	public static WPGState getInstance() {
		return singleton;
	}

	private StateInsertInfoForStudent() {

	}
}
