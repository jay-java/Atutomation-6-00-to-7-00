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
		int sum =0;
		for(int index=0;index<a.length;index++) {
			 sum=sum+a[index];
			 System.out.println("sum of elements is  : "+sum);
		}
		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();
		int counter = 0;
		for(int index=0;index<a.length;index++) {
			if(num == a[index]) {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("yes exist "+counter+" times");
		}
		else {
			System.out.println("not exist");
		}
	}
}
