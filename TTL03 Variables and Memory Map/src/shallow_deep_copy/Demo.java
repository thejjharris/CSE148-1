package shallow_deep_copy;

public class Demo {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 11;
		a[1] = 22;
		a[2] = 33;
		
		int[] b = new int[5];
		
		System.out.println("A array: ");
		for(int i : a) {
			System.out.println(i);
		}
		
		b[0] = a[0];
		b[1] = a[1];
		b[2] = a[2];
		b[3] = a[3];
		b[4] = a[4];
		
		System.out.println("B array: ");
		for(int i : b) {
			System.out.println(i);
		}
		
		a = b;
//		b = null;
		a =null;
		a[0] = 44;
		
//		int[] a = new int[5];
//		a[0] = 100;
//		a[4] = 50;
//		
//		int[] b = a; // shallow copy
//		a[1] = 10000;
//		
//		b = null;
//		a = null;
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//		int x = 5;
//		x = 10;
//		int y = x;
//		y = 20;
	}

}
