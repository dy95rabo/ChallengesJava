package test.java.Einfach;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.java.Einfach.TwoSum;

public class TwoSumTest {
    @Test
    public void test01() {
        assertArrayEquals(new int[]{0,1}, TwoSum.twoSum(new int[]{2,7,11,15}, 9));
    }
    @Test
    public void test02() {
        assertArrayEquals(new int[]{1,2}, TwoSum.twoSum(new int[]{3,2,4}, 6));
    }
    @Test
    public void test03() {
        assertArrayEquals(new int[]{0,1}, TwoSum.twoSum(new int[]{3,3}, 6));
    }
    @Test
    public void test04() {
        assertArrayEquals(new int[]{0,1}, TwoSum.twoSum(new int[]{3,3}, 6));
    }
}
