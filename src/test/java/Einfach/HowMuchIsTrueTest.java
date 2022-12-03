package src.test.java.Einfach;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.Einfach.HowMuchIsTrue;

public class HowMuchIsTrueTest {
    @Test
    public void test1() {
        assertEquals(2, HowMuchIsTrue.countTrue(new boolean[] { true, false, false, true, false }));
    }

    @Test
    public void test2() {
        assertEquals(0, HowMuchIsTrue.countTrue(new boolean[] { false, false, false, false }));
    }

    @Test
    public void test3() {
        assertEquals(0, HowMuchIsTrue.countTrue(new boolean[] {}));
    }

    @Test
    public void test4() {
        assertEquals(8, HowMuchIsTrue.countTrue(new boolean[] { false, false, true, true, false, false, false, true,
                true, true, true, false, true, true, false }));
    }

    @Test
    public void test5() {
        assertEquals(3,
                HowMuchIsTrue.countTrue(new boolean[] { true, false, true, true, false, false, false, false, false }));
    }

    @Test
    public void test6() {
        assertEquals(8, HowMuchIsTrue.countTrue(new boolean[] { false, true, true, false, true, true, false, true,
                false, true, false, true, false, true, false }));
    }

    @Test
    public void test7() {
        assertEquals(6, HowMuchIsTrue
                .countTrue(new boolean[] { true, false, true, true, true, false, true, true, false, false }));
    }

    @Test
    public void test8() {
        assertEquals(3, HowMuchIsTrue
                .countTrue(new boolean[] { false, false, false, false, true, false, true, false, true, false, false }));
    }

    @Test
    public void test9() {
        assertEquals(3, HowMuchIsTrue
                .countTrue(new boolean[] { true, false, false, false, true, false, false, true, false, false, false }));
    }

    @Test
    public void test10() {
        assertEquals(4, HowMuchIsTrue
                .countTrue(new boolean[] { true, true, false, true, false, false, false, false, true, false }));
    }

    @Test
    public void test11() {
        assertEquals(9, HowMuchIsTrue.countTrue(new boolean[] { true, false, true, true, false, true, true, true, true,
                false, true, false, true, false }));
    }

    @Test
    public void test12() {
        assertEquals(8, HowMuchIsTrue.countTrue(new boolean[] { true, false, true, true, true, true, false, true, true,
                false, true, false, false, false, false }));
    }

    @Test
    public void test13() {
        assertEquals(6, HowMuchIsTrue.countTrue(
                new boolean[] { true, true, false, false, false, false, true, false, true, true, false, true }));
    }

}
