package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.Primorial;

public class PrimorialTest {
    @Test
  public void test1() {
    assertEquals(2, Primorial.primorial(1));
  }

	@Test
  public void test2() {
    assertEquals(6, Primorial.primorial(2));
  }

	@Test
  public void test3() {
    assertEquals(30, Primorial.primorial(3));
  }

	@Test
  public void test4() {
    assertEquals(9699690, Primorial.primorial(8));
  }
}
