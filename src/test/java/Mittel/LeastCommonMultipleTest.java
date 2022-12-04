package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.LeastCommonMultiple;

public class LeastCommonMultipleTest {
    @Test
    public void test1() {
      assertEquals(18, LeastCommonMultiple.lcm(9, 18));
    }
      
      @Test
    public void test2() {
      assertEquals(40, LeastCommonMultiple.lcm(8, 5));
    }
      
      @Test
    public void test3() {
      assertEquals(187, LeastCommonMultiple.lcm(17, 11));
    }
      
      @Test
    public void test4() {
      assertEquals(85, LeastCommonMultiple.lcm(17, 5));
    }
      
      @Test
    public void test5() {
      assertEquals(12, LeastCommonMultiple.lcm(3, 12));
    }
      
      @Test
    public void test6() {
      assertEquals(9, LeastCommonMultiple.lcm(9, 9));
    }
}
