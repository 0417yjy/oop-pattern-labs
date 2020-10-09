import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
	
	interface PrintString {
		void operation(String s);
	}

	public static void main(String[] args) {
		UnaryOperator<Double> makePercent = (Double num)->num*100; // first handler
		Function<Double, String> percentToString = (Double num)->{return num.toString() + "%";}; // second handler
		
		Function<Double, String> chain = makePercent.andThen(percentToString); // chain it with andThen method
		
		System.out.println(chain.apply(0.9395)); // call chained method
	}

}
