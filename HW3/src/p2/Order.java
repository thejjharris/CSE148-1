package p2;

import java.util.Scanner;

public class Order {
	private Item[] order;
	private int numberOfItems;
	private double subtotal;
	private double tax;
	private double total;
	private Menu menu;
	
	public Order(int maxSize, Menu menu) {
		order = new Item[maxSize];
		numberOfItems = 0;
		this.menu = menu;
	}
	
	public Item[] createOrder() {
		Scanner kb = new Scanner(System.in);
		boolean hasMoreItem = true;
		do {
			System.out.println("What would you like to order? ");
			int itemNumber = kb.nextInt();
			System.out.println("How many would you want? ");
			int itemQty = kb.nextInt();
			Item item = menu.searchItem(itemNumber);
			item.setItemQty(itemQty);
			item.setItemCharge(item.getItemPrice() * itemQty);
			order[numberOfItems++] = item;
			kb.nextLine();
			System.out.println("Do you need anything else?");
			String reply = (kb.nextLine().toUpperCase().substring(0, 1));
			if(!reply.contentEquals("Y")) {
				hasMoreItem = false;
			}
		} while(hasMoreItem);
		return order;
	}
	
	public void showCheck() {
		double subtotal = 0;
		for(int i = 0; i < numberOfItems; i++) {
			subtotal += order[i].getItemCharge();
		}
		double taxes = subtotal * 0.08625;
		
		double total = subtotal + subtotal;
		for(int i = 0; i < numberOfItems; i++) {
			System.out.printf("%-4d%10s%10.2f%5d%10.2f\n", order[i].getItemNumber(), order[i].getItemDescription(), order[i].getItemPrice(), order[i].getItemQty(), order[i].getItemCharge());
		}
		System.out.println("------------------------------------------");
		System.out.printf("%-10s%29.2f\n", "Subtotal", subtotal);
		System.out.printf("%-10s%29.2f\n", "Taxes", taxes);
		System.out.printf("%-10S%29.2f\n", "Total", subtotal);
	}

	

}
