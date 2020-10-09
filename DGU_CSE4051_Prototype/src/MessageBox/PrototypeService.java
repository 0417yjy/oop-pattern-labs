package MessageBox;
import java.util.HashMap;

public class PrototypeService {
	private HashMap<String, Product> map;
	
	public void register(Product p) {
		String key = p.getClass().getSimpleName();
		map.put(key,  p);
	}
	
	public Product create(String class_name) {
		return map.get(class_name).createClone();
	}
}
