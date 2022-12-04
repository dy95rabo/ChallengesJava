package src.main.java.SehrSchwer;

public class Chapter {
    private String name;
    private int page;

    public Chapter(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }


    /**
     * Nearest Chapter
     * 
     * Create a function that returns which chapter is nearest to the page you're
     * on. If two chapters are equidistant, return the chapter with the higher page
     * number.
     * Examples
     * 
     * nearestChapter(new Chapter[] {
     * new Chapter("Chapter 1", 1),
     * new Chapter("Chapter 2", 15),
     * new Chapter("Chapter 3", 37)
     * }, 10) ➞ "Chapter 2"
     * 
     * nearestChapter(new Chapter[] {
     * new Chapter("New Beginnings", 1),
     * new Chapter("Strange Developments", 62),
     * new Chapter("The End?", 194),
     * new Chapter("The True Ending", 460)
     * }, 200) ➞ "The End?"
     * 
     * nearestChapter(new Chapter[] {
     * new Chapter("Chapter 1a", 1),
     * new Chapter("Chapter 1b", 5)
     * }, 3) ➞ "Chapter 1b"
     * 
     * Notes
     * 
     * All page numbers in the dictionary will be valid integers.
     * Return the higher page number if ever two pages are equidistant (see test
     * case #8).
     * 
     * @param chapter
     * @param page
     * @return
     */
    public static String nearestChapter(Chapter[] chapter, int page) {
      //TODO

























    }
}

