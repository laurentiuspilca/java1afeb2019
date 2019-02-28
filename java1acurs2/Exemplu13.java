public class Exemplu13 {

    public static void main(String [] args) {
        Cont c1 = new Cont("Bill", 1000);
        
        c1.depune(200);
        c1.retrage(300);
        
        System.out.println(c1.sold);
    }
}