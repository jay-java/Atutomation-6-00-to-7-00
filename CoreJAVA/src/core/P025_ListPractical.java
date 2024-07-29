package core;

import java.util.ArrayList;
import java.util.List;

class Laptop {
	int ram;
	String model;
	double price;

	public Laptop(int ram, String model, double price) {
		super();
		this.ram = ram;
		this.model = model;
		this.price = price;
	}

	public String toString() {
		return "Laptop [ram=" + ram + ", model=" + model + ", price=" + price + "]";
	}

}

public class P025_ListPractical {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(8, "dell", 5000.10);
		Laptop l2 = new Laptop(4, "lenovo", 25000.10);
		Laptop l3 = new Laptop(6, "hp", 35000.10);
		Laptop l4 = new Laptop(10, "sony", 45000.10);
		Laptop l5 = new Laptop(12, "mac", 55000.10);
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);
		System.out.println(list);
		for(Laptop l:list) {
			System.out.println(l);
		}
	}
}
