package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P026_Set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add("java");
		set.add('d');
		set.add(342534);
		set.add(343.3);
		set.add(false);
		set.add(1);
		System.out.println(set);
		Iterator itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
