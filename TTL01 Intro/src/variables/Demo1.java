package variables;

public class Demo1 {
	public static void main(String[] args) {
		
		// primitive variables
		short e = 10; // short offers 2 bytes to store a small whole number
		int a = 10; // int offers 4 bytes to store a whole number
		long f = 10; // long offers 8 bytes to store a large whole number
		float g = 2.5f; // float offers 4 bytes to store a small real number
		double b = 10.5; // offers 8 bytes to store a real number
		char c = 'a'; //offers 2 bytes to store a single character
		boolean d = true; // offers 1 byte to store either true or false
		
		// reference variables
		String n;  // a reference variable always offers 8 bytes
		n = "a";
		
		int[] a1 = new int[5]; //array is a variable that stores multiple values of the same type!
		a1[0] = 1;
		a1[1] = 2;
		a1[2] = 3;
		a1[3] = 4;
		a1[4] = 5;
		a1[5] = 6; // array index of out bounds
	}

}
