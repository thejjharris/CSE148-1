package p1;

public class Demo {

	public static void main(String[] args) {
//		Cat cat1 = new Cat("White", 5.5, 2, "CatName1");
//		Cat cat2 = new Cat("Black", 3.5, 4, "CatName2");
		
		Cat cat1 = new Cat("White", 5.5, 2, "CatName1");
		System.out.println("Cat1's name is: " + cat1.getName());
		cat1.growLarger();
		System.out.println("Cat1's new weight is: " + cat1.getWeight());
		cat1.growOlder();
		System.out.println("Cat1's new age is: " + cat1.getAge());
		
		System.out.println("--------------------------");
		Cat cat2 = new Cat("Black", 3.5, 4, "CatName2");
		System.out.println("Cat2's name is: " + cat2.getName());
		System.out.println("Cat2's age is: " + cat2.getAge());
		System.out.println("Cat2's weight is: " + cat2.getWeight());
		System.out.println("---------------------------");
		
		cat1.setColor("Brown");
		System.out.println("Cat1's new color is: " + cat1.getColor());

		System.out.println("----Now we are using the no-arg constructor---");
		Cat cat3 = new Cat();
		cat3.growOlder();
		cat3.growOlder();
		cat3.growOlder();
		cat3.growOlder();
		System.out.println(cat3.getColor());
		System.out.println(cat3.getWeight());
		System.out.println(cat3.getAge());
		System.out.println(cat3.getName());
		
		System.out.println("-----The fourth cat:------ ");
		Cat cat4 = new Cat();
		cat4.setColor("white");
		System.out.println(cat4.getColor());
		System.out.println(cat4.getWeight());
		System.out.println(cat4.getAge());
		System.out.println(cat4.getName());
		
		System.out.println("----- The fifth cat: -------");
		Cat cat5 = new Cat("Gray", 2.5, 5, "Name5");
		System.out.println(cat5);
		System.out.println("------ The finale ------");
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		System.out.println(cat4);
		System.out.println(cat5);
		
		System.out.println("---------The end, let's put all cats together-------------");
		Cat[] cats= new Cat[5];
		cats[0] = cat1;
		cats[1] = cat2;
		cats[2] = cat3;
		cats[3] = cat4;
		cats[4] = cat5;
		System.out.println(cats[3]);
	}	

}
