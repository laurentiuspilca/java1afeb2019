public class Exemplu6 {

    public static void main(String [] args) {
        Card c = new DebitCard();
        c.sold = 1000;
        
        c.retragere(900);
        
        System.out.println(c.sold); // 1000
    }
}