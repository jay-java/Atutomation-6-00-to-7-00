package basic;

import org.testng.annotations.Test;

public class P001_First {
	
	@Test(priority = 4)
	public void changePass() {
		System.out.println("change password");
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("login method");
	}

	@Test(priority = 3,expectedExceptions = ArithmeticException.class)
	public void profile() {
		int i = 10/0;
		System.out.println("profile method"+i);
	}

	@Test(priority = 1)
	public void CA() {
		System.out.println("create account");
	}
	
	@Test(priority = 5)
	public void logout() {
		System.out.println("logout");
	}

}
