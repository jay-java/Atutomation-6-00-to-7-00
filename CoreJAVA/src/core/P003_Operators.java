package core;

//1.Arithmetic -> +,-,*,/,%
//2.Conditional/Relational -> >,<,>=,<=,!=,==
//3.Logical -> &&,||,!
//4.Assignment -> = , +=,-+,*=,/+
//5.Unary -> ++,--
public class P003_Operators {
	public static void main(String[] args) {
		// 1.arithmetic
		int i = 13, j = 12, k = 45;
		int addition = i + j + k;
		System.out.println("addition of i,j and k = " + addition);
		System.out.println("addition of i,j and k = " + (i + j + k));
		System.out.println(addition);
		System.out.println("substraction of i and j = " + (i - j));
		int multiply = i * j;
		System.out.println(multiply);
		System.out.println(i / j);
		int a = 10, b = 3;
		System.out.println("reminder : "+(a % b)); // % -> will return reminder

		// 2.conditional
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
//		int divide = i/j;
//		System.out.println(divide);
		System.out.println(i != j);
		System.out.println(i == j);

		// 3.Assignment
		int q = 1;
		System.out.println(q);
		q += 12; // q = q+12
		System.out.println(q);
		q -= 1;//q = q-1
		System.out.println(q);
		q *= 2;//q = q*2
		System.out.println(q);
		q /= 2;
		System.out.println(q);//12
		int r = 25;
		q += r; //q = q+r
		System.out.println(q);
		
		//5.Unary
		int z = 123;
		z++; //z = z+1
		System.out.println("z = "+z);//124
		z--;
		System.out.println(z);//123
		int x = z++;
		System.out.println("x = "+x);
		System.out.println(z);
	}
}
