package state;

import answerable.PlainString;
import renderer.CommandLineInterfaceRenderer;
import renderer.Renderable;
import wpg.WPG;

public abstract class WPGState {
	protected static Renderable renderer = new CommandLineInterfaceRenderer(); // make renderer object

	public abstract boolean run(WPG w);

	protected void changeState(WPG w, WPGState state) {
		w.setState(state);
	}

	protected boolean invalidInput() {
		return renderer.promptYesOrNo(new PlainString("잘못된 입력 감지! 프로그램을 계속하시겠습니까? (y/n)"));
	}
	
	protected void wouldGoMainMenu(WPG w) {
		if(renderer.promptYesOrNo(new PlainString("메인 메뉴로 돌아갑니까? (y/n)"))) {
			changeState(w, StateMainMenu.getInstance());
		}
	}
	
	
}
