package p1;

public class Demo1 {

	public static void main(String[] args) {
		Student s1 = new Student("Alan", 2.0, 18);
		Student s2 = new Student("Bill", 2.5, 19);
		Student s3 = new Student("Cathy", 3.0, 20);
		System.out.println(s1 + "\n" + s2 + "\n" + s3);
		
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
	}

}
