package p1;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Joe", 2, 5); //arguments
		Dog dog2 = new Dog("Johny", 5, 2.4);
		Dog dog3 = new Dog("Billy", 3, 1.53443433);
		Dog dog4 = new Dog(4);
	
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		System.out.println(dog4);
		
//		Random rand = new Random();
//		System.out.println(rand.nextInt(90) + 10);
//		// 65 - 90: capital letters. 97 - 122: lower case
//		
//		System.out.println((char)66);
	}

}
