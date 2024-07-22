package core;

class Overload {
	public void shape() {
		System.out.println("blank shape function");
	}

	public void shape(int sides) {
		if(sides == 3) {
			System.out.println("traingle");
		}
		else if(sides == 4) {
			System.out.println("square/rectangle");
		}
		else if(sides == 5) {
			System.out.println("pentagon");
		}
		else if(sides == 6) {
			System.out.println("hexagon");
		}
		else {
			System.out.println("invalid");
		}
	}

}

class Override{
	public void call() {
		System.out.println("call in override class");
	}
}

class Calling extends Override{
	public void call() {
		super.call();
		System.out.println("call in calling class");
	}
}

public class P017_Polymorphism {
	public static void main(String[] args) {
		Overload o =new Overload();
		o.shape();
		o.shape(50);
		
		Calling c =  new Calling();
		c.call();
	}
}
