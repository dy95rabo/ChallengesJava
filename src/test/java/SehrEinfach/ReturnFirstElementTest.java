package test.java.SehrEinfach;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


import main.java.SehrEinfach.ReturnFirstElement;

public class ReturnFirstElementTest {
    @Test
    public void test1() {
          assertEquals(ReturnFirstElement.getFirstValue(new int[]{1, 2, 3, 4}), 1);
      }
      
      @Test
    public void test2() {
          assertEquals(ReturnFirstElement.getFirstValue(new int[]{2, 4, 6, 8, 10}), 2);
      }
      
      @Test
    public void test3() {
          assertEquals(ReturnFirstElement.getFirstValue(new int[]{1, 3, 5, 7, 9}), 1);
      }
      
      @Test
    public void test4() {
          assertEquals(ReturnFirstElement.getFirstValue(new int[]{5, 7, 11, 25, 100, 200, 350}), 5);
      }
      
      @Test
    public void test5() {
          assertEquals(ReturnFirstElement.getFirstValue(new int[]{-5, 7, 200, 350}), -5);
      }
}
