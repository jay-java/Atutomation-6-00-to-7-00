package core;

public class P004_Typecasting {
	public static void main(String[] args) {
		long l = 12;
		byte i = (byte)l;//explicit
		int j = 12;
		long k = j;//implicit
		
		double d = 3.14;
		int a = (int)d;
		System.out.println(a);
		int b = 12;
		System.out.println("b = "+b);
		double q = b;
		System.out.println("q = "+q);
	}
}
