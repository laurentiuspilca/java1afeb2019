public class Exemplu11 {

    public static void main(String [] args) {
        try {
            int x = 10/0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Bau 1!");
        } catch (Exception e) {
            System.out.println("Bau 2!");
        } 
    }
}