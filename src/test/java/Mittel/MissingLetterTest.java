package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static main.java.Mittel.MissingLetter.missingLetter;

public class MissingLetterTest {
    @Test
  public void test1() {
		System.out.println("Example #1");
    assertEquals("c", missingLetter("abdefg"));
  }
	
	@Test
  public void test2() {
		System.out.println("Example #2");
    assertEquals("r", missingLetter("mnopqs"));
  }
	
	@Test
  public void test3() {
		System.out.println("Example #3");
    assertEquals("w", missingLetter("tuvxyz"));
  }
	
	@Test
  public void test4() {
    assertEquals("k", missingLetter("jlm"));
  }
	
	@Test
  public void test5() {
    assertEquals("t", missingLetter("rsu"));
  }
	
	@Test
  public void test6() {
    assertEquals("f", missingLetter("eghij"));
  }
	
	@Test
  public void test7() {
    assertEquals("s", missingLetter("qrtuv"));
  }
	
	@Test
  public void test8() {
		System.out.println("Example #4");
    assertEquals("No Missing Letter", missingLetter("ghijklmno"));
  }
	
	@Test
  public void test9() {
    assertEquals("No Missing Letter", missingLetter("xyz"));
  }
}
