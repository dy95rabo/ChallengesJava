package test.java.Experte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Experte.PalindromeDescendant;

public class PalindromeDescendantTest {
    @Test
	public void test1() {
		assertEquals(true, PalindromeDescendant.palindromeDescendant(11211230));
	}

	@Test
	public void test2() {
		assertEquals(true, PalindromeDescendant.palindromeDescendant(13001120));
	}

	@Test
	public void test3() {
		assertEquals(true, PalindromeDescendant.palindromeDescendant(23336014));
	}

	@Test
	public void test4() {
		assertEquals(true, PalindromeDescendant.palindromeDescendant(11));
	}

	@Test
	public void test5() {
		assertEquals(false, PalindromeDescendant.palindromeDescendant(1122));
	}

	@Test
	public void test6() {
		assertEquals(true, PalindromeDescendant.palindromeDescendant(332233));
	}

	@Test
	public void test7() {
		assertEquals(true, PalindromeDescendant.palindromeDescendant(10210112));
	}

	@Test
	public void test8() {
		assertEquals(false, PalindromeDescendant.palindromeDescendant(9735));
	}

	@Test
	public void test9() {
		assertEquals(false, PalindromeDescendant.palindromeDescendant(97358817));
	}
}
