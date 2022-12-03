package src.test.java.SehrEinfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.SehrEinfach.GetSumOfAllElements;

public class GetSumOfAllElementsTest {
    @Test
    public void test1(){
        assertEquals(13, GetSumOfAllElements.arraySum(new int[]{2, 7, 4}));
    }
    @Test
    public void test2(){
        assertEquals(48, GetSumOfAllElements.arraySum(new int[]{45, 3, 0}));
    }
    @Test
    public void test3(){
        assertEquals(105, GetSumOfAllElements.arraySum(new int[]{-2, 84, 23}));
    }
}
