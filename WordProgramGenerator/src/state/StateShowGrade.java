package state;

import question.Question;
import wpg.WPG;

public class StateShowGrade extends WPGState {
	private static StateShowGrade singleton = new StateShowGrade();

	@Override
	public boolean run(WPG w) {
		if(w.IsQuestionsAreMade()) {
			if(w.getScore() >= 0) {
				renderer.showString(w.getStudent().getName() + "의 문제풀이 성적: " + w.getScore() + '/' + w.questionsAmount());
				renderer.showString("100점 만점 기준으로 " + (((double) w.getScore() / (double) w.questionsAmount()) * 100) + "점 입니다.");
			}
			else {
				renderer.showString(w.getStudent().getName() + "은/는 아직 문제를 풀지 않았습니다!");
			}
		} else {
			renderer.showString("아직 " + w.getStudent().getName() + "을/를 위한 문제를 만들지 않았습니다!");
		}
		
		
		renderer.showString("메인 메뉴로 돌아갑니다..");
		this.changeState(w, StateMainMenu.getInstance());
		return true;
	}
	
	public static WPGState getInstance() {
		return singleton;
	}

	private StateShowGrade() {

	}

}
