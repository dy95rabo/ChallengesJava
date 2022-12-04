package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.ParityBit;

public class ParityBitTest {
    @Test
	public void test01() {
		assertEquals(true, ParityBit.validateBinary("00101101"));
	}

	@Test
	public void test02() { 
		assertEquals(true, ParityBit.validateBinary("11000000"));
	}

	@Test
	public void test03() { 
		assertEquals(false, ParityBit.validateBinary("11000001"));
	}

	@Test
	public void test04() { 
		assertEquals(false, ParityBit.validateBinary("10010010"));
	}

	@Test
	public void test05() { 
		assertEquals(false, ParityBit.validateBinary("10101101"));
	}

	@Test
	public void test06() { 
		assertEquals(false, ParityBit.validateBinary("11000100"));
	}

	@Test
	public void test07() { 
		assertEquals(true, ParityBit.validateBinary("11000101"));
	}

	@Test
	public void test08() { 
		assertEquals(true, ParityBit.validateBinary("10010110"));
	}

	@Test
	public void test09() { 
		assertEquals(false, ParityBit.validateBinary("10101101"));
	}

	@Test
	public void test10() { 
		assertEquals(false, ParityBit.validateBinary("11001000"));
	}

	@Test
	public void test11() { 
		assertEquals(true, ParityBit.validateBinary("11001001"));
	}

	@Test
	public void test12() { 
		assertEquals(true, ParityBit.validateBinary("10011010"));
	}
}
