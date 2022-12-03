package src.test.java.SehrEinfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.main.java.SehrEinfach.RectanglePerimeter;

public class RectanglePerimeterTest {
    @Test
    public void test1() {
        assertEquals(26, RectanglePerimeter.findPerimeter(6, 7));
    }

    @Test
    public void test2() {
        assertEquals(60, RectanglePerimeter.findPerimeter(20, 10));
    }

    @Test
    public void test3() {
        assertEquals(22, RectanglePerimeter.findPerimeter(2, 9));
    }
}
