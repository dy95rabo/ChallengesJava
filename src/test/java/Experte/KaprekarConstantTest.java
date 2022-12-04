package test.java.Experte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Experte.KaprekarConstant;

public class KaprekarConstantTest {
    @Test
  public void test1() {
    assertEquals(5, KaprekarConstant.kaprekar(1112));
  }
	
	@Test
  public void test2() {
    assertEquals(7, KaprekarConstant.kaprekar(456));
  }
	
	@Test
  public void test3() {
    assertEquals(3, KaprekarConstant.kaprekar(76));
  }
	
	@Test
  public void test4() {
    assertEquals(5, KaprekarConstant.kaprekar(100));
  }
	
	@Test
  public void test5() {
    assertEquals(4, KaprekarConstant.kaprekar(101));
  }
}
