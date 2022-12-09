package test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.Mittel.KaracaEncryption;

public class KaracaEncryptionTest {
    @Test
  public void test1() {
    assertEquals("0c0r0kaca", KaracaEncryption.encrypt("karaca"));
  }
	
	@Test
  public void test2() {
    assertEquals("k0r3baca", KaracaEncryption.encrypt("burak"));
  }
	
	@Test
  public void test3() {
    assertEquals("0n0n0baca", KaracaEncryption.encrypt("banana"));
  }
	
	@Test
  public void test4() {
    assertEquals("0c0pl0aca", KaracaEncryption.encrypt("alpaca"));
  }
	
	@Test
  public void test5() {
    assertEquals("2ll1haca", KaracaEncryption.encrypt("hello"));
  }
}
