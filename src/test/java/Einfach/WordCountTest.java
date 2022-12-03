package src.test.java.Einfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.Einfach.WordCount;

public class WordCountTest {
    @Test
	public void test1() {
		assertEquals(3, WordCount.countWords("It's high noon"));
	}

	@Test
	public void test2() {
		assertEquals(4, WordCount.countWords("Is this easy mode"));
	}

	@Test
	public void test3() {
		assertEquals(5, WordCount.countWords("What an easy task, right"));
	}

	@Test
	public void test4() {
		assertEquals(4, WordCount.countWords("This is a test"));
	}

	@Test
	public void test5() {
		assertEquals(6, WordCount.countWords("Just an example here move along"));
	}

	@Test
	public void test6() {
		assertEquals(4, WordCount.countWords("How are you today?"));
	}
}
