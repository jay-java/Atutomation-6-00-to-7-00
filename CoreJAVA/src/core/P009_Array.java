package core;

import java.util.Scanner;

public class P009_Array {
	public static void main(String[] args) {
		int i=1;
		System.out.println("i = "+i);
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size = ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int index=0;index<a.length;index++) {
			System.out.print("enter element at a["+index+"] : ");
			a[index] = sc.nextInt();
		}
	}
}
