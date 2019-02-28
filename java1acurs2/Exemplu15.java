public class Exemplu15 {

    public static void main(String [] args) {
        Cont c1 = new Cont("Bill", 1000);
        
        boolean b1 = c1.retrage(500);
        boolean b2 = c1.retrage(700);
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(c1.sold);
    }
}