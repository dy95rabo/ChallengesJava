package src.test.java.SehrEinfach;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.main.java.SehrEinfach.ReturnFirstAndLastElements;

public class ReturnFirstAndLastElementsTest {
    @Test 
	public void test1() {
		assertArrayEquals(ReturnFirstAndLastElements.firstLast(new String[]{"undefined", "6", "hello", "null"}),new String[]{"undefined", "null"});
	}
	
	@Test 
	public void test2() {
		assertArrayEquals(ReturnFirstAndLastElements.firstLast(new String[]{"hello", "edabit", "dot", "com"}),new String[]{"hello", "com"});
	}
	
	@Test 
	public void test3() {
		assertArrayEquals(ReturnFirstAndLastElements.firstLast(new String[]{"one", "two"}),new String[]{"one", "two"});
	}
}
