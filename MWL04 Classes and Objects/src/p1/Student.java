package p1;

public class Student {
	// private: variables are only visible to this local class
	// instance variables
	// attributes
	// properties
	// fields
	private double gpa;
	private String name;
	private int age;

	// constructor: to allow us to create an object to hold the data
	public Student(String name, double gpa, int age) {
		this.gpa = gpa;
		this.name = name;
		this.age = age;
	}

	// setters, mutators
	public void setGpa(double newGpa) {
		if (newGpa > 4.0) {
			gpa = 4.0;
		} else if (newGpa < 0.0) {
			gpa = 0.0;
		} else {
			this.gpa = newGpa;
		}
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public void setAll(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	// getters, assessors method
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getGpa() {
		if (gpa < 0) {
			gpa = 0.0;
		}

		if (gpa > 4.0) {
			gpa = 4.0;
		}
		return gpa;
	}

	public String toString() {
		return "Name: " + name + "; GPA: " + gpa + "; Age: " + age;
	}

}
