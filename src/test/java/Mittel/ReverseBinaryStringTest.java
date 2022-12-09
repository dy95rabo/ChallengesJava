package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.ReverseBinaryString;

public class ReverseBinaryStringTest {
    @Test
  public void test1() {
    assertEquals(1, ReverseBinaryString.reversedBinaryInteger(1));
  }
	
	@Test
  public void test2() {
    assertEquals(1, ReverseBinaryString.reversedBinaryInteger(4));
  }
	
	@Test
  public void test3() {
    assertEquals(5, ReverseBinaryString.reversedBinaryInteger(5));
  }
	
	@Test
  public void test4() {
    assertEquals(31, ReverseBinaryString.reversedBinaryInteger(31));
  }
	
	@Test
  public void test5() {
    assertEquals(37, ReverseBinaryString.reversedBinaryInteger(82));
  }
	
	@Test
  public void test6() {
    assertEquals(45, ReverseBinaryString.reversedBinaryInteger(90));
  }
	
	@Test
  public void test7() {
    assertEquals(255, ReverseBinaryString.reversedBinaryInteger(255));
  }
	
	@Test
  public void test8() {
    assertEquals(251, ReverseBinaryString.reversedBinaryInteger(446));
  }
	
	@Test
  public void test9() {
    assertEquals(391, ReverseBinaryString.reversedBinaryInteger(451));
  }
	
	@Test
  public void test10() {
    assertEquals(377, ReverseBinaryString.reversedBinaryInteger(634));
  }
	
	@Test
  public void test11() {
    assertEquals(67, ReverseBinaryString.reversedBinaryInteger(776));
  }
	
	@Test
  public void test12() {
    assertEquals(263, ReverseBinaryString.reversedBinaryInteger(898));
  }
	
	@Test
  public void test13() {
    assertEquals(1937, ReverseBinaryString.reversedBinaryInteger(1103));
  }
	
	@Test
  public void test14() {
    assertEquals(2487, ReverseBinaryString.reversedBinaryInteger(3801));
  }
	
	@Test
  public void test15() {
    assertEquals(1, ReverseBinaryString.reversedBinaryInteger(4096));
  }
	
	@Test
  public void test16() {
    assertEquals(10017, ReverseBinaryString.reversedBinaryInteger(8505));
  }
	
	@Test
  public void test17() {
    assertEquals(328843, ReverseBinaryString.reversedBinaryInteger(428293));
  }
	
	@Test
  public void test18() {
    assertEquals(904609, ReverseBinaryString.reversedBinaryInteger(547643));
  }
	
	@Test
  public void test19() {
    assertEquals(681385, ReverseBinaryString.reversedBinaryInteger(612965));
  }
	
	@Test
  public void test20() {
    assertEquals(1033263, ReverseBinaryString.reversedBinaryInteger(999999));
  }
}
