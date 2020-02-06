package p1;

public class Cat {
	private String name;
	private String color;

	public Cat(String n, String c) {
		this.name = n;
		this.color = c;
	}

	public void setName(String newName) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return "Name is: " + name + " and color is " + color + ".";
	}
}
