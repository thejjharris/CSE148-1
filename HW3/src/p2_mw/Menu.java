package p2_mw;

public class Menu {
	private String dashLine = "-----------------------------------------";
	private String name;
	private String address;
	private String phone;
	
	private Item[] items;
	private int nItems;
	
	public Menu(String name, String address, String phone, int maxMenuSize) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		items = new Item[maxMenuSize];
		nItems = 0;
	}
	
	public Item removeItemByItemNumber(String itemNumber) {
		int i;
		for(i = 0; i < nItems; i++) {
			if(items[i].getItemNumber().equals(itemNumber)) {
				break;
			}
		}
		
		if(i == nItems) {
			return null;
		} else {
			Item temp = items[i];
			for(int j = i; j< nItems-1; j++) {
				items[j] = items[j+1];
			}
			nItems--;
			return temp;
		}
	}
	
	public Item searchItemByItemNumber(String itemNumber) {
		for(int i = 0; i < nItems; i++) {
			if(items[i].getItemNumber().contentEquals(itemNumber)) {
				return items[i];
			}
		}
		return null;
	}
	
	public String makeHeader() {
		String header = "\t" +name + "\n" + address + "\n\t" + phone;
		return header;
	}
	
	public void insertItem(Item item) {
		items[nItems++] = item;
	}
	
	public void showMenu() {
		System.out.println(dashLine);
		System.out.println(dashLine);
		System.out.println(makeHeader());
		System.out.println(dashLine);
		System.out.println(dashLine);
		
		for(int i = 0; i < nItems; i++) {
			System.out.printf("%-5S%-15s%10.2f\n", items[i].getItemNumber(), 
					items[i].getItemDescription(), items[i].getPrice());
		}
	}
	

}
