package src.test.java.SehrEinfach;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.main.java.SehrEinfach.PairManagement;

public class PairManagementTest {
    @Test
	public void test01() {
		assertArrayEquals(new int[] {1,2}, PairManagement.makePair(1, 2));
	}

	@Test
	public void test02() {
		assertArrayEquals(new int[] {15,35}, PairManagement.makePair(15, 35));
	}

	@Test
	public void test03() {
		assertArrayEquals(new int[] {20,40}, PairManagement.makePair(20, 40));
	}

	@Test
	public void test04() {
		assertArrayEquals(new int[] {51,21}, PairManagement.makePair(51, 21));
	}

	@Test
	public void test05() {
		assertArrayEquals(new int[] {512124,215}, PairManagement.makePair(512124, 215));
	}

	@Test
	public void test06() {
		assertArrayEquals(new int[] {34345435,678}, PairManagement.makePair(34345435, 678));
	}
}
