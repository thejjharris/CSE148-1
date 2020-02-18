package p2;

public class Menu {
	private Item[] menu;
	private int numberOfItems;

	public Menu(int maxMenuSize) {
		menu = new Item[maxMenuSize];
		numberOfItems = 0;
	}
	
	public void showMenu() {
		for(int i = 0; i < numberOfItems; i++) {
			System.out.printf("%-5d%-10s%10.2f\n", menu[i].getItemNumber(), menu[i].getItemDescription(), menu[i].getItemPrice());
		}
	}

	public void insertItem(Item item) {
		menu[numberOfItems++] = item;
	}

	public Item searchItem(int itemNumber) {
		for (int i = 0; i < numberOfItems; i++) {
			if (menu[i].getItemNumber() == itemNumber) {
				return menu[i];
			}
		}
		return null;
	}

	public Item removeItem(int itemNumber) {
		int i;
		for (i = 0; i < numberOfItems; i++) {
			if (menu[i].getItemNumber() == itemNumber) {
				break;
			}
		}

		if (i == numberOfItems) {
			return null;
		} else {
			Item temp = menu[i];
			for (int j = i; j < numberOfItems - 1; j++) {
				menu[j] = menu[j + 1];
			}
			numberOfItems--;
			return temp;
		}
	}

}
