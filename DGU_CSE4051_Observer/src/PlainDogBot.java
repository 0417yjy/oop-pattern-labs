// 2015112135 À±Á¾¿¬
public class PlainDogBot implements DogBot {
	protected int hungry, tired;
	public String name;

	public PlainDogBot(int h, int t, String name) {
		hungry = h;
		tired = t;
		this.name = name;
	}

	public boolean eat() {
		if (hungry > 6) {
			hungry -= 3;
			return true;
		} else
			return false;
	}

	public void rest() {
		hungry++;
		tired -= 2;
	}

	public void play() {
		hungry += 2;
		tired += 3;
	}

	public String noise() {
		if (hungry > 8 && tired < 11)
			return "whine ";
		else if (tired > 7 && tired > hungry)
			return "snore ";
		else
			return "woof ";
	}
}