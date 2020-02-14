package p1;

import java.util.Random;

public class Dog {
	private String name;
	private int age;
	private double weight;
	// parameter
	public Dog(String name, int age, double weight) { // name is a local variable
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	public Dog(int numberOfLetters) {
		name = makeRandomName(numberOfLetters);
		age = makeRandomAge();
		weight = makeRandomWeight();
	}
	
	public void setAll(String name, double weight, int age) {
		this.name = name;
		this.age = age;
		this.weight = weight + 2;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return age;
	
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String toString() {
		return name + ":\t\t" + age + ", " + String.format("%6.2f",weight);
	}
	
	private double makeRandomWeight() {
		Random rand = new Random();
		return rand.nextDouble() * 100;
	}
	
	private int makeRandomAge() {
		Random rand = new Random();
		return rand.nextInt(15);
	}
	
	private String makeRandomName(int numberOfChars) {
		Random rand = new Random();
		char firstCapitalLetter = (char)(65 + rand.nextInt(26));
		String lowerCaseLetters = "";
		for(int i = 0; i < numberOfChars-1; i++) {
			lowerCaseLetters = lowerCaseLetters + (char)(97 + rand.nextInt(26));
		}
		
		return firstCapitalLetter + lowerCaseLetters;
	}

}
