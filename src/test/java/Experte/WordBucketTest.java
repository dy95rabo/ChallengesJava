package test.java.Experte;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.java.Experte.WordBucket;

public class WordBucketTest {
    @Test
	public void test1() {
		assertArrayEquals(new String[]{},WordBucket.bucketize("she sells sea shells by the sea", 2));
	}

	@Test
	public void test2() {
		assertArrayEquals(new String[]{}, WordBucket.bucketize("ab bc cd", 1));            
	}

	@Test
	public void test3() {
		assertArrayEquals(new String[]{"she sells", "sea shells", "by the sea"},WordBucket.bucketize("she sells sea shells by the sea", 10));            
	}

	@Test
	public void test4() {
		assertArrayEquals(new String[]{"the", "mouse", "jumped", "over", "the", "cheese"}, WordBucket.bucketize("the mouse jumped over the cheese", 7));            
	}

	@Test
	public void test5() {
		assertArrayEquals(new String[]{"fairy dust coated", "the air"}, WordBucket.bucketize("fairy dust coated the air", 20));            
	}

	@Test
	public void test6() {
		assertArrayEquals(new String[]{"do the", "hokey", "pokey"}, WordBucket.bucketize("do the hokey pokey", 6));            
	}

	@Test
	public void test7() {
		assertArrayEquals(new String[]{"do the hokey", "pokey"}, WordBucket.bucketize("do the hokey pokey", 12));            
	}

	@Test
	public void test8() {
		assertArrayEquals(new String[]{"rich", "magnificent", "trees dotted", "the", "landscape"}, WordBucket.bucketize("rich magnificent trees dotted the landscape", 12));            
	}

	@Test
	public void test9() {
		assertArrayEquals(new String[]{"rich", "magnificent", "trees dotted", "the landscape"}, WordBucket.bucketize("rich magnificent trees dotted the landscape", 15));            
	}

	@Test
	public void test10() {
		assertArrayEquals(new String[]{"rich magnificent", "trees dotted the", "landscape"}, WordBucket.bucketize("rich magnificent trees dotted the landscape", 18));            
	}

	@Test
	public void test11() {
		assertArrayEquals(new String[]{"rich magnificent trees", "dotted the landscape"}, WordBucket.bucketize("rich magnificent trees dotted the landscape", 22));            
	}

	@Test
	public void test12() {
		assertArrayEquals(new String[]{"rich magnificent trees dotted the", "landscape"}, WordBucket.bucketize("rich magnificent trees dotted the landscape", 40));            
	}

	@Test
	public void test13() {
		assertArrayEquals(new String[]{"rich magnificent trees dotted the landscape"}, WordBucket.bucketize("rich magnificent trees dotted the landscape", 43));            
	}

	@Test
	public void test14() {
		assertArrayEquals(new String[]{"beep", "bo bee", "bop", "bee bo", "bo bop"}, WordBucket.bucketize("beep bo bee bop bee bo bo bop", 6));            
	}

	@Test
	public void test15() {
		assertArrayEquals(new String[]{"beep bo", "bee bop", "bee bo bo", "bop"}, WordBucket.bucketize("beep bo bee bop bee bo bo bop", 10));            
	}

	@Test
	public void test16() {
		assertArrayEquals(new String[]{"a b", "c d", "e"}, WordBucket.bucketize("a b c d e", 3));            
	}

	@Test
	public void test17() {
		assertArrayEquals(new String[]{"a", "b", "c", "d", "e"}, WordBucket.bucketize("a b c d e", 2));            
	}

	@Test
	public void test18() {
		assertArrayEquals(new String[]{"a", "b", "c", "d", "e"}, WordBucket.bucketize("a b c d e", 1));            
	}

	@Test
	public void test19() {
		assertArrayEquals(new String[]{"a", "b", "c", "d", "e"}, WordBucket.bucketize("a b c d e", 2));            
	}

	@Test
	public void test20() {
		assertArrayEquals(new String[]{"a", "b", "c", "d", "e"}, WordBucket.bucketize("a b c d e", 1));            
	}
}
