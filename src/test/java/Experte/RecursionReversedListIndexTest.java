package test.java.Experte;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.java.Experte.RecursionReversedListIndex;

public class RecursionReversedListIndexTest {
    @Test
	public void test01() { 
		assertArrayEquals(new Object[]{"E","A","I"}, RecursionReversedListIndex.getItemsAt(new Object[]{"E","D","A","B","I","T"}, "even"));
	}

	@Test
	public void test02() { 
		assertArrayEquals(new Object[]{"D","B","T"}, RecursionReversedListIndex.getItemsAt(new Object[]{"E","D","A","B","I","T"}, "odd"));
	}

	@Test
	public void test03() { 
		assertArrayEquals(new Object[]{"Q","E","T","U","O"}, RecursionReversedListIndex.getItemsAt(new Object[]{"Q","W","E","R","T","Y","U","I","O","P"}, "even"));
	}

	@Test
	public void test04() { 
		assertArrayEquals(new Object[]{"O","U","T","E","Q"}, RecursionReversedListIndex.getItemsAt(new Object[]{"P","O","I","U","Y","T","R","E","W","Q"}, "odd"));
	}

	@Test
	public void test05() { 
		assertArrayEquals(new Object[]{"S","F","H","K","Z"}, RecursionReversedListIndex.getItemsAt(new Object[]{"A","S","D","F","G","H","J","K","L","Z"}, "odd"));
	}

	@Test
	public void test06() { 
		assertArrayEquals(new Object[]{"A","D","G","J","L"}, RecursionReversedListIndex.getItemsAt(new Object[]{"A","S","D","F","G","H","J","K","L","Z"}, "even"));
	}

	@Test
	public void test07() { 
		assertArrayEquals(new Object[]{4,8}, RecursionReversedListIndex.getItemsAt(new Object[]{2,4,6,8,10}, "even"));
	}

	@Test
	public void test08() { 
		assertArrayEquals(new Object[]{2,4,6,8,10}, RecursionReversedListIndex.getItemsAt(new Object[]{1,2,3,4,5,6,7,8,9,10}, "odd"));
	}

	@Test
	public void test09() { 
		assertArrayEquals(new Object[]{"@","$","^","*",")","}"}, RecursionReversedListIndex.getItemsAt(new Object[]{"!","@","#","$","%","^","&","*","(",")","{","}"}, "odd"));
	}

	@Test
	public void test10() { 
		assertArrayEquals(new Object[]{"{","(","&","%","#","!"}, RecursionReversedListIndex.getItemsAt(new Object[]{"}","{",")","(","*","&","^","%","$","#","@","!"}, "odd"));
	}

	@Test
	public void test11() { 
		assertArrayEquals(new Object[]{"O","B","T","Y"}, RecursionReversedListIndex.getItemsAt(new Object[]{"O","R","B","I","T","L","Y"}, "odd"));
	}

	@Test
	public void test12() { 
		assertArrayEquals(new Object[]{"R","I","R","R","L"}, RecursionReversedListIndex.getItemsAt(new Object[]{"A","R","B","I","T","R","A","R","I","L","Y"}, "even"));
	}
}
