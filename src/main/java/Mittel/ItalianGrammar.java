
package main.java.Mittel;

public class ItalianGrammar {

    /**
     * Italian Grammar: Present Tense of First Conjugation Verbs
     * 
     * In this challenge, you must build a function that inflects an infinitive
     * regular Italian verb of the first conjugation form to the present tense,
     * including the personal subjective pronoun.
     * 
     * All first conjugation Italian verbs share the same suffix: ARE. The first
     * thing to do is separate the verb root from the suffix.
     * 
     * Root of "programmare" (to code) = "programm".
     * Root of "giocare" (to play) = "gioc".
     * 
     * For each subjective pronoun the root is combined with a new suffix: see table
     * below (pronouns are numbered for coding ease, in real grammar they are
     * grouped in singular and plural, both from first to third):
     * # Pronoun Suffix
     * 1 Io (I) o
     * 2 Tu (You) i
     * 3 Egli (He) a
     * 4 Noi (We) iamo
     * 5 Voi (You) ate
     * 6 Essi (They) ano
     * 
     * Present tense of verb "parlare" (to speak) for third pronoun:
     * Pronoun ("Egli") + Root ("parl") + Suffix ("a") = "Egli parla".
     * Present tense of verb "lavorare" (to work) for fourth pronoun:
     * Pronoun ("Noi") + Root ("lavor") + Suffix ("iamo") = "Noi lavoriamo".
     * 
     * There are two exceptions for present tense inflection:
     * 
     * If root ends with "c" or "g" the second and fourth pronoun suffixes add a "h"
     * at the start:
     * "Attaccare" (to attack) = "Tu attacchi" (instead of "Tu attacci")
     * "Legare" (to tie) = "Noi leghiamo" (instead of "Noi legiamo")
     * If root ends with "i" the second and fourth pronoun suffixes lose the
     * starting "i" (so that second pronoun suffix disappears):
     * "Inviare" (to send) = "Noi inviamo" (instead of "Noi inviiamo")
     * "Tagliare" (to cut) = "Tu tagli" (instead of "Tu taglii")
     * "Mangiare" (to eat) = "Noi mangiamo" (instead of "Noi mangiiamo")
     * "Cacciare" (to hunt) = "Tu cacci" (instead of "Tu caccii")
     * 
     * Given a string verb being the infinitive form of the first conjugation
     * Italian regular verb, and an integer pronoun being the subjective personal
     * pronoun, implement a function that returns the inflected form as a string.
     * Examples
     * 
     * conjugate("programmare", 5) ➞ "Voi programmate"
     * 
     * conjugate("iniziare", 2) ➞ "Tu inizi"
     * 
     * conjugate("mancare", 4) ➞ "Noi manchiamo"
     * 
     * Notes
     * 
     * In the returned string, pronouns must be capitalized and verbs must be in
     * lowercase, separated by a space between them.
     * Curious fact: first conjugation (verbs ending in "are") is also called "the
     * living conjugation", because every new verb that enters the Italian
     * dictionary is assigned to this category as a new regular verb; it often
     * happens for verbs "borrowed" from English and for informatical neologisms:
     * chattare, twittare, postare, spammare... will edabittare be the next?
     * 
     * @param verb
     * @param pronoun
     * @return
     */
    public static String conjugate(String verb, int pronoun) {
        //TODO











        








    }
    















    

//     public static void main(String[] args) {
//         String[] words = new String[] {
//                 "edabittare",
//                 "programmare",
//                 "iniziare",
//                 "mancare",
//                 "parlare",
//                 "sognare",
//                 "negare",
//                 "insegnare",
//                 "tagliare",
//                 "nuotare",
//                 "cambiare"
//         };
//         int[] pronouns = new int[] { 4, 5, 2, 4, 1, 3, 2, 5, 4, 1, 3 };
//         String[] solutions = new String[] {
//                 "Noi edabittiamo",
//                 "Voi programmate",
//                 "Tu inizi",
//                 "Noi manchiamo",
//                 "Io parlo",
//                 "Egli sogna",
//                 "Tu neghi",
//                 "Voi insegnate",
//                 "Noi tagliamo",
//                 "Io nuoto",
//                 "Egli cambia"
//         };
//         String[] translation = new String[] {
//                 "We edabit",
//                 "You code",
//                 "You start",
//                 "We miss",
//                 "I speak",
//                 "He dreams",
//                 "You deny",
//                 "You teach",
//                 "We cut",
//                 "I swim",
//                 "He changes"
//         };

//         for (int i = 0; i < solutions.length; i++) {
//             System.out.println("Your solution was: \t\t" + conjugate(words[i], pronouns[i]));
//             System.out.println("The expected solution is: \t" + solutions[i] + "\t\t");
//             System.out.println("The the translation is: \t" + translation[i] + "\t\t");
//             System.out.print("Test " + (i + 1) + " was: \t\t\t");
//             System.out.println((conjugate(words[i], pronouns[i]).equals(solutions[i])) + "\n");

//         }
//     }






    // public static String conjugate(String verb, int pronoun) {
    //     // Solution
    //     String[][] pronounSuffix = new String[][] {
    //             { "Io ", "o" },
    //             { "Tu ", "i" },
    //             { "Egli ", "a" },
    //             { "Noi ", "iamo" },
    //             { "Voi ", "ate" },
    //             { "Essi ", "ano" }
    //     };
    //     String root = verb.substring(0, verb.length() - 3);
    //     return pronounSuffix[pronoun - 1][0] +
    //             (!(pronoun == 2 || pronoun == 4) ? root: (root.endsWith("c") || root.endsWith("g")) ? root + "h"
    //                     : (root.endsWith("i") ? root.substring(0, root.length() - 1) : root))
    //             + pronounSuffix[pronoun - 1][1];

    // }

}
