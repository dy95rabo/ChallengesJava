package test.java.Einfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Einfach.FizzBuzz;

public class FizzBuzzTest {
    @Test
  public void test1() {
	assertEquals(FizzBuzz.fizzBuzz(3), "Fizz");
  }
  @Test
  public void test2() {
	assertEquals(FizzBuzz.fizzBuzz(5), "Buzz");
  }
  @Test
  public void test3() {
	assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz");
  }
  @Test
  public void test4() {
	assertEquals(FizzBuzz.fizzBuzz(10), "Buzz");
  }
  @Test
  public void test5() {
	assertEquals(FizzBuzz.fizzBuzz(98), "98");
  }
}
