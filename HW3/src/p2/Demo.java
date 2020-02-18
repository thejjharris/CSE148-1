package p2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Item i1 = new Item(1, "Soda", 1.99);
		Item i2 = new Item(2, "Milk", 2.99);
		Item i3 = new Item(3, "O.J.", 3.99);
		Item i4 = new Item(4, "Water", 1.99);
		
		Menu menu = new Menu(50);
		menu.insertItem(i1);
		menu.insertItem(i2);
		menu.insertItem(i3);
		menu.insertItem(i4);
		boolean hasMoreOrder = true;
		Scanner kb = new Scanner(System.in);
		do {
			menu.showMenu();
			Order order = new Order(10, menu);
			order.createOrder();
			order.showCheck();
			System.out.println("\n\n------------------------------\nMore order?");
			String reply = kb.nextLine().toUpperCase();
			if(reply.charAt(0) != 'Y') {
				hasMoreOrder = false;
			}
		} while (hasMoreOrder);
	}

}
