package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.ConvertStringToCamelCase;

public class ConvertStringToCamelCaseTest {
    @Test
  public void test1() {
    assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase("the_stealth_warrior"));
  }
	
	@Test
  public void test2() {
    assertEquals("TheStealthWarrior", ConvertStringToCamelCase.toCamelCase("The-Stealth-Warrior"));
  }
	
	@Test
  public void test3() {
    assertEquals("ABC", ConvertStringToCamelCase.toCamelCase("A-B-C"));
  }
	
	@Test
  public void test4() {
    assertEquals("", ConvertStringToCamelCase.toCamelCase(""));
  }
}
