public class Exemplu1 {

    public static void main(String [] args) {
        Card c1 = new Card("12345");
        Card c2 = new Card("12345");
        Card c3 = new Card("54321");
        
        boolean b1 = c1 == c2; // false
        boolean b2 = c1.equals(c2); // true
    }
}