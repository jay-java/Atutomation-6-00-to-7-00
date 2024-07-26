package core;
import java.util.InputMismatchException;
//1.try
//2.catch
//3.finally
//4.throw
//5.throws
import java.util.Scanner;

class Divide{
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b>0) {
			int c = a/b;
			System.out.println("c = "+c);
		}else {
			throw new ArithmeticException("msg");
		}
	}
}
public class P021_Exception {
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException msg");
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException msg");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
//		try {
//			//risky code
//			Scanner sc = new  Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a/b;
//			System.out.println("c = "+c);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator should be greater than 0");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			//closing type code
//			System.out.println("this will execute everytime");
//		}
	}
}
