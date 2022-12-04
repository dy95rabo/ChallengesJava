package test.java.SehrEinfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.SehrEinfach.SumOfTwoNumbers;

public class SumOfTwoNumbersTest {
    @Test
    public void test1(){
        int expected = 5;
        int actual = SumOfTwoNumbers.sum(3, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int expected = -9;
        int actual = SumOfTwoNumbers.sum(-3, -6);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int expected = 10;
        int actual = SumOfTwoNumbers.sum(7, 3);
        assertEquals(expected, actual);
    }
}
