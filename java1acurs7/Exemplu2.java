public class Exemplu2 {

    public static void main(String [] args) {
        new Numar<Integer>(10);
        new Numar<Float>(10f);
        new Numar<Double>(10.5);
        
        
        new Numar<int[]>(new int[10]);
        
        int q1 = Numar.w1(10);
        String q2 = Numar.w1("ABC");
        
        Object q3 = Numar.w2(10);
        Object q4 = Numar.w2("ABC");
        
        int x = 20;
        String y = "ABC";
        
        Numar.w3(10, 30);
        Numar.w3("ABC", "CDWE");
        
        Numar.w4(10, "CDWE");
    }
}