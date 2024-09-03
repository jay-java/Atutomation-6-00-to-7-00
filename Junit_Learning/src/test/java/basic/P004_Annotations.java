package basic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P004_Annotations {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@Before
	public void beforeMethod() {
		System.out.println("this will run before every test");
	}

	@After
	public void afterMethod() {
		System.out.println("this will run after every test");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}
