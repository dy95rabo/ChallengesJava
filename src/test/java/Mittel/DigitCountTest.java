package src.test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.Mittel.DigitCount;

public class DigitCountTest {
    @Test
	public void test01() { 
		assertEquals(1, DigitCount.count(0));
	}

	@Test
	public void test02() { 
		assertEquals(4, DigitCount.count(4666));
	}

	@Test
	public void test03() { 
		assertEquals(3, DigitCount.count(544));
	}

	@Test
	public void test04() { 
		assertEquals(6, DigitCount.count(121317));
	}

	@Test
	public void test05() { 
		assertEquals(5, DigitCount.count(12345));
	}

	@Test
	public void test06() { 
		assertEquals(13, DigitCount.count(1289396387328L));
	}

	@Test
	public void test07() { 
		assertEquals(7, DigitCount.count(-1232323));
	}

	@Test
	public void test08() { 
		assertEquals(16, DigitCount.count(3463463874638476L));
	}

	@Test
	public void test09() { 
		assertEquals(9, DigitCount.count(-231200000));
	}

	@Test
	public void test10() { 
		assertEquals(13, DigitCount.count(1283939312321L));
	}

	@Test
	public void test11() { 
		assertEquals(9, DigitCount.count(-231273683));
	}

	@Test
	public void test12() { 
		assertEquals(7, DigitCount.count(3200000));
	}

	@Test
	public void test13() { 
		assertEquals(9, DigitCount.count(314890000));
	}
}
