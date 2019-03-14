public class Exemplu3 {

    public static void main(String [] args) {
        Girafa g = new Girafa();
        
        Animal a1 = new Girafa();
        Animal a2 = new Crocodil();
        Animal a3 = new Pantera();
        Animal a4 = new Mamifer();
        
        Mamifer m1 = new Pantera();
        
        m(new Crocodil());
        m(new Pantera());
        
    }
    
    public static void m(Animal a4) {
        if (a4 instanceof Crocodil) {
            // ...
        }
    }
}