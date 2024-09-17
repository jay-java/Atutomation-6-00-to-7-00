package insta;

import org.testng.annotations.Test;

public class Reels {
	@Test(groups = "createReel")
	public void createReel() {
		System.out.println("create reeel");
	}
	@Test(groups = "createReel")
	public void remove() {
		System.out.println("remove");
	}
	@Test
	public void edit() {
		System.out.println("edit reeel");
	}
	@Test
	public void shareWithPriority() {
		System.out.println("show reeel based on priority");
	}
	@Test
	public void location() {
		System.out.println("location");
	}
	
}
