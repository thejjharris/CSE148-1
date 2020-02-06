package p1;

public class Item {
	private String title;
	private double weight;
	private double price;
	private String color;
	
	public Item(String title, double weight, double price, String color){
		this.title = title;
		this.weight = weight;
		this.color = color;
		this.price = price;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "Title=" + title
				+ ", Weight=" + weight
				+ ", Price=" + price
				+ ", Color= " + color;
	}
}
