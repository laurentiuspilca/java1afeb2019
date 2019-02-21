/**
 * Acesta este exemplul 7.
 * Aici discutam despre comentarii
 * Am scris si o expresie cu operatorul ternar
 * 
 * @version 1.0
 * @author Laur
 * 
 */
public class Exemplu7 { // Aici incepe declararea clasei

    /*
     * Aici scriu
     * Un comentariu
     * pe mai multe
     * linii
     */
    public static void main(String [] args) {
        String x = 3 > 6 ? "Hello" : "World";
        
        System.out.println(x);
        
        String y = 3 > 5 ? (3 < 7 ? "A" : "B") : "C";
    }
}