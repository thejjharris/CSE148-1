package p2_mw;

public class Demo {

	public static void main(String[] args) {
		Item item1 = new Item("E1", "Kalbi", 14.99);
		Item item2 = new Item("E2", "Special Box", 11.99);
		Item item3 = new Item("E3", "Jopche", 8.99);
		
		Menu dinnerMenu = new Menu("Seoul Restaurant", 
				"123 Main Street, Selden, NY 11784", 
				"(631)123-4567", 20);
		
		dinnerMenu.insertItem(item1);
		dinnerMenu.insertItem(item2);
		dinnerMenu.insertItem(item3);
		
		dinnerMenu.showMenu();
		dinnerMenu.removeItemByItemNumber("E2");
		dinnerMenu.showMenu();
		System.out.println(dinnerMenu.searchItemByItemNumber("E2"));
		
		
	}

}
