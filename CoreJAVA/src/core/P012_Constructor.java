package core;

import java.util.Scanner;

class Data {
	int id;
	String name;
	long contact;
	
	Data() {
		System.out.println("default cons");
	}
	Data(int id) {
		System.out.println("para : " + id);
	}
	Data(int id, String name, long contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
		System.out.println("inside cons ->id : " + id + " name : " + name + " contact : " + contact);
	}
	
	public void run() {
		System.out.println("run function");
	}

	public void getData() {
		System.out.println("inside method ->id : " + id + " name : " + name + " contact : " + contact);
	}
	public double areaOfCircle(double radius) {
		double area = Math.PI*radius*radius;
		return area;
	}
	
}

public class P012_Constructor {
	public static void main(String[] args) {
		Data d = new Data();
		d.run();
		Data d1 = new Data(14, "java", 9876541);
		d1.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius : ");
		double radius  = sc.nextDouble();
		double area =d.areaOfCircle(radius);
		System.out.println("area of circle = "+area);
	}

}
