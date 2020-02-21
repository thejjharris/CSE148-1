package p2_mw;

public class Item {
	private String itemNumber;
	private String itemDescription;
	private double price;
	
	private int itemQty;
	private double itemCharge;

	public Item(String itemNumber, String itemDescription, double price) {
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.price = price;
	}
	public Item(String itemNumber, String itemDescription, double price, int itemQty, double itemCharge) {
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.price = price;
		this.itemQty = itemQty;
		this.itemCharge = itemCharge;
	}
	

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemNumber=" + itemNumber + ", itemDescription=" + itemDescription + ", price=" + price + "]";
	}

}
