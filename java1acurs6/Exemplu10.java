public class Exemplu10 {

    public static void main(String [] args) {
        try {
            int x = 10/0;
            System.out.println(x);
        } catch (NullPointerException e) {
            System.out.println("Bau 1!");
        } catch (ArithmeticException e) {
            System.out.println("Bau 2!");
        }
    }
}