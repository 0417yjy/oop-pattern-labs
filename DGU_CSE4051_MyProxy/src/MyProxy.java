
public class MyProxy implements MyMethods{
	private MyMethods src;
	
	MyProxy() {
		src = null;
	}
	
	MyProxy(RealSubject src) {
		this.src = (MyMethods) src;
	}
	
	public void setSubject(RealSubject src) {
		this.src = src;
	}

	@Override
	public void doSomething() {
		if(src != null) {
			System.out.print("Proxy is: ");
			src.doSomething();
			System.out.println("Done");
		}
		else {
			System.out.println("RealSubject is not set yet!");
		}
	}
}
