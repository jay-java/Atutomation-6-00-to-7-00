package core;

import java.util.Scanner;

class Call {
	public void data() {
		System.out.println("this function is data function in call class");
	}

	public void calling() {
		System.out.println("this is calling function in call class");
	}
}

public class P005_UserINput {
	public static void main(String[] args) {
		System.out.println("main class");
		int i, j;
//		System.out.println(i + j);
		Call call = new Call();
		call.calling();
		call.data();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		i = sc.nextInt();
		System.out.println("enter j = ");
		j = sc.nextInt();
		int add = i+j;
		System.out.println("addition = "+add);
		System.out.println("enter per : ");
		double per = sc.nextDouble();
		System.out.println("enter long value  = ");
		long long_value = sc.nextLong();
		System.out.println(long_value);
		double division  = (double)i/(double)j;
		System.out.println("division = "+division);
	}
}
