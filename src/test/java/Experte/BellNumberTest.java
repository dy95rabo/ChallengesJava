package test.java.Experte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Experte.BellNumber;

public class BellNumberTest {
    @Test
  public void test1() {
    assertEquals(1, BellNumber.bell(1));
  }
	
	@Test
  public void test2() {
    assertEquals(2, BellNumber.bell(2));
  }
	
	@Test
  public void test3() {
    assertEquals(5, BellNumber.bell(3));
  }
	
	@Test
  public void test4() {
    assertEquals(15, BellNumber.bell(4));
  }
	
	@Test
  public void test5() {
    assertEquals(52, BellNumber.bell(5));
  }
	
	@Test
  public void test6() {
    assertEquals(203, BellNumber.bell(6));
  }
}
