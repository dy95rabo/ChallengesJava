package test.java.SehrEinfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.SehrEinfach.ReturnLastElement;

public class ReturnLastElementTest {
    @Test
	public void test1() {
		assertEquals(ReturnLastElement.getLastItem(new int[]{1, 2, 3}), 3);
	}
	
	@Test
	public void test2() {
		assertEquals(ReturnLastElement.getLastItem(new int[]{1, 2, 3, 56, 87, 23, 65, 45}), 45);
	}
	
	@Test
	public void test3() {
		assertEquals(ReturnLastElement.getLastItem(new int[]{1}), 1);
	}
}
