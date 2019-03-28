public class Exemplu7 {
    
    public static void main(String [] args) throws MyException {
        a(-10);
    }

    public static void a(int x) throws MyException {
        if (x < 0) {
            throw new MyException();
        }
        System.out.println("x: " + x);
    }
}