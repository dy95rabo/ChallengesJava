package test.java.Experte;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Experte.SherlocksValidString;

public class SherlocksValidStringTest {
    @Test
    public void test1() {
        assertEquals(SherlocksValidString.isValid("aabbccddeefghi"), "NO");
    }
    @Test
    public void test2() {
        assertEquals(SherlocksValidString.isValid("aabbcd"), "NO");           
    }
    @Test
    public void test3() {
        assertEquals(SherlocksValidString.isValid("abcdefghhgfedecba"), "YES");           
    } 
    @Test
    public void test4() {
        assertEquals(SherlocksValidString.isValid("abc"), "YES");           
    }      
    @Test
    public void test5() {
        assertEquals(SherlocksValidString.isValid("abcc"), "YES");            
    } 
    @Test
    public void test6() {
        assertEquals(SherlocksValidString.isValid("abccc"), "NO");            
    }   
}
