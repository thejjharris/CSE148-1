package p1;

//name is given here: 1st component
public class Cat { // header
// body of the class
	// instance fields: used to describe the state
	// of each cat object. They vary from cat to cat
	private String color;
	private double weight;
	private int age;
	private String name;
	
	// methods
	// special method: constructor
	// used to build object
	
	//  overloaded methods (constructors)
	public Cat() { // default constructor
		color = "Black";
		weight = 10.0;
		age = 1;
		name = "Default name";
	}
	
	// parameters are the variables in parentheses
	public Cat(String color, double weight, int age, String name) {
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void growLarger() {
		weight = weight + 1;
	}
	
	public void growOlder(){
		age = age + 1;
	}
	
	public void setName(String name) { // this. means this object's value
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return name + ":\t" + color + ", " + weight + ", " + age;
	}
	
}
