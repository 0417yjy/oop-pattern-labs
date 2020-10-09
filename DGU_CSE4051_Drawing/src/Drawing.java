// 2015112135 À±Á¾¿¬

import java.util.ArrayList;

public class Drawing extends Shape {
	ArrayList<Shape> components;
	
	Drawing() { 
		components = new ArrayList<Shape>();
	}

	public void add(Shape s) {
		components.add(s);
	}

	public void remove(Shape s) {
		components.remove(s);
	}

	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		components.clear();
	}

	@Override
	public void draw(String color) {
		for (int i = 0; i < components.size(); i++) {
			components.get(i).draw(color);
		}
	}
}
