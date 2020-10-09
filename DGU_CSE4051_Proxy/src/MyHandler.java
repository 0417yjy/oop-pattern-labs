import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	private final MyMethods src;
	
	public MyHandler(MyMethods src) {
		this.src = src;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.print("Proxy is: ");
		method.invoke(src, args);
		System.out.println("Done");
		return null;
	}

}
