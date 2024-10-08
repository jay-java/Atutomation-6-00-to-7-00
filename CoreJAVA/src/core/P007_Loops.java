package core;

import java.util.Scanner;

//1.for(initialization;condition;++/--)
//2.while(condition)
//3.do{} while(condition);
//4.for each
// < -> ++
// > -> --
public class P007_Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num to print table : ");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}

		for (int i = 1; i <= 10; i++) {// entry control
			System.out.println("for loop : " + i);
		}
		System.out.println("---------------------");
		int j = 1;
		while (j <= 10) {// entry control
			System.out.println("while loop : " + j);
			j++;
		}
		System.out.println("---------------------");
		int k = 1;
		do { // exit control
			System.out.println("do while : " + k);
			k++;
		} while (k <= 10);
	}
}
