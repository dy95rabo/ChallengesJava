package test.java.Schwer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Schwer.ReverseOddLengtWords;

public class ReverseOddLengtWordsTest {
    @Test
  public void test1() {
    assertEquals("enO owt eerht four", ReverseOddLengtWords.reverseOdd("One two three four"));
  }
	
	@Test
  public void test2() {
    assertEquals("Make sure you only reverse words of odd length", ReverseOddLengtWords.reverseOdd("Make sure uoy only esrever sdrow of ddo length"));
  }
	
	@Test
  public void test3() {
		System.out.println("Should work with empty string.");
    assertEquals("", ReverseOddLengtWords.reverseOdd(""));
  }
	
	@Test
  public void test4() {
		System.out.println("Should work with only one word.");
    assertEquals("sananaB", ReverseOddLengtWords.reverseOdd("Bananas"));
  }
	
	@Test
  public void test5() {
    assertEquals("Even even even even even even even even even", ReverseOddLengtWords.reverseOdd("Even even even even even even even even even"));
  }
	
	@Test
  public void test6() {
    assertEquals("ddO ddo ddo ddo ddo ddo ddo ddo ddo ddo ddo", ReverseOddLengtWords.reverseOdd("Odd odd odd odd odd odd odd odd odd odd odd"));
  }
}
