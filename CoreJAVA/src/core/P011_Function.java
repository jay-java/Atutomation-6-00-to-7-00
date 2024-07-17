package core;

import java.util.Scanner;

//without return type(void) without parameter/argument
//without return type with parameter/argument
//with return type without parameter/argument
//with return type with parameter/argument
//(paranthases)
class FunctionCall{
	
	public void one() {
		System.out.println("one function");
	}
	public void getName(String name) {
		System.out.println("name : "+name);
	}
	public void two(int id,String name) {
		System.out.println("two function : "+id+" name : "+name);
	}
	public int getValue() {
		return 345;
	}
	public int getSquare(int num) {
		return num*num;
	}
}
public class P011_Function {
	public static void main(String[] args) {
		System.out.println("main function");
		FunctionCall f = new FunctionCall();
		f.one();
		f.two(12,"java tech");
		double d =  f.getValue();
		System.out.println(d);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to find square : ");
		int num = sc.nextInt();
		int res = f.getSquare(num);
		System.out.println("square of "+num+" is "+res);
	}
}
