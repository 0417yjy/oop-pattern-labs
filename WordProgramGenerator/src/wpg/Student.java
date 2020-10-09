package wpg;
import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<String> favoredPeople;
	private ArrayList<String> favoredObjects;
	
	public static class StudentBuilder {
		private String name;
		private ArrayList<String> favoredPeople;
		private ArrayList<String> favoredObjects;
		
		public StudentBuilder(String name) {
			this.name = name;
			this.favoredPeople = new ArrayList<String>();
			this.favoredObjects = new ArrayList<String>();
		}
		
		public StudentBuilder addFavoredPeople(ArrayList<String> people) {
			favoredPeople.addAll(people);
			return this;
		}
		
		public StudentBuilder addFavoredPerson(String person) {
			favoredPeople.add(person);
			return this;
		}
		
		public StudentBuilder addFavoredObjects(ArrayList<String> objects) {
			favoredObjects.addAll(objects);
			return this;
		}
		
		public StudentBuilder addFavoredObject(String object) {
			favoredObjects.add(object);
			return this;
		}
		
		public Student build() {
			return new Student(name, favoredPeople, favoredObjects);
		}
	}
	
	private Student(String name, ArrayList<String> favoredPeople, ArrayList<String> favoredObjects) {
		this.name = name;
		this.favoredPeople = favoredPeople;
		this.favoredObjects = favoredObjects;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFavoredPerson(int index) {
		return favoredPeople.get(index);
	}
	
	public String getFavoredObject(int index) {
		return favoredObjects.get(index);
	}
	
	public int getPeopleSize() {
		return favoredPeople.size();
	}
	
	public int getObjectsSize() {
		return favoredObjects.size();
	}
	
	public void addFavoredPeople(ArrayList<String> people) {
		favoredPeople.addAll(people);
	}
	
	public void addFavoredObjects(ArrayList<String> objects) {
		favoredObjects.addAll(objects);
	}
	
}
