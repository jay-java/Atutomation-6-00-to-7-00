package core;

class Student {
	int id;
	String name;
	long contact;
	static String college_name = "XYZ";

	public void call() {
		System.out.println("call non static function");
	}

	public static void run() {
		System.out.println("run static function");
	}

	public void showData() {
		System.out.println(
				"id : " + id + " name : " + name + " contact : " + contact + " college name : " + college_name);
	}
}

public class P013_StaticKeyword {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id =12;
		s1.name = "java";
		s1.contact =987654;
		s1.showData();
		Student s2 = new Student();
		s2.id =13;
		s2.name = "python";
		s2.contact =98765435;
		s2.showData();
		s2.call();
		Student.run();
		
	}
}
