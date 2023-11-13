// Scrivi un programma Java che abbia un metodo che prenda il carattere in Unicode
// in un indice specifico all'interno di una stringa e lo stampi.
// Il metodo dovrà avere nel costruttore una stringa ed una posizione e dovrà resituire il carattere in unicode o una stringa di errore.
// Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.

package Stringhe2;

public class Main {
    public static void main(String[] args) {
       String stringa = "carosello";
       int posizione = 7;
       char carattere = stringa.charAt(posizione);
       int unicode = (int) carattere;

       StringBuilder builder = new StringBuilder();
        builder.append("Il caraattere alla posizione ")
                .append(posizione)
                .append(" è: ")
                .append(carattere)
                .append("\nIl suo valore Unicode è: ")
                .append(unicode)
                .append(Integer.toHexString(carattere));


       System.out.println(builder.toString());

    }
}