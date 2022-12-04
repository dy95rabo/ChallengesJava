package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.QuadraticSolutions;

public class QuadraticSolutionsTest {
    @Test
  public void test1() {
    assertEquals(2, QuadraticSolutions.solutions(1, 0, -1));
  }
	
	@Test
  public void test2() {
    assertEquals(1, QuadraticSolutions.solutions(1, 0, 0));
  }
	
	@Test
  public void test3() {
    assertEquals(0, QuadraticSolutions.solutions(1, 0, 1));
  }
	
	@Test
  public void test4() {
    assertEquals(0, QuadraticSolutions.solutions(200, 420, 800));
  }
	
	@Test
  public void test5() {
    assertEquals(2, QuadraticSolutions.solutions(200, 420, -800));
  }
	
	@Test
  public void test6() {
    assertEquals(2, QuadraticSolutions.solutions(1000, 1000, 0));
  }
	
	@Test
  public void test7() {
    assertEquals(1, QuadraticSolutions.solutions(10000, 400, 4));
  }
}
