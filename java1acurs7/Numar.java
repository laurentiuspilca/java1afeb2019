public class Numar<N extends Number> {
    
    private N valoare;
    
    public Numar(N valoare) {
        this.valoare = valoare;
    }
    
    public N m(N n) {
        return n;
    }
    
    static <A> A w1(A n) {
        return n;
    }
    
    static Object w2(Object n) {
        return n;
    }
    
    static <A> void w3(A a1, A a2) {
    }
    
    static void w4(Object a1, Object a2) {
    }
    
}