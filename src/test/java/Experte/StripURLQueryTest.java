package test.java.Experte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Experte.StripURLQuery;

public class StripURLQueryTest {
  @Test
  public void test1() {
    assertEquals("https://edabit.com?a=2&b=2",
        StripURLQuery.stripUrlParams("https://edabit.com?a=1&b=2&a=2", null));
  }

  @Test
  public void test2() {
    assertEquals("https://edabit.com?a=2",
        StripURLQuery.stripUrlParams("https://edabit.com?a=1&b=2&a=2", new String[] { "b" }));
  }

  @Test
  public void test3() {
    assertEquals("https://edabit.com",
        StripURLQuery.stripUrlParams("https://edabit.com", new String[] { "b" }));
  }

  @Test
  public void test4() {
    assertEquals("https://edabit.com?a=1&b=2",
        StripURLQuery.stripUrlParams("https://edabit.com?a=1&b=2", null));
  }

  @Test
  public void test5() {
    assertEquals("https://edabit.com?a=1&b=2",
        StripURLQuery.stripUrlParams("https://edabit.com?a=1&b=2", new String[] { "c" }));
  }

  @Test
  public void test6() {
    assertEquals("https://edabit.com?b=2&c=3",
        StripURLQuery.stripUrlParams("https://edabit.com?a=1&b=2&c=3&d=4", new String[] { "a", "d" }));
  }

  @Test
  public void test7() {
    assertEquals("https://edabit.com?b=2&c=5",
        StripURLQuery.stripUrlParams("https://edabit.com?a=1&b=2&c=3&d=4&c=5", new String[] { "a", "d" }));
  }
}
