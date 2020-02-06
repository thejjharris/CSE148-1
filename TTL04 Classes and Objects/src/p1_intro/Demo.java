package p1_intro;

public class Demo {

	public static void main(String[] args) {
		Chair chair1 = new Chair();
		System.out.println(chair1.color);
		System.out.println(chair1.price);
		System.out.println(chair1.isSleepable);
		System.out.println(chair1.hasUSBSound);
		System.out.println();
		Chair chair2 = new Chair("Blue", 99.99, false, true);
		System.out.println(chair2.color);
		System.out.println(chair2.price);
		System.out.println(chair2.isSleepable);
		System.out.println(chair2.hasUSBSound);
	}

}
