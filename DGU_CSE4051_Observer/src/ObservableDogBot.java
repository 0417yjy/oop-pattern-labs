// 2015112135 À±Á¾¿¬
import java.util.Observable;

@SuppressWarnings("deprecation")
public class ObservableDogBot extends Observable implements DogBot {
	DogBot instance;

	public ObservableDogBot(DogBot i) {
		instance = i;
	}
	
	public String getName() {
		PlainDogBot p = (PlainDogBot) instance;
		return p.name;
	}

	@Override
	public boolean eat() {
		boolean res = instance.eat();
		setChanged();
		this.notifyObservers("eats");
		return res;
	}

	@Override
	public void rest() {
		instance.rest();
		setChanged();
		this.notifyObservers("rests");
	}

	@Override
	public void play() {		
		instance.play();
		setChanged();
		this.notifyObservers("plays");
	}

	@Override
	public String noise() {
		String res = instance.noise();
		setChanged();
		this.notifyObservers("noises");
		return res;
	}

}
