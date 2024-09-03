package basic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class P002_Assert {
	@Test
	public void test() {
		System.out.println("test running");
		int a = 12;
		int b = 13;
		int actualResult = a+b;
		int expectedResult = 30;
//		assertEquals(expectedResult, actualResult);
		int a1[] = {1,2,3,4};
		int a2[] = {1,2,3,4};
//		assertArrayEquals(a1, a2);
//		assertFalse(true);
	}
	

}
