package core;
//***
//***
//***
public class P008_Pattern {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//*
		//**
		//***
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//1
		//12
		//123
		//1234
		//12345
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//1
		//4 9
		//16 25 36
		//49 64 81 100
		//121 144 169 196
		int num=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((num*num)+" ");
				num++;
			}
			System.out.println();
		}
		
		
		//    *
		//   * *
		//  * * *
		// * * * *
		//* * * * *
		
		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
