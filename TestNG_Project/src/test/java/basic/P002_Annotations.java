package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P002_Annotations {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after Class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	@Test
	public void test2() {
		System.out.println("test 2");
	}
}
