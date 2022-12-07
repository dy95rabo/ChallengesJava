package test.java.SehrSchwer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.SehrSchwer.PalindromicAnagrams;

public class PalindromicAnagramsTest {
    @Test
  public void test1() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("rearcac"));
  }
	
	@Test
  public void test2() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("suhbeusheff"));
  }
	
	@Test
  public void test3() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("palindrome"));
  }
	
	@Test
  public void test4() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("yagnx"));
  }
	
	@Test
  public void test5() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("zgzqxljjp"));
  }
	
	@Test
  public void test6() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("tgmqkpdhnhatoco"));
  }
	
	@Test
  public void test7() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("akyka"));
  }
	
	@Test
  public void test8() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("kjyyrftnbsbq"));
  }
	
	@Test
  public void test9() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("jynmynqhcy"));
  }
	
	@Test
  public void test10() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("hfe"));
  }
	
	@Test
  public void test11() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("noon"));
  }
	
	@Test
  public void test12() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("azmkallbanpu"));
  }
	
	@Test
  public void test13() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("drrede"));
  }
	
	@Test
  public void test14() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("xmhwcocldjdnqvv"));
  }
	
	@Test
  public void test15() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("reparpe"));
  }
	
	@Test
  public void test16() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("jnavz"));
  }
	
	@Test
  public void test17() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("orort"));
  }
	
	@Test
  public void test18() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("mel"));
  }
	
	@Test
  public void test19() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("jdxknf"));
  }
	
	@Test
  public void test20() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("qo"));
  }
	
	@Test
  public void test21() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("neett"));
  }
	
	@Test
  public void test22() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("wow"));
  }
	
	@Test
  public void test23() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("avkkiaapiusuapspiip"));
  }
	
	@Test
  public void test24() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("aann"));
  }
	
	@Test
  public void test25() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("iivcc"));
  }
	
	@Test
  public void test26() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("akyka"));
  }
	
	@Test
  public void test27() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("eelvl"));
  }
	
	@Test
  public void test28() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("damam"));
  }
	
	@Test
  public void test29() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("mmo"));
  }
	
	@Test
  public void test30() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("ge"));
  }
	
	@Test
  public void test31() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("arrad"));
  }
	
	@Test
  public void test32() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("bq"));
  }
	
	@Test
  public void test33() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("djufyllynldw"));
  }
	
	@Test
  public void test34() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("reparpe"));
  }
	
	@Test
  public void test35() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("ttraoor"));
  }
	
	@Test
  public void test36() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("orort"));
  }
	
	@Test
  public void test37() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("asgas"));
  }
	
	@Test
  public void test38() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("t"));
  }
	
	@Test
  public void test39() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("tstsa"));
  }
	
	@Test
  public void test40() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("neett"));
  }
	
	@Test
  public void test41() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("wndnwrkpkihup"));
  }
	@Test
  public void test42() {
    assertEquals(false, PalindromicAnagrams.isPalindromePossible("aaabbb"));
  }
	@Test
  public void test43() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible("aaaabbbb"));
  }
	@Test
  public void test44() {
    assertEquals(true, PalindromicAnagrams.isPalindromePossible(""));
  }

  
}
