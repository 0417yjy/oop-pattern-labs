import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		System.out.println("Proxy implementation using java.lang.reflect.Proxy");
		
		RealSubject rs = new RealSubject(); // real subject
		MyHandler m = new MyHandler(rs); // invocation handler
		MyMethods proxy = (MyMethods) Proxy.newProxyInstance(MyMethods.class.getClassLoader(), new Class[] {MyMethods.class}, m); // generate proxy
		
		System.out.println("Doing Something with real subject:");
		rs.doSomething();
		
		System.out.println("\nDoing Something with Proxy:");
		proxy.doSomething();
	}

}
