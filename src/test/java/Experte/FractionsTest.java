package test.java.Experte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Experte.Fractions;

public class FractionsTest {
    @Test
  public void test1() {
    assertEquals("1/11", Fractions.fractions("0.(09)"));
  }
	
	@Test
  public void test2() {
    assertEquals("1/22", Fractions.fractions("0.0(45)"));
  }
	
	@Test
  public void test3() {
    assertEquals("10646/4995", Fractions.fractions("2.1(313)"));
  }
	
	@Test
  public void test4() {
    assertEquals("1/48", Fractions.fractions("0.0208(3)"));
  }
	
	@Test
  public void test5() {
    assertEquals("404111/33333", Fractions.fractions("12.(12345)"));
  }
	
	@Test
  public void test6() {
    assertEquals("57/56", Fractions.fractions("1.017(857142)"));
  }
	
	@Test
  public void test7() {
    assertEquals("1/19", Fractions.fractions("0.(052631578947368421)"));
  }
}
