package test.java.Einfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Einfach.BasicCalculator;

public class BasicCalculatorTest {
    @Test
  public void test1() {
    assertEquals(1, BasicCalculator.calculator(2, '/', 2));
  }
	
	@Test
  public void test2() {
    assertEquals(3, BasicCalculator.calculator(10, '-', 7));
  }
	
	@Test
  public void test3() {
    assertEquals(32, BasicCalculator.calculator(2, '*', 16));
  }
	
	@Test
  public void test4() {
    assertEquals(0, BasicCalculator.calculator(2, '-', 2));
  }
	
	@Test
  public void test5() {
    assertEquals(41, BasicCalculator.calculator(15, '+', 26));
  }
	
	@Test
  public void test6() {
    assertEquals(4, BasicCalculator.calculator(2, '+', 2));
  }
	
	@Test
  public void test7() {
    assertEquals(0, BasicCalculator.calculator(2, '/', 0));
  }


}
