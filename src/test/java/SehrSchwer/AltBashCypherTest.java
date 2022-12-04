package test.java.SehrSchwer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.SehrSchwer.AltBashCypher;

public class AltBashCypherTest {
    @Test
    public void test1() {
        assertEquals("zyxwvutsrqponmlkjihgfedcba", AltBashCypher.atbash("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test2() {
        assertEquals("ZYXWVUTSRQPONMLKJIHGFEDCBA", AltBashCypher.atbash("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void test3() {
        assertEquals("Gsv dliw 'zgyzhs' wvirevh uiln gsv gsv urihg zmw ozhg 2 ovggvih lu gsv Svyivd zokszyvg.",
                AltBashCypher.atbash(
                        "The word 'atbash' derives from the the first and last 2 letters of the Hebrew alphabet."));
    }

    @Test
    public void test4() {
        assertEquals("Encryption and decryption are identical for the Atbash cipher.",
                AltBashCypher.atbash("Vmxibkgrlm zmw wvxibkgrlm ziv rwvmgrxzo uli gsv Zgyzhs xrksvi."));
    }

    @Test
    public void test5() {
        assertEquals("Encryption and decryption are identical for the Atbash cipher.",
                AltBashCypher.atbash(AltBashCypher.atbash("Encryption and decryption are identical for the Atbash cipher.")));
    }
}
