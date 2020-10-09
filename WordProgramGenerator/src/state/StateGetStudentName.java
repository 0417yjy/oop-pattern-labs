package state;

import java.util.ArrayList;

import answerable.PlainString;
import wpg.Student;
import wpg.WPG;

public class StateGetStudentName extends WPGState {
	private static StateGetStudentName singleton = new StateGetStudentName();

	@Override
	public boolean run(WPG w) {
		// set student's name
		String studentName = renderer.promptString(new PlainString("학생의 이름을 입력하세요: "));
		Student.StudentBuilder builder = new Student.StudentBuilder(studentName);

		// set favored people
		builder.addFavoredPeople(getFavoredPeople());

		// set favored objects
		builder.addFavoredObjects(getFavoredObjects());
		
		// assemble student and set it
		w.setStudent(builder.build());
		
		// print a message and go to main menu
		renderer.showString("설정을 마쳤습니다!\n메인 메뉴에 들어갑니다..");
		this.changeState(w,  StateMainMenu.getInstance());
		return true;
	}

	public static WPGState getInstance() {
		return singleton;
	}
	
	public static ArrayList<String> getFavoredPeople() {
		return renderer.getArray(new PlainString("학생에게 중요한 사람들을 입력하세요. 'q'를 입력하면 종료합니다."), "q");
	}
	
	public static ArrayList<String> getFavoredObjects() {
		return renderer.getArray(new PlainString("학생이 관심을 갖고 있는 항목들을 입력하세요. 'q'를 입력하면 종료합니다."), "q");
	}

	private StateGetStudentName() {

	}
}
