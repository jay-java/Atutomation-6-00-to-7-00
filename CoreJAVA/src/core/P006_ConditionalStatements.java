package core;

import java.util.Scanner;

//1.simple if
//2.if else
//3.nested if
//4.else if ladder
//5.switch case
public class P006_ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("i = ");
		int i = sc.nextInt();
		System.out.println("j = ");
		int j = sc.nextInt();
		if(i!=0 && j!=0) {
			int k = i/j;
			System.out.println(k);
		}
		else {
			System.out.println("error msg");
		}
		
		
		
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
//		(paranthses)
//		1.simple if
		if (a > b) {
			System.out.println("a is greater than b");
		}

		// 2. if else
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		// 3.nested if
		System.out.println("enter age  = ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		System.out.println("enter marks = ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 50) {
			System.out.println("Pass class");
		} else if (m >= 51 && m <= 70) {
			System.out.println("C class");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B class");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ class");
		} else {
			System.out.println("invalid input");
		}

		System.out.println("1.English\n2.Hindi\n3.Gujarati");
		System.out.println("enter your choice : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected gujarati");
			break;
		default:
			System.out.println("invalid input");
		}

	}
}
