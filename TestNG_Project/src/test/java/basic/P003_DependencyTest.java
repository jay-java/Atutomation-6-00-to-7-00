package basic;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class P003_DependencyTest {
	@Test(priority = 1)
	public void createAccount() {
		System.out.println("create account");
//		assertFalse(true);
	}

	@Test(priority = 2,dependsOnMethods = "createAccount")
	public void login() {
		System.out.println("login");
		assertFalse(true);
	}

	@Test(priority = 3,dependsOnMethods = "login")
	public void profile() {
		System.out.println("profile");
	}

	@Test(priority = 4,dependsOnMethods = "profile")
	public void logout() {
		System.out.println("logout");
	}
}
