public class Main {
	public static void main(String[] args) {
		System.out.println("My proxy implementation");
		
		MyMethods worker = new RealSubject(); // working with real subject
		
		System.out.println("Doing Something with real subject:");
		worker.doSomething();
		
		worker = new MyProxy((RealSubject) worker); // working with proxy
		
		System.out.println("\nDoing Something with Proxy: ");
		worker.doSomething();
	}
}
