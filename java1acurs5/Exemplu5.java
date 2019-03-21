public class Exemplu5 {

    public static void main(String [] args) {
        Masina m = new Masina();
        
        Masina.Motor motor = m.new Motor();
        
        
        motor.run();
        System.out.println(m.x);
        motor.run();
        System.out.println(m.x);
        motor.run();
        System.out.println(m.x);
    }
}