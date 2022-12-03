package src.test.java.SehrEinfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.SehrEinfach.IsNumberNegative;

public class IsNumberNegativeTest {


    @Test
    public void test1(){
        assertEquals(false, IsNumberNegative.lessThanOrEqualToZero(5));
    }
  
    @Test
    public void test2(){
        assertEquals(true, IsNumberNegative.lessThanOrEqualToZero(0));
    }
  
    @Test
    public void test3(){
        assertEquals(true, IsNumberNegative.lessThanOrEqualToZero(-5));
    }
  
    @Test
    public void test4(){
        assertEquals(false, IsNumberNegative.lessThanOrEqualToZero(1));
    }
  
    @Test
    public void test5(){
        assertEquals(false, IsNumberNegative.lessThanOrEqualToZero(2));
    }
  
    @Test
    public void test6(){
        assertEquals(false, IsNumberNegative.lessThanOrEqualToZero(10000));
    }
}
