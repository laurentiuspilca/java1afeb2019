public class Exemplu10 {

    public static void main(String [] args) {
        I1<String> i1 = new C1<Integer, String>();
        
        I2<Integer, ?> i2 = new C2<String, Integer>();
    }
}