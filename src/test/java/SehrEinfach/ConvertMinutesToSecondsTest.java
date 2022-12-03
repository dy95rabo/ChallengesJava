package src.test.java.SehrEinfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.SehrEinfach.ConvertMinutesToSeconds;

public class ConvertMinutesToSecondsTest {
    @Test
  public void test1() {
    assertEquals(360, ConvertMinutesToSeconds.convert(6));
  }
	
	@Test
  public void test2() {
    assertEquals(240, ConvertMinutesToSeconds.convert(4));
  }
	
	@Test
  public void test3() {
    assertEquals(480, ConvertMinutesToSeconds.convert(8));
  }
	
	@Test
  public void test4() {
    assertEquals(3600, ConvertMinutesToSeconds.convert(60));
  }
}
