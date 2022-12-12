package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.SumOfMissingNumbers;

public class SumOfMissingNumbersTest {
    @Test
		public void test1() {
			assertEquals(29, SumOfMissingNumbers.sumMissing(new int[]{1, 3, 5, 7, 10}));
		}
	
		@Test
		public void test2() {
			assertEquals(1575, SumOfMissingNumbers.sumMissing(new int[]{10, 20, 30, 40, 50, 60}));
		}
	
		@Test
		public void test3() {
			assertEquals(40, SumOfMissingNumbers.sumMissing(new int[]{7, 3, 8, 5, 12}));
		}
	
		@Test
		public void test4() {
			assertEquals(4782, SumOfMissingNumbers.sumMissing(new int[]{99, 2, 45, 4, 17}));
		}
	
		@Test
		public void test5() {
			assertEquals(29, SumOfMissingNumbers.sumMissing(new int[]{10, 7, 5, 3, 1}));
		}
	
		@Test
		public void test6() {
			assertEquals(0, SumOfMissingNumbers.sumMissing(new int[]{7, 8, 9, 10}));
		}
        @Test
        public void test7() {
            assertEquals(0, SumOfMissingNumbers.sumMissing(new int[]{7}));
        }
    }
