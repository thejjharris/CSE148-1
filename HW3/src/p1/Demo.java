package p1;

public class Demo {

	public static void main(String[] args) {
		Car car1 = new Car("Toyota", 40.0, "2019");
		Car car2 = new Car("BMW", 50.0, "2020");
		Car car3 = new Car("Honda", 60.0, "2018");
		System.out.println(car1);
		car1.speedup(40);
		System.out.println(car1);
		car1.slowdown(90);
		System.out.println(car1);
	}

}
