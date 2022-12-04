package src.test.java.Einfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.Einfach.DifferenceMaxMin;

public class DifferenceMaxMinTest {
    @Test 
	public void test1() {
		assertEquals(DifferenceMaxMin.differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91}), 90);
	}
	
	@Test 
	public void test2() {
		assertEquals(DifferenceMaxMin.differenceMaxMin(new int[]{-70, 43, 34, 54, 22}), 124);
	}
	@Test 
	public void test3() {
		assertEquals(DifferenceMaxMin.differenceMaxMin(new int[]{-12345, -54321, 12345, 54321, 22}), 108642);
	}
	@Test 
	public void test4() {
        assertEquals(DifferenceMaxMin.differenceMaxMin(new int[]{8}), 0);
	}
	@Test 
	public void test5() {
        assertEquals(DifferenceMaxMin.differenceMaxMin(new int[]{}), -1);
	}
    @Test 
    public void test6() {
        assertEquals(DifferenceMaxMin.differenceMaxMin(new int[]{1,1,1,1,1,1,1,1,1}), 0);
    }
}
