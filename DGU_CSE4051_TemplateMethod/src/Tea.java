
public class Tea extends CaffeineBeverage {

	@Override
	public void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	public void addLemon() {
		System.out.println("Adding Lemon");
	}

	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}

	
}
