public class Exemplu8 {

    public static void main(String [] args) {
        
        Predicat p1 = x -> x % 2 == 0;
        boolean b1 = p1.test(10); // true
        
        
        Predicat p2 = (x) -> x % 2 == 0;
        Predicat p3 = (int x) -> x % 2 == 0;
        
        Operatie o1 = (x,y) -> x + y;
        Operatie o2 = (int x, int y) -> x + y;
    }
}