package core;

import java.util.ArrayList;
import java.util.Iterator;

public class P024_ArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("java");
		list.add('d');
		list.add(false);
		list.add(234545);
		list.add(454.3);
		list.add(1);
		list.add(3456);
		System.out.println(list);
		list.add(12);
		System.out.println("size of list : " + list.size());
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		System.out.println("size of list : " + list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
