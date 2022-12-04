package test.java.Mittel;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.java.Mittel.SquarePatch;

public class SquarePatchTest {
    @Test 
	public void test1() {
		assertArrayEquals(SquarePatch.squarePatch(3), new int[][] {
			{3, 3, 3},
			{3, 3, 3},
			{3, 3, 3}
		});
	}
	
	@Test 
	public void test2() {
		assertArrayEquals(SquarePatch.squarePatch(2), new int[][] {
			{2, 2},
			{2, 2}
		});
	}
	
	@Test 
	public void test3() {
		assertArrayEquals(SquarePatch.squarePatch(4), new int[][] {
			{4, 4, 4, 4},
			{4, 4, 4, 4},
			{4, 4, 4, 4},
			{4, 4, 4, 4}
		});
	}
	
	@Test 
	public void test4() {
		assertArrayEquals(SquarePatch.squarePatch(6), new int[][] {
			{6, 6, 6, 6, 6, 6},
			{6, 6, 6, 6, 6, 6},
			{6, 6, 6, 6, 6, 6},
			{6, 6, 6, 6, 6, 6},
			{6, 6, 6, 6, 6, 6},
			{6, 6, 6, 6, 6, 6}
		});
	}
	
	@Test 
	public void test5() {
		assertArrayEquals(SquarePatch.squarePatch(5), new int[][] {
			{5, 5, 5, 5, 5},
			{5, 5, 5, 5, 5},
			{5, 5, 5, 5, 5},
			{5, 5, 5, 5, 5},
			{5, 5, 5, 5, 5}
		});
	}
	
	@Test 
	public void test6() {
		assertArrayEquals(SquarePatch.squarePatch(1), new int[][]{{1}});
	}
	
	@Test 
	public void test7() {
		assertArrayEquals(SquarePatch.squarePatch(0), new int[][]{});
	}
}
