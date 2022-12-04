package src.test.java.SehrSchwer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.SehrSchwer.Chapter;

public class ChapterTest {
    @Test
	public void test01() {
		assertEquals("Chapter 2", Chapter.nearestChapter(new Chapter[] {new Chapter("Chapter 1", 1), new Chapter("Chapter 2", 15), new Chapter("Chapter 3", 37)}, 10));
	}
	
	@Test
	public void test02() {
		assertEquals("The End?", Chapter.nearestChapter(new Chapter[] {new Chapter("New Beginnings", 1), new Chapter("Strange Developments", 62), new Chapter("The End?", 194), new Chapter("The True Ending", 460)}, 200));
	}
	
	@Test
	public void test03() {
		assertEquals("Chapter 1b", Chapter.nearestChapter(new Chapter[] {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5)}, 3));
	}
	
	@Test
	public void test04() {
		assertEquals("Chapter 1d", Chapter.nearestChapter(new Chapter[] {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5), new Chapter("Chapter 1c", 50), new Chapter("Chapter 1d", 100)}, 75));
	}
	
	@Test
	public void test05() {
		assertEquals("Chapter 1e", Chapter.nearestChapter(new Chapter[] {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5), new Chapter("Chapter 1c", 50), new Chapter("Chapter 1d", 100), new Chapter("Chapter 1e", 200)}, 150));
	}
	
	@Test
	public void test06() {
		assertEquals("Chapter 1c", Chapter.nearestChapter(new Chapter[] {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5), new Chapter("Chapter 1c", 50), new Chapter("Chapter 1d", 100), new Chapter("Chapter 1e", 200)}, 74));
	}
	
	@Test
	public void test07() {
		assertEquals("Chapter 1f", Chapter.nearestChapter(new Chapter[] {new Chapter("Chapter 1a", 1), new Chapter("Chapter 1b", 5), new Chapter("Chapter 1c", 50), new Chapter("Chapter 1d", 100), new Chapter("Chapter 1e", 200), new Chapter("Chapter 1f", 400)}, 300));
	}
	
	@Test
	public void test08() {
		assertEquals("Chapter Five", Chapter.nearestChapter(new Chapter[] {new Chapter("Chapter Four", 46), new Chapter("Chapter Five", 54)}, 50));
	}
}
