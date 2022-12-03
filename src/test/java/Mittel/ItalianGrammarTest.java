package src.test.java.Mittel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.main.java.Mittel.ItalianGrammar;

public class ItalianGrammarTest {
  @Test
  public void test1() {
    System.out.println("We edabit :-)");
    assertEquals("Noi edabittiamo", ItalianGrammar.conjugate("edabittare", 4));
  }

  @Test
  public void test2() {
    System.out.println("You code");
    assertEquals("Voi programmate", ItalianGrammar.conjugate("programmare", 5));
  }

  @Test
  public void test3() {
    System.out.println("You start");
    assertEquals("Tu inizi", ItalianGrammar.conjugate("iniziare", 2));
  }

  @Test
  public void test4() {
    System.out.println("We miss");
    assertEquals("Noi manchiamo", ItalianGrammar.conjugate("mancare", 4));
  }

  @Test
  public void test5() {
    System.out.println("I speak");
    assertEquals("Io parlo", ItalianGrammar.conjugate("parlare", 1));
  }

  @Test
  public void test6() {
    System.out.println("He dreams");
    assertEquals("Egli sogna", ItalianGrammar.conjugate("sognare", 3));
  }

  @Test
  public void test7() {
    System.out.println("You deny");
    assertEquals("Tu neghi", ItalianGrammar.conjugate("negare", 2));
  }

  @Test
  public void test8() {
    System.out.println("You teach");
    assertEquals("Voi insegnate", ItalianGrammar.conjugate("insegnare", 5));
  }

  @Test
  public void test9() {
    System.out.println("We cut");
    assertEquals("Noi tagliamo", ItalianGrammar.conjugate("tagliare", 4));
  }

  @Test
  public void test10() {
    System.out.println("I swim");
    assertEquals("Io nuoto", ItalianGrammar.conjugate("nuotare", 1));
  }

  @Test
  public void test11() {
    System.out.println("He changes");
    assertEquals("Egli cambia", ItalianGrammar.conjugate("cambiare", 3));
  }
}
