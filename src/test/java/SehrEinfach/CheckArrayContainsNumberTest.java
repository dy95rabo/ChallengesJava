package src.test.java.SehrEinfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.SehrEinfach.CheckArrayContainsNumber;

public class CheckArrayContainsNumberTest {
    @Test
  public void test1() {
    assertEquals(true, CheckArrayContainsNumber.check(new int[]{1, 2, 3, 4, 5}, 3));
  }
	
	@Test
  public void test2() {
    assertEquals(false, CheckArrayContainsNumber.check(new int[]{1, 1, 2, 1, 1}, 3));
  }
	
	@Test
  public void test3() {
    assertEquals(true, CheckArrayContainsNumber.check(new int[]{1, 1, 2, 1, 5, 4, 7}, 7));
  }
	
	@Test
  public void test4() {
    assertEquals(false, CheckArrayContainsNumber.check(new int[]{1, 1, 2, 1, 5, 4, 7}, 8));
  }
	
	@Test
  public void test5() {
    assertEquals(true, CheckArrayContainsNumber.check(new int[]{5, 5, 5, 6}, 5));
  }
	
	@Test
  public void test6() {
    assertEquals(false, CheckArrayContainsNumber.check(new int[]{}, 5));
  }
}
