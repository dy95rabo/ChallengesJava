package test.java.Experte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Experte.AscendingConsecutiveNumbers;

public class AscendingConsecutiveNumbersTest {
    @Test
  public void test1() {
    assertEquals(true, AscendingConsecutiveNumbers.ascending("232425"));
  }
	
	@Test
  public void test2() {
    assertEquals(true, AscendingConsecutiveNumbers.ascending("444445"));
  }
	
	@Test
  public void test3() {
    assertEquals(true, AscendingConsecutiveNumbers.ascending("1234567"));
  }
	
	@Test
  public void test4() {
    assertEquals(true, AscendingConsecutiveNumbers.ascending("123412351236"));
  }
	
	@Test
  public void test5() {
    assertEquals(true, AscendingConsecutiveNumbers.ascending("57585960616263"));
  }
	
	@Test
  public void test6() {
    assertEquals(true, AscendingConsecutiveNumbers.ascending("500001500002500003"));
  }
	
	@Test
  public void test7() {
    assertEquals(true, AscendingConsecutiveNumbers.ascending("919920921"));
  }
	
	@Test
  public void test8() {
    assertEquals(false, AscendingConsecutiveNumbers.ascending("2324256"));
  }
	
	@Test
  public void test9() {
    assertEquals(false, AscendingConsecutiveNumbers.ascending("1235"));
  }
	
	@Test
  public void test10() {
    assertEquals(false, AscendingConsecutiveNumbers.ascending("121316"));
  }
	
	@Test
  public void test11() {
    assertEquals(false, AscendingConsecutiveNumbers.ascending("12131213"));
  }
	
	@Test
  public void test12() {
    assertEquals(false, AscendingConsecutiveNumbers.ascending("54321"));
  }
	
	@Test
  public void test13() {
    assertEquals(false, AscendingConsecutiveNumbers.ascending("56555453"));
  }
	
	@Test
  public void test14() {
    assertEquals(false, AscendingConsecutiveNumbers.ascending("90090190290"));
  }
	
	@Test
  public void test15() {
    assertEquals(false, AscendingConsecutiveNumbers.ascending("35236237238"));
  }
	@Test
  public void test16() {
    assertEquals(true, AscendingConsecutiveNumbers.ascending("9101112"));
  }
	@Test
  public void test17() {
    assertEquals(true, AscendingConsecutiveNumbers.ascending("9899100101"));
  }
}
