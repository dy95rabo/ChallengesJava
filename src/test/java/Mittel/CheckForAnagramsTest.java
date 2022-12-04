package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.CheckForAnagrams;

public class CheckForAnagramsTest {
    @Test
	public void test1() {
		assertEquals(true, CheckForAnagrams.isAnagram("cristian", "Cristina"));
	}

	@Test
	public void test2() {
		assertEquals(true, CheckForAnagrams.isAnagram("Dave Barry", "Ray Adverb"));
	}

	@Test
	public void test3() {
		assertEquals(false, CheckForAnagrams.isAnagram("Nope", "Note"));
	}

	@Test
	public void test4() {
		assertEquals(false, CheckForAnagrams.isAnagram("Apple", "Appeal"));
	}

    @Test
    public void test5() {
        assertEquals(false, CheckForAnagrams.isAnagram("ad", "bc"));
    }
   

}
