package core;
interface inter1{
	public void interface1();
	public static void run() {
		System.out.println("run in interface1");
	}
}
interface inter2{
	public void interface2();
}
class InterCall implements inter1,inter2{
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
	
}
public class P020_Interface {
	public static void main(String[] args) {
		InterCall i  =new InterCall();
		i.interface1();
		i.interface2();
		inter1.run();
	}
}
