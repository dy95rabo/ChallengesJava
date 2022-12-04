package test.java.SehrEinfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.SehrEinfach.ArrayIndexing;

public class ArrayIndexingTest {
    @Test
	public void test01() { 
		assertEquals(6, ArrayIndexing.valueAt(new int[] {1, 2, 3, 4, 5, 6}, 10 / 2));
	}

	@Test
	public void test02() { 
		assertEquals(4, ArrayIndexing.valueAt(new int[] {1, 2, 3, 4}, 6.535355314 / 2));
	}

	@Test
	public void test03() { 
		assertEquals(1, ArrayIndexing.valueAt(new int[] {1, 2}, 1 / 2));
	}

	@Test
	public void test04() { 
		assertEquals(5, ArrayIndexing.valueAt(new int[] {1, 2, 3, 4, 5, 6}, 8 / 2));
	}

	@Test
	public void test05() { 
		assertEquals(9, ArrayIndexing.valueAt(new int[] {1, 2, 3, 7, 9}, 9 / 2));
	}

	@Test
	public void test06() { 
		assertEquals(12, ArrayIndexing.valueAt(new int[] {1, 2, 3, 4, 5, 6, 8, 10, 12, 14}, 466.6 / 54.4));
	}

	@Test
	public void test07() { 
		assertEquals(13, ArrayIndexing.valueAt(new int[] {1, 2, 3, 4, 5, 7, 9, 11, 13, 15}, 46.6 / 5.4));
	}

	@Test
	public void test08() { 
		assertEquals(17, ArrayIndexing.valueAt(new int[] {0, 2, 4, 6, 8, 10, 11, 13, 15, 17, 19}, 46 / 5));
	}

	@Test
	public void test09() { 
		assertEquals(4, ArrayIndexing.valueAt(new int[] {1, 2, 3, 4, 5, 6}, 6.46654414344 / 2));
	}

	@Test
	public void test10() { 
		assertEquals(18, ArrayIndexing.valueAt(new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, 466.6 / 54.4));
	}
}
