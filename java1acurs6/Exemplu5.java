public class Exemplu5 {

    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        sb.append("World"); // HelloWorld
        sb.reverse(); // dlroWolleH
        sb.delete(1,3); // doWolleH
        sb.insert(1, "AAA"); // dAAAoWolleH
        sb.replace(1,3,"BBB"); // dBBBAoWolleH
        
        String a = "Hello";
        StringBuilder b = new StringBuilder("Hello");
        String c = b.toString();
        
        a.concat("World");
        b.append("World");
        
        System.out.println(a); // Hello
        System.out.println(b); // HelloWorld
    }
}