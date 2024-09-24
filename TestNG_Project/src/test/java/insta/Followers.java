package insta;

import org.testng.annotations.Test;

public class Followers {
	@Test(groups = "checkStory")
	public void showAllFollowers() {
		System.out.println("show all followers");
	}
	
	@Test
	public void sendRequest() {
		System.out.println("send request");
	}

	@Test
	public void acceptRequ() {
		System.out.println("accept request");
	}

	@Test
	public void unfollow() {
		System.out.println("unfollow");
	}

	@Test
	public void block() {
		System.out.println("block");
	}
}
