package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.Sum0fV0w3ls;

public class Sum0fV0w3lsTest {
    @Test
	public void test01() { 
		assertEquals(17, Sum0fV0w3ls.sumOfVowels("My world evolves around Tesha's."));
	}

	@Test
	public void test02() { 
		assertEquals(39, Sum0fV0w3ls.sumOfVowels("Apparently, a heart that beats for no one, but for Tesh."));
	}

	@Test
	public void test03() { 
		assertEquals(18, Sum0fV0w3ls.sumOfVowels("I will be forever yours, babe."));
	}

	@Test
	public void test04() { 
		assertEquals(8, Sum0fV0w3ls.sumOfVowels("To each, his own."));
	}

	@Test
	public void test05() { 
		assertEquals(40, Sum0fV0w3ls.sumOfVowels("You are the master of your fate and the captain of your soul."));
	}

	@Test
	public void test06() { 
		assertEquals(8, Sum0fV0w3ls.sumOfVowels("Let's test this function."));
	}

	@Test
	public void test07() { 
		assertEquals(10, Sum0fV0w3ls.sumOfVowels("Do I get the correct output?"));
	}

	@Test
	public void test08() { 
		assertEquals(12, Sum0fV0w3ls.sumOfVowels("I love edabit!"));
	}

	@Test
	public void test09() { 
		assertEquals(26, Sum0fV0w3ls.sumOfVowels("Will you still need me, will you still feed me when I'm 64?"));
	}

	@Test
	public void test10() { 
		assertEquals(52, Sum0fV0w3ls.sumOfVowels("The greatest glory in living lies not in never falling, but in rising every time we fall."));
	}
}
