// 2015112135 À±Á¾¿¬
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class DogWatcher implements Observer {
	private String observerName;
	private ObservableDogBot dogUpdate; 
	
	public DogWatcher(String name) {
		observerName = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		dogUpdate = (ObservableDogBot) o;
		System.out.println(observerName + ": " + dogUpdate.getName() + " " + arg);
	}

}
