package p1_round_numbers;

import java.util.Random;

public class Demo {
	private int n = 10;

	public static void main(String[] args) {
		System.out.printf("%-10s%10s%10s\n", "Letters", "Integers", "Doubles");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%-10S%10d%10.2f\n", makeLetters(5), makeRandomInteger(), makeRandomDouble());
		}
		
	}
	
	private static int makeRandomInteger() {
		Random rand = new Random();
		return rand.nextInt(100);
	}
	
	private static double makeRandomDouble() {
		Random rand = new Random();
		return rand.nextDouble() * 100;
	}
	
	// 65 - 90 caps
	// 97 - 122 lower case letters
	private static String makeLetters(int num) {
		Random rand = new Random();
		String letters = "";
		letters = letters + (char)(65 + rand.nextInt(26));
		for(int i = 0; i < num-1; i++) {
			letters = letters + (char)(97 + rand.nextInt(26));
		}
		return letters;
	}

}
