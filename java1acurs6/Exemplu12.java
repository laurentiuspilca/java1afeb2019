public class Exemplu12 {

    public static void main(String [] args) {
        int x;
        try {
            x = 10/0;
            System.out.println(x);
        } catch (NullPointerException | ArithmeticException e) {
            x = 20;
            System.out.println("Bau!");
        } finally {
            System.out.println("Finally");
        }
    }
}