package p1_intro;

public class Chair { // class header

	// fields: visible to the entire class
	private String color; // private: only local class can view the variable
	private double price;
	private boolean hasUSBSound;
	private boolean isSleepable;

	// methods
	// constructor: name must be same as the class
	public Chair() { // method header

	}
	
	// local variables are to import data and only visible locally
	public Chair(String newColor, double newPrice, boolean newHasUSBSound, boolean newIsSleepable) {
		color = newColor;
		price = newPrice;
		hasUSBSound = newHasUSBSound;
		isSleepable = newIsSleepable;
		
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getIsSleepable() {
		return isSleepable;
	}
}
