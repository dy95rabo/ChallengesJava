package test.java.SehrEinfach;
import org.junit.Test;
import main.java.SehrEinfach.AreNumbersEqual;

import static org.junit.Assert.assertEquals;

public class AreNumbersEqualTests {

  @Test
  public void test1() {
    assertEquals(true, AreNumbersEqual.isEqual(2, 2));
  }
	
	@Test
  public void test2() {
    assertEquals(true, AreNumbersEqual.isEqual(88, 88));
  }
	
	@Test
  public void test3() {
    assertEquals(false, AreNumbersEqual.isEqual(36, 35));
  }
	
	@Test
  public void test4() {
    assertEquals(true, AreNumbersEqual.isEqual(1, 1));
  }
	
	@Test
  public void test5() {
    assertEquals(false, AreNumbersEqual.isEqual(5, 6));
  }
}
