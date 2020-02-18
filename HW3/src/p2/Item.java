package p2;

public class Item {
	private int itemNumber;
	private String itemDescription;
	private double itemPrice;
	private int itemQty;
	private double itemCharge;
	
	public Item(int itemNumber, String itemDescription, double itemPrice) {
		super();
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
	}
	
	public Item(int itemNumber, String itemDescription, double itemPrice, int itemQty, double itemCharge) {
		super();
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.itemQty = itemQty;
		this.itemCharge = itemCharge;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public double getItemCharge() {
		return itemCharge;
	}

	public void setItemCharge(double itemCharge) {
		this.itemCharge = itemCharge;
	}

	@Override
	public String toString() {
		return "Item [itemNumber=" + itemNumber + ", itemDescription=" + itemDescription + ", itemPrice=" + itemPrice
				+ "]";
	}
	
	
}
