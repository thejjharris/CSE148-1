package p1_dog;

public class Demo {

	// not design anymore
	// here we use the design
	// arguments are actual data placed in parentheses
	public static void main(String[] args) {
		Dog d1 = new Dog("Adam", 3, 3.3);
		Dog d2 = new Dog();
		Dog d3 = new Dog("Cathy", 4, 4.3);
		Dog d4 = new Dog();
		Dog d5 = new Dog("Dave", 2, 1.3);
		Dog d6 = new Dog();
		Dog[] dogs1 = {d1, d2, d3, d4, d5, d6};
//		Dog[] dogs2 = dogs1;//shallow copy
//		System.out.println(dogs1 == dogs2);
		
		Dog[] dogs2 = new Dog[dogs1.length];
			for(int i = 0; i < dogs1.length; i++) {
				dogs2[i] = dogs1[i];
			}
		
			System.out.println(dogs2 == dogs1);
		
//		Dog d7 = new Dog(d1); // deep copy
//		Dog d8 = d7; // shallow copy
//		d7.setWeight(33.33);
//		System.out.println(d7 == d8);
	}

}
