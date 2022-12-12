package test.java.Experte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Experte.NextLargerNumber;

public class NextLargerNumberTest {
    @Test
  public void test1() {
    assertEquals(7, NextLargerNumber.nextNumber(7));
  }
	
	@Test
  public void test2() {
    assertEquals(91, NextLargerNumber.nextNumber(19));
  }
	
	@Test
  public void test3() {
    assertEquals(271, NextLargerNumber.nextNumber(217));
  }
	
	@Test
  public void test4() {
    assertEquals(989, NextLargerNumber.nextNumber(899));
  }
	
	@Test
  public void test5() {
    assertEquals(998, NextLargerNumber.nextNumber(989));
  }
	
	@Test
  public void test6() {
    assertEquals(1151, NextLargerNumber.nextNumber(1115));
  }
	
	@Test
  public void test7() {
    assertEquals(2354, NextLargerNumber.nextNumber(2345));
  }
	
	@Test
  public void test8() {
    assertEquals(4235, NextLargerNumber.nextNumber(3542));
  }
	
	@Test
  public void test9() {
    assertEquals(5432, NextLargerNumber.nextNumber(5432));
  }
	
	@Test
  public void test10() {
    assertEquals(57821, NextLargerNumber.nextNumber(57812));
  }
	
	@Test
  public void test11() {
    assertEquals(57281, NextLargerNumber.nextNumber(57218));
  }
	
	@Test
  public void test12() {
    assertEquals(59348, NextLargerNumber.nextNumber(58943));
  }
	
	@Test
  public void test13() {
    assertEquals(97410, NextLargerNumber.nextNumber(97410));
  }
	
	@Test
  public void test14() {
    assertEquals(718329, NextLargerNumber.nextNumber(718293));
  }
	
	@Test
  public void test15() {
    assertEquals(619128, NextLargerNumber.nextNumber(618921));
  }
	
	@Test
  public void test16() {
    assertEquals(972346, NextLargerNumber.nextNumber(967432));
  }
	
	@Test
  public void test17() {
    assertEquals(890142, NextLargerNumber.nextNumber(890124));
  }
	
	@Test
  public void test18() {
    assertEquals(9321354, NextLargerNumber.nextNumber(9321345));
  }
	
	@Test
  public void test19() {
    assertEquals(219034576, NextLargerNumber.nextNumber(219034567));
  }
	
	@Test
  public void test20() {
    assertEquals(231456789, NextLargerNumber.nextNumber(219876543));
  }
}
