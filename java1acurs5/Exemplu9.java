public class Exemplu9 {

    public static void main(String [] args) {
        int a = 2;
        a = 3;
        Predicat p1 = x -> x % 2 == 0;
        
        
        Predicat p2 = x -> {
            return x % 2 == 0;
        };
    }
}