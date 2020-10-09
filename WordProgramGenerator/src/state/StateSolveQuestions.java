package state;

import answerable.PlainString;
import question.Question;
import wpg.WPG;

public class StateSolveQuestions extends WPGState {
	private static StateSolveQuestions singleton = new StateSolveQuestions();

	@Override
	public boolean run(WPG w) {
		if(w.IsQuestionsAreMade()) {
			int score = 0;
			
			// start solving problems
			renderer.showString("문제를 풉니다. 총 " + w.questionsAmount() + "개의 문제가 있습니다.");
			for(int i=0;i<w.questionsAmount();i++) {
				Question currentQuestion = w.getQuestion(i);
				// TODO 문제가 안 나옴
				// get user's answer and verify it's correct
				if(currentQuestion.isQuestionStringReady()) {
					if(currentQuestion.isCorrect(renderer.promptString(Integer.toString(i + 1) + ". " , currentQuestion))) {
						renderer.showString("정답입니다!");
						score++;
					} else {
						renderer.showString("오답입니다!");
					}
				}
				else {
					renderer.showString("오류! 문제가 만들어지지 않았습니다.");
				}
			}
			
			// save the score
			w.setScore(score);
			
			if(renderer.promptYesOrNo(new PlainString("문제풀이를 마쳤습니다!\n성적을 보겠습니까? (y/n)"))) {
				this.changeState(w,  StateShowGrade.getInstance());
			} else {
				this.changeState(w, StateMainMenu.getInstance());				
			}
			return true;
		} else {
			// questions aren't made yet
			
			// go back to main menu
			renderer.showString("문제가 아직 만들어지지 않았습니다!\n메인 메뉴로 돌아갑니다..");
			this.changeState(w, StateMainMenu.getInstance());
			return true;
		}
	}
	
	public static WPGState getInstance() {
		return singleton;
	}

	private StateSolveQuestions() {

	}

}
