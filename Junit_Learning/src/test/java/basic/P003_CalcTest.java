package basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P003_CalcTest {
	@Test
	public void addTest() {
		Calc c = new Calc();
		int res = c.add(1, 2);
		int exp = 3;
		assertEquals(exp, res);
	}
}
