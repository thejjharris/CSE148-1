package p1;

public class App {

	public static void main(String[] args) {
		Classroom c1 = new Classroom("R212", 30, true);
//		System.out.println(c1);

		Classroom[] rooms = new Classroom[10];
		rooms[0] = c1;

		String letters = "";
		for (int i = 0; i < 5; i++) {
			// 65 - 90 caps
			// 97 - 122 lower case letters

			int randomNumber = 97 + (int) (Math.random() * 26);
			letters = letters + (char) (randomNumber);

		}
		System.out.println(letters);
	}
}
