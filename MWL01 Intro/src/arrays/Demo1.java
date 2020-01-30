package arrays;

public class Demo1 {

	public static void main(String[] args) {
//		// arrays: one variable to store multiple values of the same type
//		
//		// primitive variables
//		short a = 2; // short offers 2 bytes to store data
//		System.out.println(Short.MIN_VALUE + " -- " + Short.MAX_VALUE);
//		int x = 1;// int offers 4 bytes to store data
//		System.out.println(Integer.MIN_VALUE + " -- " + Integer.MAX_VALUE);
//		int number = 2147483647;
//		number = number + 1;
//		System.out.println("The number is: " + number);
//		
//		long b = 2323434344l; // long offers 8 bytes to store data
//		System.out.println(Long.MIN_VALUE + " -- " + Long.MAX_VALUE);
//		float f = 2.54f; // float offers 4 bytes to store data
//		double y = 2.5; // double offers 8 bytes to store data
//		
//		char ch = 'a'; // char offers 2 bytes to store a single character
//		
//		boolean boo = false; // or true boolean offers 1 byte to store true or false
//	
//		// reference variables
//		int[] a1 = new int[5];
//		a1[0] = 100;
//		a1[3] = 50;
//		a1[2] = 30;
//		
////		for(int i = 0; i < a1.length; i++) {
////			System.out.println(a1[i]);
////		}
//		
////		for(int z : a1) {  // enhanced for loop
////			System.out.println(z);
////		}
//		
////		int i = 0;
////		while(i < a1.length) {
////			System.out.println(a1[i]);
////			i++;
////		}
//		
//		int x;
//		x = 1;
//		
		int[] a1 = new int[5];
		a1[0] = 1;
		a1[1] = 11;
		a1[2] = 111;
		a1[3] = 1111;
		a1[4] = 11111;
		
		a1[0] = 1000;
		
		for(int a : a1) {
			System.out.println(a);
		}
		
		int[] b1 = a1;
		
		b1[0] = 222;
		
		for(int a : a1) {
			System.out.println(a);
		}
		
		for(int b : b1) {
			System.out.println(b);
		}
		
	}

}
