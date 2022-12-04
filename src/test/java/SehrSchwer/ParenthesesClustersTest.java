package src.test.java.SehrSchwer;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import src.main.java.SehrSchwer.ParenthesesClusters;

public class ParenthesesClustersTest {

    @Test
    public void test1() {
        assertArrayEquals(ParenthesesClusters.split("()()()"), new String[] { "()", "()", "()" });
    }

    @Test
    public void test2() {
        assertArrayEquals(ParenthesesClusters.split(""), new String[] {});
    }

    @Test
    public void test3() {
        assertArrayEquals(ParenthesesClusters.split("()()(())"), new String[] { "()", "()", "(())" });
    }

    @Test
    public void test4() {
        assertArrayEquals(ParenthesesClusters.split("(())(())"), new String[] { "(())", "(())" });
    }

    @Test
    public void test5() {
        assertArrayEquals(ParenthesesClusters.split("((()))"), new String[] { "((()))" });
    }

    @Test
    public void test6() {
        assertArrayEquals(ParenthesesClusters.split("()(((((((((())))))))))"),
                new String[] { "()", "(((((((((())))))))))" });
    }

    @Test
    public void test7() {
        assertArrayEquals(ParenthesesClusters.split("((())()(()))(()(())())(()())"),
                new String[] { "((())()(()))", "(()(())())", "(()())" });
    }

    @Test
    public void test8() {
        assertArrayEquals(ParenthesesClusters.split("((()))(())()()(()())"),
                new String[] { "((()))", "(())", "()", "()", "(()())" });
    }

    @Test
    public void test9() {
        assertArrayEquals(ParenthesesClusters.split("((())())(()(()()))"), new String[] { "((())())", "(()(()()))" });
    }

    @Test
    public void test10() {
        assertArrayEquals(ParenthesesClusters.split("(()(()()))()(((()))()(()))(()((()))(())())"),
                new String[] { "(()(()()))", "()", "(((()))()(()))", "(()((()))(())())" });
    }
}
