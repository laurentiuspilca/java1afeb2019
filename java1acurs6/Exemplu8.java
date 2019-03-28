public class Exemplu8 {

    public static void main(String [] args) {
        try {
            int x = 10/0;
            System.out.println(x);
        } finally {
            System.out.println("Finally!");
        }
    }
}