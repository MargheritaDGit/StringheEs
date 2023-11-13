// Scrivi un programma Java che abbia un metodo che prenda due stringhe e le
// compari lessico-graficamente.
// Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti"
// basandosi sul risultato del confronto.
// Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.

package Stringhe1;

    public class Main {

        public static void main(String[] args) {
            String string1 = "Questo esercizio riuscirò a pusharlo!";
            String string2 = "Questo esercizio è corretto!";

            //public static String confrontStrings String result = confrontStrings(string1, string2);

            String result = confrontStrings(string1,string2); //variabile di tipo stringa che è uguale al risultato di questo metodo che appunto ritorna una stringa

            System.out.println(confrontStrings(string1, string2)); //(result);
        }

        public static String confrontStrings(String string1, String string2) {

            int confront = string1.compareTo(string2);

            StringBuilder result = new StringBuilder("Le due stringhe sono ");

            if (confront == 0) {
                result.append("identical.");
            } else {
                result.append("differenti.");
            }
            return result.toString();
        }
    }
