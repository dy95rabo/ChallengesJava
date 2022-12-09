package test.java.Experte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Experte.HiddenAnagrams;

public class HiddenAnagramsTest {
    @Test
	public void test01() { 
		assertEquals("worldevolvesin", HiddenAnagrams.hiddenAnagram("My world evolves in a beautiful space called Tesh.", "sworn love lived"));
	}

	@Test
	public void test02() { 
		assertEquals("moonstarer", HiddenAnagrams.hiddenAnagram("Sir Patrick Moore was a famous moon starer", "Astronomer"));
	}

	@Test
	public void test03() { 
		assertEquals("builttostayfree", HiddenAnagrams.hiddenAnagram("A building,  built to stay free of defects,  is uncommon!", "Statue of Liberty"));
	}

	@Test
	public void test04() { 
		assertEquals("noutfond", HiddenAnagrams.hiddenAnagram("Bright is the moon", "Bongo mirth"));
	}

	@Test
	public void test05() { 
		assertEquals("anchormanbilla", HiddenAnagrams.hiddenAnagram("Anchor man Bill,  a well known TV personality,  was confused about becoming president", "Abraham Lincoln"));
	}

	@Test
	public void test06() { 
		assertEquals("televisionads", HiddenAnagrams.hiddenAnagram("There seem to be more and more television ads on the box these days!", "enslave idiots"));
	}

	@Test
	public void test07() { 
		assertEquals("oratorshate", HiddenAnagrams.hiddenAnagram("The thing orators hate most is a throat infection", "A sore throat"));
	}

	@Test
	public void test08() { 
		assertEquals("cornetnoteo", HiddenAnagrams.hiddenAnagram("I thought I heard a high cornet note of great beuaty", "One Cornetto"));
	}

	@Test
	public void test09() { 
		assertEquals("debitcard", HiddenAnagrams.hiddenAnagram("D  e b90it->?$ (c)a r...d, , #~", "bad credit"));
	}

	@Test
	public void test10() { 
		assertEquals("noutfond", HiddenAnagrams.hiddenAnagram("You won't find any HiddenAnagrams here!", "aerogramhenna"));
	}
}
