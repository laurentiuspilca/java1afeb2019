public class Exemplu14 {

    public static void main(String [] args) {
        Cont c1 = new Cont("Bill", 1000);
        Cont c2 = new Cont("John", 1500);
        
        c1.transfera(c2, 300);
        
        System.out.println(c1.sold);
        System.out.println(c2.sold);
    }
}