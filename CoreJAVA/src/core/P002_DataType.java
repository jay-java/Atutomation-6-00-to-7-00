package core;

//1.Primitive -> byte,short,int,long ->NUMERIC only whole number(1,2)
//				 float,double -> numeric with decimal (1,2,3.14)
//				 char -> for single character -> 'a'
//				 boolean -> true/false
//2.non-primitive-> array,string,class
public class P002_DataType {
	public static void main(String[] args) {
		byte b = 12; //1
		System.out.println(b);
		System.out.println("value of b = "+b);
		short s = 32767; //2
		System.out.println(s);
		System.out.println("value of s = "+s);
		int i = 12; //4
		System.out.println(i);
		System.out.println("value of i = "+i);
		long q = 12; //8
		System.out.println(q);
		float f = 3.145687787987f;//4
		System.out.println(f);
		double d = 3.145687979732;//8
		System.out.println(d);
		char c = 'l';
		System.out.println(c);
		boolean flag = true;
		System.out.println(flag);
	}
}
