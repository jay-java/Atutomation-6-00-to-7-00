package insta;

import org.testng.annotations.Test;

public class User {
	@Test
	public void CA() {
		System.out.println("create account");
	}

	@Test(groups = {"checkStory","createReel"})
	public void login() {
		System.out.println("login");
	}

	@Test
	public void profile() {
		System.out.println("manage profile");
	}

	@Test
	public void changePassword() {
		System.out.println("change password");
	}

	@Test
	public void logout() {
		System.out.println("logout");
	}
}
