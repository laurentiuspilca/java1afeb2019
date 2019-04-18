public class Exemplu6 {

    public static void main(String [] args) {
        String a1 = "HELLO";
        StringBuilder a2 = new StringBuilder("HELLO");
        
        a1.concat("WORLD");
        a2.append("WORLD");
        
        System.out.println(a1); // HELLO
        System.out.println(a2); // HELLOWORLD
    }
}