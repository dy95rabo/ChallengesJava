package test.java.SehrSchwer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.SehrSchwer.DifferenceCypher;

public class DifferenceCypherTest {
    @Test
  public void test1() {
    assertArrayEquals(DifferenceCypher.encrypt("?"), new int[]{63});            
  }
	
  @Test
  public void test2() {
    assertEquals("The neighbours are strange..", DifferenceCypher.decrypt(new int[]{84, 20,  -3,  -69,  78,  -9,  4,  -2,  1,  -6,  13,  6,  -3,  1,  -83,  65,  17,  -13,  -69,  83,  1,  -2,  -17,  13,  -7,  -2,  -55,  0}));
  }
	
  @Test
  public void test3() {
    assertArrayEquals(DifferenceCypher.encrypt("It's a secret!"), new int[]{73, 43, -77, 76, -83, 65, -65, 83, -14, -2, 15, -13, 15, -83});  
  }
	
  @Test
  public void test4() {
    assertEquals("OK", DifferenceCypher.decrypt(new int[]{79, -4 }));
  }
	
  @Test
  public void test5() {
    assertEquals("Tomorrow, 3 pm in the garden.", DifferenceCypher.decrypt(new int[]{84, 27,  -2,  2,  3,  0,  -3,  8,  -75,  -12,  19,  -19,  80,  -3,  -77,  73,  5,  -78,  84,  -12,  -3,  -69,  71,  -6,  17,  -14,  1,  9,  -64 }));
  }
	
  @Test
  public void test6() {
    assertArrayEquals(DifferenceCypher.encrypt("Sunshine"), new int[]{83, 34, -7, 5, -11, 1, 5, -9});        
  }
  @Test
  public void test7() {
    assertEquals("Hello World!", DifferenceCypher.decrypt(DifferenceCypher.encrypt("Hello World!")));        
  }
  @Test
  public void test8() {
    assertArrayEquals(DifferenceCypher.encrypt(DifferenceCypher.decrypt(new int[]{83, 34, -7, 5, -11, 1, 5, -9})), new int[]{83, 34, -7, 5, -11, 1, 5, -9});        
  }
}
