package core;

class A{
	public void classA() {
		System.out.println("class A function");
	}
}
class B extends A{
	public void classB() {
		System.out.println("class B function in B class");
	}
}
class C extends B{
	public void classC() {
		System.out.println("class C fucntion");
	}
}

class D extends A{
	public void classD() {
		System.out.println("class D function");
	}
}

public class P016_InheritanceTypes {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();
		
		C c = new C();
		c.classA();
		c.classB();
		c.classC();
		
		D d =new D();
		d.classA();
		d.classD();
	}
}
