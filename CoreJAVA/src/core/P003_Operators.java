package core;

//1.Arithmetic -> +,-,*,/,%
//2.Conditional -> >,<,>=,<=,!=,==
//3.Logical -> &&,||,!
//4.Assignment -> = , +=,-+,*=,/+
//5.Unary -> ++,--
public class P003_Operators {
	public static void main(String[] args) {
		// 1.arithmetic
		int i = 12, j = 6, k = 45;
		int addition = i + j + k;
		System.out.println(addition);
		System.out.println("addition of i,j and k = "+(i + j + k));
		System.out.println(addition);
		System.out.println("substraction of i and j = "+(i - j));
		int multiply = i * j;
		System.out.println(multiply);
		System.out.println(i / j);
		int a = 10, b = 3;
		System.out.println(a % b); // % -> will return reminder
	}
}
