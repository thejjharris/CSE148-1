package p1_dog;

public class Dog {
	private String name;
	private int age;
	private double weight;
	
	// parameters, placeholders, are placed in parentheses 
	public Dog(String name, int age, double weight) {
		this.age = age;
		this.weight = weight;
		this.name = name;
	}
	// overloaded constructors
	public Dog() {
		name = "Billy";
		age = 5;
		weight = 5.5;
	}
	
	public Dog(Dog dog) {
		this.name =dog.name;
		this.age = dog.age;
		this.weight = dog.weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}
