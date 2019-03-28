public class Exemplu9 {

    public static void main(String [] args) {
        int x = m();
        System.out.println(x); // 10
    }
    
    public static int m() {
        try {
            return 5;
        } finally {
            return 10;
        }
    }
}