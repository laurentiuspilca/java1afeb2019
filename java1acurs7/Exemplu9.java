public class Exemplu9 {

    public static void main(String [] args) {
        Grup<String, ?, String> g1 = new Grup<String, Object,String>();
        Grup<String, ?, String> g2 = new Grup<String, String, String>();
        Grup<String, ?, String> g3 = new Grup<String, Integer, String>();
        
        Grup<?, ? extends Number, ? super Object> g4 = 
            new Grup<String, Number, Object>();
    }
}